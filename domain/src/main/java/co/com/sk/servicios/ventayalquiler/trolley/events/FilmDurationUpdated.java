package co.com.sk.servicios.ventayalquiler.trolley.events;

import co.com.sk.servicios.ventayalquiler.trolley.values.Duration;
import co.com.sk.servicios.ventayalquiler.trolley.values.FilmId;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * FilmDurationUpdated class - Domain event
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class FilmDurationUpdated extends DomainEvent {
    private final FilmId filmId;
    private final Duration duration;

    public FilmDurationUpdated(FilmId filmId, Duration duration) {
        super("co.com.sk.servicios.ventayalquiler.FilmDurationUpdated");
        this.filmId = filmId;
        this.duration = duration;
    }

    public FilmId filmId() {
        return filmId;
    }

    public Duration duration() {
        return duration;
    }
}
