package co.com.sk.servicios.ventayalquiler.receipt;

import co.com.sk.servicios.ventayalquiler.receipt.events.ClientEmailUpdated;
import co.com.sk.servicios.ventayalquiler.receipt.events.PaymentAdded;
import co.com.sk.servicios.ventayalquiler.receipt.events.TypePaymentUpdated;
import co.com.sk.servicios.ventayalquiler.receipt.events.ClientAdded;
import co.com.sk.servicios.ventayalquiler.receipt.events.ClientNameUpdated;
import co.com.sk.servicios.ventayalquiler.receipt.events.ClientPhoneUpdated;
import co.com.sk.servicios.ventayalquiler.receipt.events.ReceiptCreated;
import co.com.sk.servicios.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicios.ventayalquiler.receipt.values.DateReceipt;
import co.com.sk.servicios.ventayalquiler.receipt.values.Email;
import co.com.sk.servicios.ventayalquiler.receipt.values.Name;
import co.com.sk.servicios.ventayalquiler.receipt.values.PaymentId;
import co.com.sk.servicios.ventayalquiler.receipt.values.Phone;
import co.com.sk.servicios.ventayalquiler.receipt.values.ReceiptId;
import co.com.sk.servicios.ventayalquiler.receipt.values.Type;
import co.com.sk.servicios.ventayalquiler.shop.values.ShopId;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

/**
 * Receipt class - Aggregate root
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class Receipt extends AggregateEvent<ReceiptId> {

    protected ShopId shopId;
    protected TrolleyId trolleyId;
    protected Client client;
    protected Payment payment;
    protected DateReceipt date;

    public Receipt(ReceiptId receiptId, ShopId shopId, DateReceipt date) {
        super(receiptId);
        appendChange(new ReceiptCreated(shopId, date)).apply();
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
