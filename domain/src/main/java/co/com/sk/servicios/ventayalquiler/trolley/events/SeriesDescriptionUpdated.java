package co.com.sk.servicios.ventayalquiler.trolley.events;

import co.com.sk.servicios.ventayalquiler.trolley.values.Description;
import co.com.sk.servicios.ventayalquiler.trolley.values.SeriesId;
import co.com.sofka.domain.generic.DomainEvent;
/**
 * SeriesDescriptionUpdated class - Domain event
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class SeriesDescriptionUpdated extends DomainEvent {
    private final SeriesId seriesId;
    private final Description description;

    public SeriesDescriptionUpdated(SeriesId seriesId, Description description) {
        super("co.com.sk.servicios.ventayalquiler.SeriesDescriptionUpdated");
        this.seriesId = seriesId;
        this.description = description;
    }

    public SeriesId seriesId() {
        return seriesId;
    }

    public Description description() {
        return description;
    }
}
