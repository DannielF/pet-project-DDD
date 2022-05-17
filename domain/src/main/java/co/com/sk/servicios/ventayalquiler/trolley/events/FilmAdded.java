package co.com.sk.servicios.ventayalquiler.trolley.events;

import co.com.sk.servicios.ventayalquiler.trolley.values.Description;
import co.com.sk.servicios.ventayalquiler.trolley.values.Duration;
import co.com.sk.servicios.ventayalquiler.trolley.values.FilmId;
import co.com.sk.servicios.ventayalquiler.trolley.values.SeriesId;
import co.com.sk.servicios.ventayalquiler.trolley.values.Title;
import co.com.sofka.domain.generic.DomainEvent;
/**
 * FilmAdded class - Domain event
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class FilmAdded extends DomainEvent {
    private final FilmId filmId;
    private final Title title;
    private final Duration duration;
    private final Description description;

    public FilmAdded(FilmId filmId, Title title, Duration duration, Description description) {
        super("co.com.sk.servicios.ventayalquiler.FilmAdded");
        this.filmId = filmId;
        this.title = title;
        this.duration = duration;
        this.description = description;
    }

    public FilmId filmId() {
        return filmId;
    }

    public Title title() {
        return title;
    }

    public Duration duration() {
        return duration;
    }

    public Description description() {
        return description;
    }
}
