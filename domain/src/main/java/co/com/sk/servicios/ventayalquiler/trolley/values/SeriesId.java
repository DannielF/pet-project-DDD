package co.com.sk.servicios.ventayalquiler.trolley.values;

import co.com.sofka.domain.generic.Identity;

/**
 * SeriesId class - identity
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class SeriesId extends Identity {

    public SeriesId(String id) {
        super(id);
    }

    public static SeriesId of(String id) {
        return new SeriesId(id);
    }
}
