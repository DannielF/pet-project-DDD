package co.com.sk.servicos.ventayalquiler.shop.values;

import co.com.sofka.domain.generic.Identity;

public class ResponsibleId extends Identity {

    public ResponsibleId(){

    }
    public ResponsibleId(String id){
        super(id);
    }

    public static ResponsibleId of(String id){
        return new ResponsibleId(id);
    }}
