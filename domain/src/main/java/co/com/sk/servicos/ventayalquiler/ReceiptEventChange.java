package co.com.sk.servicos.ventayalquiler;

import co.com.sk.servicos.ventayalquiler.events.ReceiptCreated;
import co.com.sofka.domain.generic.EventChange;

public class ReceiptEventChange extends EventChange {
    public ReceiptEventChange(Receipt receipt) {
        apply((ReceiptCreated event) -> receipt.date = event.date());
    }
}
