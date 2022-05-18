package co.com.sk.servicios.ventayalquiler.trolley.events;

import co.com.sk.servicios.ventayalquiler.trolley.values.Duration;
import co.com.sk.servicios.ventayalquiler.trolley.values.SeriesId;
import co.com.sofka.domain.generic.DomainEvent;
/**
 * SeriesDurationUpdated class - Domain event
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class SeriesDurationUpdated extends DomainEvent {
    private final SeriesId seriesId;
    private final Duration duration;

    public SeriesDurationUpdated(SeriesId seriesId, Duration duration) {
        super("co.com.sk.servicios.ventayalquiler.SeriesDurationUpdated");
        this.seriesId = seriesId;
        this.duration = duration;
    }

    public SeriesId seriesId() {
        return seriesId;
    }

    public Duration duration() {
        return duration;
    }
}
