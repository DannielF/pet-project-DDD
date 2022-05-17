package co.com.sk.servicos.shop;

import co.com.sk.servicos.shop.events.*;
import co.com.sk.servicos.shop.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Shop extends AggregateEvent<ShopId> {
    protected StoreName storeName;
    protected Direction direction;
    protected CashierEmployeeId cashierEmployeeId;
    protected ResponsibleId responsibleId;

    public Shop(ShopId entityId, StoreName storeName,Direction direction) {
        super(entityId);
        appendChange(new StoreCreated(storeName,direction)).apply();
    }

    //Agregando cajero Empleado al agregado root tienda
    public void addCashierEmployee(CashierEmployeeId entityId, EmployeeName employeeName, Mail mail,Function function){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(employeeName);
        Objects.requireNonNull(mail);
        Objects.requireNonNull(function)
        appendChange(new CashierEmployeeAggregate(entityId,employeeName,mail,function)).apply();

    }

    //Agregar Responsable al agregado root tienda
    public void addResponsible(ResponsibleId entityId, EmployeeName employeeName, Mail mail,Function function){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(employeeName);
        Objects.requireNonNull(mail);
        Objects.requireNonNull(function);
        appendChange(new ResponsibleAdded(entityId,employeeName,mail,function)).apply();

    }


    //Actualizar funciones Cajero Empleado
    public void updateFeaturesCashier(CashierEmployeeId entityId,Function function){
        appendChange(new FunctionCajeroUpdated(entityId,function)).apply();

    }

    //Actualizar funciones Responsable
    public void FunctionResponsibleUpdated(ResponsibleId responsibleId,Function function){
        appendChange(new FunctionResponsibleUpdated(responsibleId,function)).apply();
    }

    //Cambiar nombre
    public void ChangeStoreName(StoreName storeName){
        Objects.requireNonNull(storeName);
        appendChange(new StoreNameChanged(storeName)).apply();
    }

    //Cambiar Direccion
    public void ChangeDirection(Direction direction){
        Objects.requireNonNull(direction);
        appendChange(new AddressChanged(direction)).apply();
    }

    public StoreName storeName() {
        return storeName;
    }

    public Direction direction() {
        return direction;
    }

    public CashierEmployeeId cashierEmployeeId() {
        return cashierEmployeeId;
    }

    public ResponsibleId responsibleId() {
        return responsibleId;
    }
}
