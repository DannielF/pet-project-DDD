package co.com.sk.servicos.ventayalquiler;

import co.com.sk.servicos.ventayalquiler.events.ClientAdded;
import co.com.sk.servicos.ventayalquiler.events.ReceiptCreated;
import co.com.sk.servicos.ventayalquiler.events.TypePaymentUpdated;
import co.com.sofka.domain.generic.EventChange;

public class ReceiptEventChange extends EventChange {
    public ReceiptEventChange(Receipt receipt) {
        apply((ReceiptCreated event) -> receipt.date = event.date());

        apply((ClientAdded event) -> {
            var name = event.name();
            var phone = event.phone();
            var email = event.email();
            receipt.addClient(name, phone, email);
        });

        apply((TypePaymentUpdated event) -> receipt.updateTypePayment(event.paymentId(),event.typePayment()));
    }
}
