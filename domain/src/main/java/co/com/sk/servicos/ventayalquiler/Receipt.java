package co.com.sk.servicos.ventayalquiler;

import co.com.sk.servicos.ventayalquiler.values.DateReceipt;
import co.com.sk.servicos.ventayalquiler.values.ReceiptId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.time.LocalDate;

/**
 * Receipt class - Aggregate Root
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class Receipt extends AggregateEvent<ReceiptId> {

    //protected Store store;
    //protected ShoppingCar shoppingCar;
    protected Client client;
    protected DateReceipt date;



    public Receipt(ReceiptId entityId, DateReceipt date) {
        super(entityId);
        appendChange(new ReceiptCreated(date)).apply();
        subscribe(new ReceiptEventChange(this));

    }
}
