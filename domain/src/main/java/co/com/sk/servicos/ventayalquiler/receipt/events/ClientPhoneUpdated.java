package co.com.sk.servicos.ventayalquiler.receipt.events;

import co.com.sk.servicos.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Phone;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * ClientPhoneUpdated class - Domain event
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class ClientPhoneUpdated extends DomainEvent {
    private final ClientId clientId;
    private final Phone phone;

    public ClientPhoneUpdated(ClientId clientId, Phone phone) {
        super("co.com.sk.servicios.ventayalquiler.ClientPhoneUpdated");
        this.clientId = clientId;
        this.phone = phone;
    }

    public ClientId clientId() {
        return clientId;
    }

    public Phone phone() {
        return phone;
    }
}
