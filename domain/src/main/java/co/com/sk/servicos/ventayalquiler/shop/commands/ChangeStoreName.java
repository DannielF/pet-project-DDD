package co.com.sk.servicos.ventayalquiler.shop.commands;

import co.com.sk.servicos.ventayalquiler.shop.values.ShopId;
import co.com.sk.servicos.ventayalquiler.shop.values.StoreName;
import co.com.sofka.domain.generic.Command;

public class ChangeStoreName extends Command {
    private final ShopId shopId;
    private final StoreName storeName;


    public ChangeStoreName(ShopId shopId, StoreName storeName) {
        this.shopId = shopId;
        this.storeName = storeName;
    }

    public ShopId getShopId() {
        return shopId;
    }

    public StoreName getStoreName() {
        return storeName;
    }
}
