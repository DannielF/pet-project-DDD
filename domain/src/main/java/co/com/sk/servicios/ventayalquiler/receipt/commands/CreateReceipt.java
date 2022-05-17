package co.com.sk.servicios.ventayalquiler.receipt.commands;

import co.com.sk.servicios.ventayalquiler.shop.values.ShopId;
import co.com.sk.servicios.ventayalquiler.receipt.values.DateReceipt;
import co.com.sk.servicios.ventayalquiler.receipt.values.ReceiptId;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.Command;

/**
 * CreateReceipt class - Command
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class CreateReceipt extends Command {

    private final ReceiptId receiptId;
    private final ShopId shopId;
    private final TrolleyId trolleyId;
    private final DateReceipt date;

    public CreateReceipt(ReceiptId receiptId, ShopId shopId, TrolleyId trolleyId, DateReceipt date) {
        this.receiptId = receiptId;
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

    public ReceiptId receiptId() {
        return receiptId;
    }

    public DateReceipt date() {
        return date;
    }
}
