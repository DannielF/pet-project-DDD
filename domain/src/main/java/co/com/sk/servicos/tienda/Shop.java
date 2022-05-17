package co.com.sk.servicos.tienda;

import co.com.sk.servicos.tienda.values.Direction;
import co.com.sk.servicos.tienda.values.ShopId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Shop extends AggregateEvent<ShopId> {

    public Shop(ShopId entityId, Direction direction) {
        super(entityId);
    }


}
