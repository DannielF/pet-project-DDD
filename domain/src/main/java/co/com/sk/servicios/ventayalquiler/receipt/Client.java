package co.com.sk.servicios.ventayalquiler.receipt;

import co.com.sk.servicios.ventayalquiler.receipt.values.ClientId;
import co.com.sk.servicios.ventayalquiler.receipt.values.Email;
import co.com.sk.servicios.ventayalquiler.receipt.values.Name;
import co.com.sk.servicios.ventayalquiler.receipt.values.Phone;
import co.com.sofka.domain.generic.Entity;
import org.apache.commons.lang3.Validate;

/**
 * Client class - entity
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class Client extends Entity<ClientId> {

    private static final String VALIDATION_MESSAGE = "There's must be a value";
    private static final String VALIDATION_MESSAGE_UPDATE = "Cannot be empty";

    protected Name name;
    protected Phone phone;
    protected Email email;

    public Client(ClientId clientId, Name name, Phone phone, Email email) {
        super(clientId);
        this.name = Validate.notNull(name, VALIDATION_MESSAGE);
        this.phone = Validate.notNull(phone, VALIDATION_MESSAGE);
        this.email = Validate.notNull(email, VALIDATION_MESSAGE);
    }

    /**
     * Update phone
     * @param phone Object
     */
    public void updatePhone(Phone phone) {
        if (phone.value().isBlank()) {
            throw new IllegalArgumentException(VALIDATION_MESSAGE_UPDATE);
        }
        this.phone = phone;
    }

    /**
     * Update name
     * @param name Object
     */
    public void updateName(Name name) {
        if (name.value().isBlank()) {
            throw new IllegalArgumentException(VALIDATION_MESSAGE_UPDATE);
        }
        this.name = name;
    }

    /**
     * Update email
     * @param email Object
     */
    public void updateEmail(Email email) {
        if (email.value().isBlank()) {
            throw new IllegalArgumentException(VALIDATION_MESSAGE_UPDATE);
        }
        this.email = email;
    }
}
