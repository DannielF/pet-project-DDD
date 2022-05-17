package co.com.sk.servicios.ventayalquiler.receipt.commands;

import co.com.sk.servicios.ventayalquiler.receipt.values.PaymentId;
import co.com.sk.servicios.ventayalquiler.receipt.values.ReceiptId;
import co.com.sk.servicios.ventayalquiler.receipt.values.Type;
import co.com.sofka.domain.generic.Command;

/**
 * UpdateTypePayment class - Command
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateTypePayment extends Command {

    private final ReceiptId receiptId;
    private final PaymentId paymentId;
    private final Type type;

    public UpdateTypePayment(ReceiptId receiptId, PaymentId paymentId, Type type) {
        this.receiptId = receiptId;
        this.paymentId = paymentId;
        this.type = type;
    }

    public ReceiptId receiptId() {
        return receiptId;
    }

    public PaymentId paymentId() {
        return paymentId;
    }

    public Type type() {
        return type;
    }
}
