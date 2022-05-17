package co.com.sk.servicos.ventayalquiler;

import co.com.sk.servicos.ventayalquiler.events.ClientAdded;
import co.com.sk.servicos.ventayalquiler.events.PaymentAdded;
import co.com.sk.servicos.ventayalquiler.events.ReceiptCreated;
import co.com.sk.servicos.ventayalquiler.events.TypePaymentUpdated;
import co.com.sk.servicos.ventayalquiler.values.ClientId;
import co.com.sk.servicos.ventayalquiler.values.DateReceipt;
import co.com.sk.servicos.ventayalquiler.values.Email;
import co.com.sk.servicos.ventayalquiler.values.Name;
import co.com.sk.servicos.ventayalquiler.values.PaymentId;
import co.com.sk.servicos.ventayalquiler.values.Phone;
import co.com.sk.servicos.ventayalquiler.values.ReceiptId;
import co.com.sk.servicos.ventayalquiler.values.Type;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;


public class Receipt extends AggregateEvent<ReceiptId> {

    //protected Store store;
    //protected ShoppingCar shoppingCar;
    protected Client client;
    protected Payment payment;
    protected DateReceipt date;

    public Receipt(ReceiptId entityId, DateReceipt date) {
        super(entityId);
        appendChange(new ReceiptCreated(date)).apply();
        subscribe(new ReceiptEventChange(this));
    }

    private Receipt(ReceiptId receiptId) {
        super(receiptId);
        subscribe(new ReceiptEventChange(this));
    }

    public static Receipt from(ReceiptId receiptId, List<DomainEvent> events) {
        var receipt = new Receipt(receiptId);
        events.forEach(receipt::applyEvent);
        return receipt;
    }

    public void addClient(Name name, Phone phone, Email email) {
        var clientId = new ClientId("client1");
        appendChange(new ClientAdded(clientId, name, phone, email)).apply();
    }

    public void addPayment(Type type) {
        var paymentId = new PaymentId("payment1");
        appendChange(new PaymentAdded(paymentId, type)).apply();
    }

    public void updateTypePayment(PaymentId paymentId, Type type) {
        appendChange(new TypePaymentUpdated(paymentId, type)).apply();
    }

    public Payment payment() {
        return payment;
    }

    public Client client() {
        return client;
    }

    public DateReceipt date() {
        return date;
    }
}
