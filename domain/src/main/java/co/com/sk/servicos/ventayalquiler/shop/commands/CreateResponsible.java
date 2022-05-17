package co.com.sk.servicos.ventayalquiler.shop.commands;

import co.com.sk.servicos.ventayalquiler.shop.values.*;
import co.com.sofka.domain.generic.Command;

//Crear responsable
public class CreateResponsible extends Command {
    private final ShopId shopId;
    private final ResponsibleId entityId;
    private final EmployeeName employeeName;
    private final Mail mail;
    private final Function function;

    public CreateResponsible(ShopId shopId,ResponsibleId entityId, EmployeeName employeeName, Mail mail, Function function) {
        this.shopId=shopId;
        this.entityId = entityId;
        this.employeeName = employeeName;
        this.mail = mail;
        this.function = function;
    }

    public ResponsibleId getEntityId() {
        return entityId;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }

    public Mail getMail() {
        return mail;
    }

    public Function getFunction() {
        return function;
    }
}
