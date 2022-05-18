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
import co.com.sk.servicios.ventayalquiler.trolley.values.Description;
import co.com.sk.servicios.ventayalquiler.trolley.values.Duration;
import co.com.sk.servicios.ventayalquiler.trolley.values.FilmId;
import co.com.sk.servicios.ventayalquiler.trolley.values.SeriesId;
import co.com.sk.servicios.ventayalquiler.trolley.values.Title;
import co.com.sk.servicios.ventayalquiler.trolley.values.TotalPrice;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

/**
 * Trolley class - Aggregate
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class Trolley extends AggregateEvent<TrolleyId> {

    protected TotalPrice totalPrice;
    protected Map<SeriesId, Series> series;
    protected Map<FilmId, Film> films;

    public Trolley(TrolleyId trolleyId, TotalPrice totalPrice) {
        super(trolleyId);
        appendChange(new TrolleyCreated(totalPrice)).apply();
        subscribe(new TrolleyEventChange(this));
    }

    private Trolley(TrolleyId trolleyId) {
        super(trolleyId);
        subscribe(new TrolleyEventChange(this));
    }

    public static Trolley from(TrolleyId trolleyId, List<DomainEvent> events) {
        var trolley = new Trolley(trolleyId);
        events.forEach(trolley::applyEvent);
        return trolley;
    }

    public void addSeries(Title title, Duration duration, Description description) {
        var seriesId = new SeriesId("series1");
        appendChange(new SeriesAdded(seriesId, title, duration, description)).apply();
    }

    public void addFilm(Title title, Duration duration, Description description) {
        var filmId = new FilmId("film1");
        appendChange(new FilmAdded(filmId, title, duration, description)).apply();
    }

    public void updateSeriesTitle(SeriesId seriesId, Title title) {
        appendChange(new SeriesTitleUpdated(seriesId, title)).apply();
    }

    public void updateSeriesDuration(SeriesId seriesId, Duration duration) {
        appendChange(new SeriesDurationUpdated(seriesId, duration)).apply();
    }

    public void updateSeriesDescription(SeriesId seriesId, Description description) {
        appendChange(new SeriesDescriptionUpdated(seriesId, description)).apply();
    }

    public void updateFilmTitle(FilmId filmId, Title title) {
        appendChange(new FilmTitleUpdated(filmId, title)).apply();
    }

    public void updateFilmDuration(FilmId filmId, Duration duration) {
        appendChange(new FilmDurationUpdated(filmId, duration)).apply();
    }

    public void updateFilmDescription(FilmId filmId, Description description) {
        appendChange(new FilmDescriptionUpdated(filmId, description)).apply();
    }

    public TotalPrice getTotalPrice() {
        return totalPrice;
    }

    public Map<SeriesId, Series> getSeries() {
        return series;
    }

    public Map<FilmId, Film> getFilms() {
        return films;
    }
}
