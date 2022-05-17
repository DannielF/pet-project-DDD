package co.com.sk.servicos.ventayalquiler.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Client class - identity
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class ClientId extends Identity {

    public ClientId(String id) {
        super(id);
    }

    public static ClientId of(String id) {
        return new ClientId(id);
    }
}
