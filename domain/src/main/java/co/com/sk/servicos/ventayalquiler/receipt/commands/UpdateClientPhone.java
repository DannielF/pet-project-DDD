package co.com.sk.servicos.ventayalquiler.receipt.commands;

import co.com.sk.servicos.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Phone;
import co.com.sk.servicos.ventayalquiler.receipt.values.ReceiptId;
import co.com.sofka.domain.generic.Command;

/**
 * UpdateClientPhone class - Command
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateClientPhone extends Command {

    private final ReceiptId receiptId;
    private final ClientId clientId;
    private final Phone phone;

    public UpdateClientPhone(ReceiptId receiptId, ClientId clientId, Phone phone) {
        this.receiptId = receiptId;
        this.clientId = clientId;
        this.phone = phone;
    }

    public ReceiptId receiptId() {
        return receiptId;
    }

    public ClientId clientId() {
        return clientId;
    }

    public Phone phone() {
        return phone;
    }
}
