package co.com.sk.servicios.ventayalquiler.trolley;

import co.com.sk.servicios.ventayalquiler.trolley.events.FilmAdded;
import co.com.sk.servicios.ventayalquiler.trolley.events.FilmDescriptionUpdated;
import co.com.sk.servicios.ventayalquiler.trolley.events.FilmDurationUpdated;
import co.com.sk.servicios.ventayalquiler.trolley.events.FilmTitleUpdated;
import co.com.sk.servicios.ventayalquiler.trolley.events.SeriesAdded;
import co.com.sk.servicios.ventayalquiler.trolley.events.SeriesDescriptionUpdated;
import co.com.sk.servicios.ventayalquiler.trolley.events.SeriesDurationUpdated;
import co.com.sk.servicios.ventayalquiler.trolley.events.SeriesTitleUpdated;
import co.com.sk.servicios.ventayalquiler.trolley.events.TrolleyCreated;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashMap;

/**
 * ReceiptEventChange class - Event change
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class TrolleyEventChange extends EventChange {
    public TrolleyEventChange(Trolley trolley) {
        apply((TrolleyCreated event) -> {
            trolley.totalPrice = event.totalPrice();
            trolley.films = new HashMap<>();
            trolley.series = new HashMap<>();
        });

        apply((SeriesAdded event) -> {
            var seriesId = event.seriesId();
            var series = new Series(seriesId, event.title(), event.duration(), event.description());
            trolley.series.put(seriesId, series);
        });

        apply((FilmAdded event) -> {
            var filmId = event.filmId();
            var film = new Film(filmId, event.title(), event.duration(), event.description());
            trolley.films.put(filmId, film);
        });

        apply((SeriesTitleUpdated event) -> trolley.series
                .get(event.seriesId())
                .updateTitle(event.title())
        );

        apply((SeriesDurationUpdated event) -> trolley.series
                .get(event.seriesId())
                .updateDuration(event.duration())
        );

        apply((SeriesDescriptionUpdated event) -> trolley.series
                .get(event.seriesId())
                .updateDescription(event.description())
        );

        apply((FilmTitleUpdated event) -> trolley.films
                .get(event.filmId())
                .updateTitle(event.title())
        );

        apply((FilmDurationUpdated event) -> trolley.films
                .get(event.filmId())
                .updateDuration(event.duration())
        );

        apply((FilmDescriptionUpdated event) -> trolley.films
                .get(event.filmId())
                .updateDescription(event.description())
        );
    }
}
