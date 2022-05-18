package co.com.sk.servicios.ventayalquiler.trolley.values;

import co.com.sofka.domain.generic.Identity;

/**
 * TrolleyId class - identity
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class TrolleyId extends Identity {

    public TrolleyId(String id) {
        super(id);
    }

    public static TrolleyId of(String id) {
        return new TrolleyId(id);
    }
}
