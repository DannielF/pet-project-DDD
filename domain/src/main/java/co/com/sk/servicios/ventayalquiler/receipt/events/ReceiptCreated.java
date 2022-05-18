package co.com.sk.servicios.ventayalquiler.receipt.events;

import co.com.sk.servicios.ventayalquiler.receipt.values.DateReceipt;
import co.com.sk.servicios.ventayalquiler.shop.values.ShopId;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * ReceiptCreated class - Domain event
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class ReceiptCreated extends DomainEvent {

    private final ShopId shopId;
    private final TrolleyId trolleyId;
    private final DateReceipt date;

    public ReceiptCreated(ShopId shopId, TrolleyId trolleyId, DateReceipt date) {
        super("co.com.sk.servicios.ventayalquiler.ReceiptCreated");
        this.shopId = shopId;
        this.trolleyId = trolleyId;
        this.date = date;
    }

    public TrolleyId trolleyId() {
        return trolleyId;
    }

    public ShopId shopId() {
        return shopId;
    }

    public DateReceipt date() {
        return date;
    }
}
