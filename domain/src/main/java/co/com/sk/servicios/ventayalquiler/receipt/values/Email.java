package co.com.sk.servicios.ventayalquiler.receipt.values;

import co.com.sofka.domain.generic.ValueObject;
import org.apache.commons.lang3.Validate;

/**
 * Email class - Value Object
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public record Email(String value) implements ValueObject<String> {

    public Email(String value) {
        this.value = Validate.notNull(value, "There's must be a value");
    }
}
