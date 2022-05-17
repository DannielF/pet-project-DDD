package co.com.sk.servicos.ventayalquiler.receipt;

import co.com.sk.servicos.ventayalquiler.receipt.events.ClientAdded;
import co.com.sk.servicos.ventayalquiler.receipt.events.ClientEmailUpdated;
import co.com.sk.servicos.ventayalquiler.receipt.events.ClientNameUpdated;
import co.com.sk.servicos.ventayalquiler.receipt.events.ClientPhoneUpdated;
import co.com.sk.servicos.ventayalquiler.receipt.events.PaymentAdded;
import co.com.sk.servicos.ventayalquiler.receipt.events.ReceiptCreated;
import co.com.sk.servicos.ventayalquiler.receipt.events.TypePaymentUpdated;
import co.com.sk.servicos.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicos.ventayalquiler.receipt.values.DateReceipt;
import co.com.sk.servicos.ventayalquiler.receipt.values.Email;
import co.com.sk.servicos.ventayalquiler.receipt.values.Name;
import co.com.sk.servicos.ventayalquiler.receipt.values.PaymentId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Phone;
import co.com.sk.servicos.ventayalquiler.receipt.values.ReceiptId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Type;
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

    public void updateClientName(ClientId clientId, Name name) {
        appendChange(new ClientNameUpdated(clientId, name)).apply();
    }

    public void updateClientPhone(ClientId clientId, Phone phone) {
        appendChange(new ClientPhoneUpdated(clientId, phone)).apply();
    }

    public void updateClientEmail(ClientId clientId, Email email) {
        appendChange(new ClientEmailUpdated(clientId, email)).apply();
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
