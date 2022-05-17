package co.com.sk.servicos.ventayalquiler.receipt.events;

import co.com.sk.servicos.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Email;
import co.com.sk.servicos.ventayalquiler.receipt.values.Name;
import co.com.sk.servicos.ventayalquiler.receipt.values.Phone;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * ClientAdded class - Domain event
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class ClientAdded extends DomainEvent {

    private final ClientId clientId;
    private final Name name;
    private final Phone phone;
    private final Email email;

    public ClientAdded(ClientId clientId, Name name, Phone phone, Email email) {
        super("co.com.sk.servicios.ventayalquiler.ClientAdded");
        this.clientId = clientId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public ClientId clientId() {
        return clientId;
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
