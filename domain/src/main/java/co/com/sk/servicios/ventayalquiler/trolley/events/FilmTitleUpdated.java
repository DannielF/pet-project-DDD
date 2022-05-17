package co.com.sk.servicios.ventayalquiler.trolley.events;

import co.com.sk.servicios.ventayalquiler.trolley.values.FilmId;
import co.com.sk.servicios.ventayalquiler.trolley.values.Title;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * FilmTitleUpdated class - Domain event
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class FilmTitleUpdated extends DomainEvent {
    private final FilmId filmId;
    private final Title title;

    public FilmTitleUpdated(FilmId filmId, Title title) {
        super("co.com.sk.servicios.ventayalquiler.FilmTitleUpdated");
        this.filmId = filmId;
        this.title = title;
    }

    public FilmId filmId() {
        return filmId;
    }

    public Title title() {
        return title;
    }
}
