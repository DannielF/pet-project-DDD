package co.com.sk.servicos.ventayalquiler.receipt;

import co.com.sk.servicos.ventayalquiler.receipt.events.ClientAdded;
import co.com.sk.servicos.ventayalquiler.receipt.events.ClientEmailUpdated;
import co.com.sk.servicos.ventayalquiler.receipt.events.ClientNameUpdated;
import co.com.sk.servicos.ventayalquiler.receipt.events.ClientPhoneUpdated;
import co.com.sk.servicos.ventayalquiler.receipt.events.PaymentAdded;
import co.com.sk.servicos.ventayalquiler.receipt.events.ReceiptCreated;
import co.com.sk.servicos.ventayalquiler.receipt.events.TypePaymentUpdated;
import co.com.sofka.domain.generic.EventChange;

/**
 * ReceiptEventChange class - Event change
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class ReceiptEventChange extends EventChange {
    public ReceiptEventChange(Receipt receipt) {
        apply((ReceiptCreated event) -> receipt.date = event.date());

        apply((ClientAdded event) -> {
            receipt.client.name = event.name();
            receipt.client.phone = event.phone();
            receipt.client.email = event.email();
        });

        apply((PaymentAdded event) -> receipt.payment.type = event.typePayment());

        apply((TypePaymentUpdated event) -> receipt.payment.updateType(event.typePayment()));

        apply((ClientNameUpdated event) -> receipt.client.updateName(event.name()));

        apply((ClientPhoneUpdated event) -> receipt.client.updatePhone(event.phone()));

        apply((ClientEmailUpdated event) -> receipt.client.updateEmail(event.email()));
    }
}
