package co.com.sk.servicios.ventayalquiler.shop.commands;

import co.com.sk.servicios.ventayalquiler.shop.values.CashierEmployeeId;
import co.com.sk.servicios.ventayalquiler.shop.values.Function;
import co.com.sk.servicios.ventayalquiler.shop.values.ShopId;
import co.com.sofka.domain.generic.Command;

public class UpdatedFunctionCashierClerk extends Command {
    private final ShopId shopId;
    private final CashierEmployeeId entityId;
    private final Function function;

    public UpdatedFunctionCashierClerk(ShopId shopId, CashierEmployeeId entityId, Function function) {
        this.shopId = shopId;
        this.entityId = entityId;
        this.function = function;
    }

    public ShopId getShopId() {
        return shopId;
    }

    public CashierEmployeeId getEntityId() {
        return entityId;
    }

    public Function getFunction() {
        return function;
    }
}
