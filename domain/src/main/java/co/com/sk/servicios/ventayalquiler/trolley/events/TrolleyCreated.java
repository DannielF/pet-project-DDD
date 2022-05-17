package co.com.sk.servicios.ventayalquiler.trolley.events;

import co.com.sk.servicios.ventayalquiler.trolley.values.TotalPrice;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.domain.generic.DomainEvent;
/**
 * TrolleyCreated class - Domain event
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class TrolleyCreated extends DomainEvent {

    private final TotalPrice totalPrice;
    public TrolleyCreated(TotalPrice totalPrice) {
        super("co.com.sk.servicios.ventayalquiler.TrolleyCreated");
        this.totalPrice = totalPrice;
    }

    public TotalPrice totalPrice() {
        return totalPrice;
    }
}
