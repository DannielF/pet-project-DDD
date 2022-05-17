package co.com.sk.servicos.ventayalquiler.receipt.events;

import co.com.sk.servicos.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Email;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * ClientEmailUpdated class - Domain event
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class ClientEmailUpdated extends DomainEvent {
    private final ClientId clientId;
    private final Email email;
    public ClientEmailUpdated(ClientId clientId, Email email) {
        super("co.com.sk.servicios.ventayalquiler.ClientEmailUpdated");
        this.clientId = clientId;
        this.email = email;
    }

    public ClientId clientId() {
        return clientId;
    }

    public Email email() {
        return email;
    }
}
