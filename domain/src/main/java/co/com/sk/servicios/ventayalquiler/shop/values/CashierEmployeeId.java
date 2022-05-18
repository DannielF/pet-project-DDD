package co.com.sk.servicios.ventayalquiler.shop.values;

import co.com.sofka.domain.generic.Identity;

public class CashierEmployeeId extends Identity {
    public CashierEmployeeId(){

    }
    public CashierEmployeeId(String id){
        super(id);
    }

    public static CashierEmployeeId of(String id){
        return new CashierEmployeeId(id);
    }
}
