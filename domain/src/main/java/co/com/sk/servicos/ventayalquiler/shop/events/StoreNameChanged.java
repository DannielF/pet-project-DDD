package co.com.sk.servicos.ventayalquiler.shop.events;

import co.com.sk.servicos.ventayalquiler.shop.values.StoreName;
import co.com.sofka.domain.generic.DomainEvent;

//Nombre tienda Cambiado
public class StoreNameChanged extends DomainEvent {
    private final StoreName storeName;
    public StoreNameChanged(StoreName storeName){
        super("teveo.shop.storenamechanged");
        this.storeName=storeName;
    }

    public StoreName getStoreName() {
        return storeName;
    }
}
