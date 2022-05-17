package co.com.sk.servicios.ventayalquiler.trolley.commands;

import co.com.sk.servicios.ventayalquiler.trolley.values.Description;
import co.com.sk.servicios.ventayalquiler.trolley.values.FilmId;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.Command;

/**
 * UpdateFilmDescription class - Command
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateFilmDescription extends Command {
    private final TrolleyId trolleyId;
    private final FilmId filmId;
    private final Description description;

    public UpdateFilmDescription(TrolleyId trolleyId, FilmId filmId, Description description) {
        this.trolleyId = trolleyId;
        this.filmId = filmId;
        this.description = description;
    }

    public TrolleyId trolleyId() {
        return trolleyId;
    }

    public FilmId filmId() {
        return filmId;
    }

    public Description description() {
        return description;
    }
}
