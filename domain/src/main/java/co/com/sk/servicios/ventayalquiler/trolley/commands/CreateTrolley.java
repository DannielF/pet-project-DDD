package co.com.sk.servicios.ventayalquiler.trolley.commands;

import co.com.sk.servicios.ventayalquiler.trolley.values.TotalPrice;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.Command;

/**
 * CreateTrolley class - Command
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class CreateTrolley extends Command {

    private final TrolleyId trolleyId;
    private final TotalPrice totalPrice;

    public CreateTrolley(TrolleyId trolleyId, TotalPrice totalPrice) {
        this.trolleyId = trolleyId;
        this.totalPrice = totalPrice;
    }

    public TrolleyId trolleyId() {
        return trolleyId;
    }

    public TotalPrice totalPrice() {
        return totalPrice;
    }
}
