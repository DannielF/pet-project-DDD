package co.com.sk.servicios.ventayalquiler.receipt.commands;


import co.com.sk.servicios.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicios.ventayalquiler.receipt.values.Email;
import co.com.sk.servicios.ventayalquiler.receipt.values.ReceiptId;

/**
 * UpdateClientEmail class - Command
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateClientEmail {

    private final ReceiptId receiptId;
    private final ClientId clientId;
    private final Email email;

    public UpdateClientEmail(ReceiptId receiptId, ClientId clientId, Email email) {
        this.receiptId = receiptId;
        this.clientId = clientId;
        this.email = email;
    }

    public ReceiptId receiptId() {
        return receiptId;
    }

    public ClientId clientId() {
        return clientId;
    }

    public Email email() {
        return email;
    }
}
