package co.com.sk.servicios.ventayalquiler.receipt;

import co.com.sk.servicios.ventayalquiler.receipt.events.ClientEmailUpdated;
import co.com.sk.servicios.ventayalquiler.receipt.events.TypePaymentUpdated;
import co.com.sk.servicios.ventayalquiler.receipt.events.ClientAdded;
import co.com.sk.servicios.ventayalquiler.receipt.events.ClientNameUpdated;
import co.com.sk.servicios.ventayalquiler.receipt.events.ClientPhoneUpdated;
import co.com.sk.servicios.ventayalquiler.receipt.events.PaymentAdded;
import co.com.sk.servicios.ventayalquiler.receipt.events.ReceiptCreated;
import co.com.sofka.domain.generic.EventChange;

/**
 * ReceiptEventChange class - Event change
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class ReceiptEventChange extends EventChange {
    public ReceiptEventChange(Receipt receipt) {
        apply((ReceiptCreated event) -> {
            receipt.shopId = event.shopId();
            receipt.trolleyId = event.trolleyId();
            receipt.date = event.date();
        });

        apply((ClientAdded event) -> {
            var clientId = event.clientId();
            receipt.client = new Client(clientId, event.name(), event.phone(), event.email());
        });

        apply((PaymentAdded event) -> {
            var paymentId = event.paymentId();
            receipt.payment = new Payment(paymentId, event.typePayment());
        });

        apply((TypePaymentUpdated event) -> receipt.payment.updateType(event.typePayment()));

        apply((ClientNameUpdated event) -> receipt.client.updateName(event.name()));

        apply((ClientPhoneUpdated event) -> receipt.client.updatePhone(event.phone()));

        apply((ClientEmailUpdated event) -> receipt.client.updateEmail(event.email()));
    }
}
