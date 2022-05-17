package co.com.sk.servicios.ventayalquiler.trolley.commands;

import co.com.sk.servicios.ventayalquiler.trolley.values.Duration;
import co.com.sk.servicios.ventayalquiler.trolley.values.SeriesId;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.Command;

/**
 * UpdateSeriesDuration class - Command
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateSeriesDuration extends Command {
    private final TrolleyId trolleyId;
    private final SeriesId seriesId;
    private final Duration duration;

    public UpdateSeriesDuration(TrolleyId trolleyId, SeriesId seriesId, Duration duration) {
        this.trolleyId = trolleyId;
        this.seriesId = seriesId;
        this.duration = duration;
    }

    public TrolleyId trolleyId() {
        return trolleyId;
    }

    public SeriesId seriesId() {
        return seriesId;
    }

    public Duration duration() {
        return duration;
    }
}
