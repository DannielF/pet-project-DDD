package co.com.sk.servicos.ventayalquiler.receipt.values;

import co.com.sofka.domain.generic.ValueObject;
import org.apache.commons.lang3.Validate;

/**
 * Type class - Value Object
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public record Type(String value) implements ValueObject<String> {

    public Type (String value) {
        this.value = Validate.notNull(value, "There's must be a value");
    }
}
