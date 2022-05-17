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

        //Agregar cajero empleado
        apply((CashierEmployeeAggregate event)->{

        });
        //Agregar Responsable
        apply((ResponsibleAdded event)->{

        });

        //Actualizar funcion cajero
        apply((FunctionCajeroUpdated event)->{

        });

        //Actualizar Funcion Responsable
        apply((FunctionResponsibleUpdated event)->{

        });

        //Cambiando nombre tienda
        apply((StoreNameChanged event)->{

        });
        //Cambiando direccion tienda
        apply((AddressChanged event)->{

        });


    }
}
