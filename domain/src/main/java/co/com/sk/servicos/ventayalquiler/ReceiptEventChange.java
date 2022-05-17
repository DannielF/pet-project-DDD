package co.com.sk.servicos.ventayalquiler;

import co.com.sk.servicos.ventayalquiler.events.ClientAdded;
import co.com.sk.servicos.ventayalquiler.events.ReceiptCreated;
import co.com.sk.servicos.ventayalquiler.events.TypePaymentUpdated;
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

        apply((TypePaymentUpdated event) -> receipt.payment.updateType(event.typePayment()));
    }
}
