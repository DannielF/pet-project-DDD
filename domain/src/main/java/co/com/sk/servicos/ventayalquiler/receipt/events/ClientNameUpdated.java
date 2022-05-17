package co.com.sk.servicos.ventayalquiler.receipt.events;

import co.com.sk.servicos.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Name;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * ClientNameUpdated class - Domain event
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class ClientNameUpdated extends DomainEvent {


    private final ClientId clientId;
    private final Name name;

    public ClientNameUpdated(ClientId clientId, Name name) {
        super("co.com.sk.servicios.ventayalquiler.ClientNameUpdated");
        this.clientId = clientId;
        this.name = name;
    }

    public ClientId clientId() {
        return clientId;
    }

    public Name name() {
        return name;
    }
}
