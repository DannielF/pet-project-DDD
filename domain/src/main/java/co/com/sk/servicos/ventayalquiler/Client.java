package co.com.sk.servicos.ventayalquiler;

import co.com.sk.servicos.ventayalquiler.values.ClientId;
import co.com.sk.servicos.ventayalquiler.values.Email;
import co.com.sk.servicos.ventayalquiler.values.Name;
import co.com.sk.servicos.ventayalquiler.values.Phone;
import co.com.sofka.domain.generic.Entity;
import org.apache.commons.lang3.Validate;

/**
 * Client class - entity
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class Client extends Entity<ClientId> {

    private static final String VALIDATION_MESSAGE = "There's must be a value";

    protected Name name;
    protected Phone phone;
    protected Email email;

    public Client(ClientId entityId, Name name, Phone phone, Email email) {
        super(entityId);
        this.name = Validate.notNull(name, VALIDATION_MESSAGE);
        this.phone = Validate.notNull(phone, VALIDATION_MESSAGE);
        this.email = Validate.notNull(email, VALIDATION_MESSAGE);
    }
}
