package co.com.sk.servicios.ventayalquiler.trolley;

import co.com.sk.servicios.ventayalquiler.trolley.values.Description;
import co.com.sk.servicios.ventayalquiler.trolley.values.Duration;
import co.com.sk.servicios.ventayalquiler.trolley.values.SeriesId;
import co.com.sk.servicios.ventayalquiler.trolley.values.Title;
import co.com.sofka.domain.generic.Entity;
import org.apache.commons.lang3.Validate;

/**
 * Series class - entity
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class Series extends Entity<SeriesId> {

    private static final String VALIDATION_MESSAGE = "There's must be a value";
    private static final String VALIDATION_MESSAGE_UPDATE = "Cannot be empty";

    protected Title title;
    protected Duration duration;
    protected Description description;

    public Series(SeriesId entityId, Title title, Duration duration, Description description) {
        super(entityId);
        this.title = Validate.notNull(title, VALIDATION_MESSAGE);
        this.duration = Validate.notNull(duration, VALIDATION_MESSAGE);
        this.description = Validate.notNull(description, VALIDATION_MESSAGE);
    }

    public void updateTitle(Title title) {
        if (title.value().isBlank()) {
            throw new IllegalArgumentException(VALIDATION_MESSAGE_UPDATE);
        }
        this.title = title;
    }

    public void updateDuration(Duration duration) {
        if (duration.value().isBlank()) {
            throw new IllegalArgumentException(VALIDATION_MESSAGE_UPDATE);
        }
        this.duration = duration;
    }

    public void updateDescription(Description description) {
        if (description.value().isBlank()) {
            throw new IllegalArgumentException(VALIDATION_MESSAGE_UPDATE);
        }
        this.description = description;
    }
}
