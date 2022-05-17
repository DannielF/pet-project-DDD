package co.com.sk.servicios.ventayalquiler.trolley.commands;

import co.com.sk.servicios.ventayalquiler.trolley.values.FilmId;
import co.com.sk.servicios.ventayalquiler.trolley.values.Title;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.Command;

/**
 * UpdateFilmTitle class - Command
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateFilmTitle extends Command {
    private final TrolleyId trolleyId;
    private final FilmId filmId;
    private final Title title;

    public UpdateFilmTitle(TrolleyId trolleyId, FilmId filmId, Title title) {
        this.trolleyId = trolleyId;
        this.filmId = filmId;
        this.title = title;
    }

    public TrolleyId trolleyId() {
        return trolleyId;
    }

    public FilmId filmId() {
        return filmId;
    }

    public Title title() {
        return title;
    }
}
