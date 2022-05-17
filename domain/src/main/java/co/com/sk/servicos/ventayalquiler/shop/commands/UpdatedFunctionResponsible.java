package co.com.sk.servicos.ventayalquiler.shop.commands;

import co.com.sk.servicos.ventayalquiler.shop.values.CashierEmployeeId;
import co.com.sk.servicos.ventayalquiler.shop.values.Function;
import co.com.sk.servicos.ventayalquiler.shop.values.ShopId;
import co.com.sofka.domain.generic.Command;

//Actualizar Cajero Empleado
public class UpdatedFunctionResponsible extends Command {
    private final ShopId shopId;
    private final CashierEmployeeId entityId;
    private final Function function;

    public UpdatedFunctionResponsible(ShopId shopId, CashierEmployeeId entityId, Function function) {
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
