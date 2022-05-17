package co.com.sk.servicos.ventayalquiler.receipt.commands;

import co.com.sk.servicos.ventayalquiler.receipt.values.ReceiptId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Type;
import co.com.sofka.domain.generic.Command;

/**
 * AddPayment class - Command
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class AddPayment extends Command {

    private final ReceiptId receiptId;
    private final Type type;

    public AddPayment(ReceiptId receiptId, Type type) {
        this.receiptId = receiptId;
        this.type = type;
    }

    public ReceiptId receiptId() {
        return receiptId;
    }

    public Type type() {
        return type;
    }
}
