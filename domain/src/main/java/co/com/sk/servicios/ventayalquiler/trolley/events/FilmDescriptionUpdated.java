package co.com.sk.servicios.ventayalquiler.trolley.events;

import co.com.sk.servicios.ventayalquiler.trolley.values.Description;
import co.com.sk.servicios.ventayalquiler.trolley.values.FilmId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * FilmDescriptionUpdated class - Domain event
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class FilmDescriptionUpdated extends DomainEvent {
    private final FilmId filmId;
    private final Description description;

    public FilmDescriptionUpdated(FilmId filmId, Description description) {
        super("co.com.sk.servicios.ventayalquiler.FilmDescriptionUpdated");
        this.filmId = filmId;
        this.description = description;
    }

    public FilmId filmId() {
        return filmId;
    }

    public Description description() {
        return description;
    }
}
