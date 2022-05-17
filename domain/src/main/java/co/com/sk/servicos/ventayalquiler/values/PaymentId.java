package co.com.sk.servicos.ventayalquiler.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Payment class - identity
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class PaymentId extends Identity {

    public PaymentId(String id) {
        super(id);
    }

    public static PaymentId of(String id) {
        return new PaymentId(id);
    }
}
