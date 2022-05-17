package co.com.sk.servicos.ventayalquiler.receipt.commands;

import co.com.sk.servicos.ventayalquiler.receipt.values.DateReceipt;
import co.com.sk.servicos.ventayalquiler.receipt.values.ReceiptId;
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
    private final DateReceipt date;

    public CreateReceipt(ReceiptId receiptId, DateReceipt date) {
        this.receiptId = receiptId;
        this.date = date;
    }

    public ReceiptId receiptId() {
        return receiptId;
    }

    public DateReceipt date() {
        return date;
    }
}
