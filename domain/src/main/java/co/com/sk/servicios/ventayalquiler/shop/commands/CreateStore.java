package co.com.sk.servicios.ventayalquiler.shop.commands;

import co.com.sk.servicios.ventayalquiler.shop.values.Direction;
import co.com.sk.servicios.ventayalquiler.shop.values.ShopId;
import co.com.sk.servicios.ventayalquiler.shop.values.StoreName;
import co.com.sofka.domain.generic.Command;

//Crear tienda
public class CreateStore extends Command {

    private final ShopId shopId;
    private final StoreName storeName;
    private final Direction direction;


    public CreateStore(ShopId shopId, StoreName storeName, Direction direction) {
        this.shopId = shopId;
        this.storeName = storeName;
        this.direction = direction;
    }

    public ShopId getShopId() {
        return shopId;
    }

    public StoreName getStoreName() {
        return storeName;
    }

    public Direction getDirection() {
        return direction;
    }
}
