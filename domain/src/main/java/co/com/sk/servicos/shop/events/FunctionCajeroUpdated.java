package co.com.sk.servicos.shop.events;

import co.com.sk.servicos.shop.values.CashierEmployeeId;
import co.com.sk.servicos.shop.values.Function;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

//Cajero Empleado Actualiado
public class FunctionCajeroUpdated extends DomainEvent {

    private final CashierEmployeeId entityId;
    private final Function function;

    public FunctionCajeroUpdated(CashierEmployeeId entityId, Function function) {
        super("teveo.shop.functioncajeroupdate");
        this.entityId=entityId;
        this.function=function;
    }

    public CashierEmployeeId getEntityId() {
        return entityId;
    }

    public Function getFunction() {
        return function;
    }
}
