package co.com.sk.servicos.shop;

import co.com.sk.servicos.shop.events.*;
import co.com.sk.servicos.shop.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Shop extends AggregateEvent<ShopId> {
    protected StoreName storeName;
    protected Direction direction;
    protected CashierEmployee cashierEmployee;
    protected Responsible responsible;

    public Shop(ShopId entityId, StoreName storeName,Direction direction) {
        super(entityId);
        appendChange(new StoreCreated(storeName,direction)).apply();
    }

    //Subcritor de los eventos
    private Shop(ShopId entityId){
        super(entityId);
        subscribe(new ShopChange(this));
    }

    //Factoria
    public static Shop from(ShopId entityId, List<DomainEvent> events){
        var shop = new Shop(entityId);
        events.forEach(shop::applyEvent);
        return shop;
    }

    //Crear cajero empleado
    public void createCashierClerk(CashierEmployeeId entityId, EmployeeName employeeName, Mail mail, Function function){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(employeeName);
        Objects.requireNonNull(mail);
        Objects.requireNonNull(function);
        appendChange(new CashierEmployeeAggregate(entityId,employeeName,mail,function)).apply();

    }

    //Agregar Responsable al agregado root tienda
    public void addResponsible(ResponsibleId entityId, EmployeeName employeeName, Mail mail, Function function){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(employeeName);
        Objects.requireNonNull(mail);
        Objects.requireNonNull(function);
        appendChange(new ResponsibleAdded(entityId,employeeName,mail,function)).apply();

    }


    //Actualizar funciones Cajero Empleado
    public void updateFeaturesCashier(CashierEmployeeId entityId, Function function){
        appendChange(new FunctionCajeroUpdated(entityId,function)).apply();

    }

    //Actualizar funciones Responsable
    public void FunctionResponsibleUpdated(ResponsibleId responsibleId, Function function){
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

    public CashierEmployee cashierEmployee() {
        return cashierEmployee;
    }

    public Responsible responsible() {
        return responsible;
    }
}
