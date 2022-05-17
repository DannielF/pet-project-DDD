package co.com.sk.servicios.ventayalquiler.receipt.values;

import co.com.sofka.domain.generic.ValueObject;
import org.apache.commons.lang3.Validate;

import java.time.DateTimeException;
import java.time.LocalDateTime;

/**
 * DateReceipt class - Value Object
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public record DateReceipt(LocalDateTime value) implements ValueObject<LocalDateTime> {

    private static final String VALIDATION_MESSAGE = "Cannot be empty";

    public DateReceipt(LocalDateTime value) {
        if (value.isAfter(LocalDateTime.now())) {
            throw new DateTimeException("That's no possible, What are you doing");
        }
        this.value = Validate.notNull(value, VALIDATION_MESSAGE);
    }
}
