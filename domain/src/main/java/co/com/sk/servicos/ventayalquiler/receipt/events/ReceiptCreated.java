package co.com.sk.servicos.ventayalquiler.receipt.events;

import co.com.sk.servicos.ventayalquiler.receipt.values.DateReceipt;
import co.com.sk.servicos.ventayalquiler.shop.values.ShopId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * ReceiptCreated class - Domain event
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class ReceiptCreated extends DomainEvent {

    private final ShopId shopId;
    private final DateReceipt date;

    public ReceiptCreated(ShopId shopId, DateReceipt date) {
        super("co.com.sk.servicios.ventayalquiler.ReceiptCreated");
        this.shopId = shopId;
        this.date = date;
    }

    public ShopId shopId() {
        return shopId;
    }

    public DateReceipt date() {
        return date;
    }
}
