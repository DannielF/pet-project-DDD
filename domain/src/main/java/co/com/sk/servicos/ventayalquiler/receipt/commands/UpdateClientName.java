package co.com.sk.servicos.ventayalquiler.receipt.commands;

import co.com.sk.servicos.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Name;
import co.com.sk.servicos.ventayalquiler.receipt.values.ReceiptId;
import co.com.sofka.domain.generic.Command;

/**
 * UpdateClientName class - Command
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateClientName extends Command {

    private final ReceiptId receiptId;
    private final ClientId clientId;
    private final Name name;

    public UpdateClientName(ReceiptId receiptId, ClientId clientId, Name name) {
        this.receiptId = receiptId;
        this.clientId = clientId;
        this.name = name;
    }

    public ReceiptId receiptId() {
        return receiptId;
    }

    public ClientId clientId() {
        return clientId;
    }

    public Name name() {
        return name;
    }
}
