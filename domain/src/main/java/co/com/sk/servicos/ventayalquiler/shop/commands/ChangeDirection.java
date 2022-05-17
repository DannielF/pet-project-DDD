package co.com.sk.servicos.ventayalquiler.shop.commands;

import co.com.sk.servicos.ventayalquiler.shop.values.Direction;
import co.com.sk.servicos.ventayalquiler.shop.values.ShopId;
import co.com.sofka.domain.generic.Command;

public class ChangeDirection extends Command {
    private final ShopId shopId;
    private final Direction direction;

    public ChangeDirection(ShopId shopId, Direction direction) {
        this.shopId = shopId;
        this.direction = direction;
    }

    public ShopId getShopId() {
        return shopId;
    }

    public Direction getDirection() {
        return direction;
    }
}
