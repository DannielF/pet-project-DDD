package co.com.sk.servicos.ventayalquiler.receipt.commands;

import co.com.sk.servicos.ventayalquiler.receipt.values.Email;
import co.com.sk.servicos.ventayalquiler.receipt.values.Name;
import co.com.sk.servicos.ventayalquiler.receipt.values.Phone;
import co.com.sk.servicos.ventayalquiler.receipt.values.ReceiptId;
import co.com.sofka.domain.generic.Command;

/**
 * AddClient class - Command
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class AddClient extends Command {

    private final ReceiptId receiptId;
    private final Name name;
    private final Phone phone;
    private final Email email;

    public AddClient(ReceiptId receiptId, Name name, Phone phone, Email email) {
        this.receiptId = receiptId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public ReceiptId receiptId() {
        return receiptId;
    }

    public Name name() {
        return name;
    }

    public Phone phone() {
        return phone;
    }

    public Email email() {
        return email;
    }
}
