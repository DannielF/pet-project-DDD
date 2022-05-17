package co.com.sk.servicios.ventayalquiler.shop.events;

import co.com.sk.servicios.ventayalquiler.shop.values.Direction;
import co.com.sk.servicios.ventayalquiler.shop.values.StoreName;
import co.com.sofka.domain.generic.DomainEvent;

//Tienda Creada
public class StoreCreated  extends DomainEvent {

    private  final StoreName storeName;
    private final Direction direction;

    public StoreCreated(StoreName storeName,Direction direction){
        super(("teveo.shop.storecreate"));
        this.storeName =storeName;
        this.direction = direction;
    }

    public StoreName getStoreName() {
        return storeName;
    }

    public Direction getDirection() {
        return direction;
    }
}
