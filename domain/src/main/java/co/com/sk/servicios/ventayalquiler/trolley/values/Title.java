package co.com.sk.servicios.ventayalquiler.trolley.values;

import co.com.sofka.domain.generic.ValueObject;
import org.apache.commons.lang3.Validate;

/**
 * Title class - Value Object
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public record Title(String value) implements ValueObject<String> {
    public Title(String value) {
        this.value = Validate.notNull(value, "There's must be a value");
    }
}
