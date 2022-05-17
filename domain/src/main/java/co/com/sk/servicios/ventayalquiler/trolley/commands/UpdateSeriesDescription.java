package co.com.sk.servicios.ventayalquiler.trolley.commands;

import co.com.sk.servicios.ventayalquiler.trolley.values.Description;
import co.com.sk.servicios.ventayalquiler.trolley.values.SeriesId;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.Command;

/**
 * UpdateSeriesDescription class - Command
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateSeriesDescription extends Command {
    private final TrolleyId trolleyId;
    private final SeriesId seriesId;
    private final Description description;

    public UpdateSeriesDescription(TrolleyId trolleyId, SeriesId seriesId, Description description) {
        this.trolleyId = trolleyId;
        this.seriesId = seriesId;
        this.description = description;
    }

    public TrolleyId trolleyId() {
        return trolleyId;
    }

    public SeriesId seriesId() {
        return seriesId;
    }

    public Description description() {
        return description;
    }
}
