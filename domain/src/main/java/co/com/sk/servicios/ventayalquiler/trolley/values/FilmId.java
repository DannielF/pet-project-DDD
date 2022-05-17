package co.com.sk.servicios.ventayalquiler.trolley.values;

import co.com.sofka.domain.generic.Identity;

/**
 * FilmId class - identity
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class FilmId extends Identity {

    public FilmId(String id) {
        super(id);
    }

    public static FilmId of(String id) {
        return new FilmId(id);
    }
}
