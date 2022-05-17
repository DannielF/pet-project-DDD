package co.com.sk.servicos.shop.events;

import co.com.sk.servicos.shop.values.EmployeeName;
import co.com.sk.servicos.shop.values.Function;
import co.com.sk.servicos.shop.values.Mail;
import co.com.sk.servicos.shop.values.ResponsibleId;
import co.com.sofka.domain.generic.DomainEvent;

//Agregar Responsable
public class ResponsibleAdded extends DomainEvent {
    private final ResponsibleId entityId;
    private final EmployeeName employeeName;
    private final Mail mail;
    private final Function function;

    public ResponsibleAdded(ResponsibleId entityId, EmployeeName employeeName, Mail mail,Function function){
        super("teveo.shop.responsibleadded");
        this.entityId=entityId;
        this.employeeName=employeeName;
        this.mail=mail;
        this.function=function;
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
