package co.com.sk.servicios.ventayalquiler.trolley.commands;

import co.com.sk.servicios.ventayalquiler.trolley.values.Duration;
import co.com.sk.servicios.ventayalquiler.trolley.values.FilmId;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.Command;

/**
 * UpdateFilmDuration class - Command
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateFilmDuration extends Command {
    private final TrolleyId trolleyId;
    private final FilmId filmId;
    private final Duration duration;

    public UpdateFilmDuration(TrolleyId trolleyId, FilmId filmId, Duration duration) {
        this.trolleyId = trolleyId;
        this.filmId = filmId;
        this.duration = duration;
    }

    public TrolleyId trolleyId() {
        return trolleyId;
    }

    public FilmId filmId() {
        return filmId;
    }

    public Duration duration() {
        return duration;
    }
}
