package co.com.sk.servicios.ventayalquiler.trolley.events;

import co.com.sk.servicios.ventayalquiler.trolley.values.SeriesId;
import co.com.sk.servicios.ventayalquiler.trolley.values.Title;
import co.com.sofka.domain.generic.DomainEvent;
/**
 * SeriesTitleUpdated class - Domain event
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class SeriesTitleUpdated extends DomainEvent {
    private final SeriesId seriesId;
    private final Title title;

    public SeriesTitleUpdated(SeriesId seriesId, Title title) {
        super("co.com.sk.servicios.ventayalquiler.SeriesTitleUpdated");
        this.seriesId = seriesId;
        this.title = title;
    }

    public SeriesId seriesId() {
        return seriesId;
    }

    public Title title() {
        return title;
    }
}
