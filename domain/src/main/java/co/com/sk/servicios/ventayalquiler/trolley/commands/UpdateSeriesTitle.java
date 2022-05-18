package co.com.sk.servicios.ventayalquiler.trolley.commands;

import co.com.sk.servicios.ventayalquiler.trolley.values.SeriesId;
import co.com.sk.servicios.ventayalquiler.trolley.values.Title;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.Command;

/**
 * UpdateSeriesTitle class - Command
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class UpdateSeriesTitle extends Command {
    private final TrolleyId trolleyId;
    private final SeriesId seriesId;
    private final Title title;

    public UpdateSeriesTitle(TrolleyId trolleyId, SeriesId seriesId, Title title) {
        this.trolleyId = trolleyId;
        this.seriesId = seriesId;
        this.title = title;
    }

    public TrolleyId trolleyId() {
        return trolleyId;
    }

    public SeriesId seriesId() {
        return seriesId;
    }

    public Title title() {
        return title;
    }
}
