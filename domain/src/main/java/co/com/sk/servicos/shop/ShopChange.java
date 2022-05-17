package co.com.sk.servicos.shop;

import co.com.sk.servicos.shop.events.*;
import co.com.sofka.domain.generic.EventChange;

public class ShopChange extends EventChange {

    public ShopChange(Shop shop){

        //Crear tienda
        apply((StoreCreated event)->{
            shop.storeName=event.getStoreName();
            shop.direction=event.getDirection();
        });

        //Crear cajero empleado
        apply((CashierEmployeeAggregate event)->{
            var newcashierEmployee = new CashierEmployee(event.getEntityId(),event.getEmployeeName(),event.getMail(),event.getFunction());
        });
        //crear Responsable
        apply((ResponsibleAdded event)->{
            var newResponsible = new Responsible(event.getEntityId(),event.getEmployeeName(),event.getMail(),event.getFunction());
        });

        //Actualizar funcion cajero
        apply((FunctionCajeroUpdated event)->{
            var newfunction = shop.cashierEmployee;
            newfunction.UpdateFunction(event.getFunction());

        });

        //Actualizar Funcion Responsable
        apply((FunctionResponsibleUpdated event)->{
            var newFunction = shop.responsible;
            newFunction.UpdateFunction(event.getFunction());

        });

        //Cambiando nombre tienda
        apply((StoreNameChanged event)->{
            shop.storeName = event.getStoreName();

        });
        //Cambiando direccion tienda
        apply((AddressChanged event)->{
            shop.direction=event.getDirection();

        });


    }
}
