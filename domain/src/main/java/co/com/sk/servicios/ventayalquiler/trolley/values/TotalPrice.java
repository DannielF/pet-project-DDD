package co.com.sk.servicios.ventayalquiler.trolley.values;

import co.com.sofka.domain.generic.ValueObject;
import org.apache.commons.lang3.Validate;

/**
 * TotalPrice class - Value Object
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public record TotalPrice(String value) implements ValueObject<String> {

    public TotalPrice(String value) {
        this.value = Validate.notNull(value, "There's must be a value");
    }
}
