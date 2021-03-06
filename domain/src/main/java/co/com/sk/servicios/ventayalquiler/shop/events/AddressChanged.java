package co.com.sk.servicios.ventayalquiler.shop.events;

import co.com.sk.servicios.ventayalquiler.shop.values.Direction;
import co.com.sofka.domain.generic.DomainEvent;

//Direccion Cambiada
public class AddressChanged extends DomainEvent {
    private final Direction direction;
    public AddressChanged(Direction direction){
        super("teveo.shop.addresschanged");
        this.direction=direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
