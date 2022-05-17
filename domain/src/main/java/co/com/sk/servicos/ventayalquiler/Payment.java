package co.com.sk.servicos.ventayalquiler;

import co.com.sk.servicos.ventayalquiler.values.PaymentId;
import co.com.sk.servicos.ventayalquiler.values.Type;
import co.com.sofka.domain.generic.Entity;
import org.apache.commons.lang3.Validate;

/**
 * Payment class - entity
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class Payment extends Entity<PaymentId> {

    protected Type type;

    public Payment(PaymentId entityId, Type type) {
        super(entityId);
        this.type = Validate.notNull(type, "There's must be a value");
    }

    /**
     * Update type
     * @param type Object
     */
    public void updateType(Type type) {
        if (type.value().isBlank()) {
            throw new IllegalArgumentException("Cannot be empty");
        }
        this.type = type;
    }
}
