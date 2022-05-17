package co.com.sk.servicos.ventayalquiler.shop.values;

import co.com.sofka.domain.generic.Identity;

public class ShopId extends Identity {
    public ShopId(){

    }
    public ShopId(String id){
        super(id);
    }

    public static ShopId of(String id){
        return new ShopId(id);
    }
}

