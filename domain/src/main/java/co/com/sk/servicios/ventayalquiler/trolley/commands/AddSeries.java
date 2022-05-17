package co.com.sk.servicios.ventayalquiler.trolley.commands;

import co.com.sk.servicios.ventayalquiler.trolley.values.Description;
import co.com.sk.servicios.ventayalquiler.trolley.values.Duration;
import co.com.sk.servicios.ventayalquiler.trolley.values.Title;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.Command;

/**
 * AddSeries class - Command
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class AddSeries extends Command {
    private final TrolleyId trolleyId;
    private final Title title;
    private final Duration duration;
    private final Description description;

    public AddSeries(TrolleyId trolleyId, Title title, Duration duration, Description description) {
        this.trolleyId = trolleyId;
        this.title = title;
        this.duration = duration;
        this.description = description;
    }

    public TrolleyId trolleyId() {
        return trolleyId;
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
