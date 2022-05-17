package co.com.sk.servicos.shop.events;

import co.com.sk.servicos.shop.values.CashierEmployeeId;
import co.com.sk.servicos.shop.values.EmployeeName;
import co.com.sk.servicos.shop.values.Function;
import co.com.sk.servicos.shop.values.Mail;
import co.com.sofka.domain.generic.DomainEvent;

//Cajero Empleado Agregadp
public class CashierEmployeeAggregate extends DomainEvent {

    private final CashierEmployeeId entityId;
    private final EmployeeName employeeName;
    private final Mail mail;
    private final Function function;

    public CashierEmployeeAggregate(CashierEmployeeId entityId, EmployeeName employeeName, Mail mail,Function function){
        super("teveo.shop.cashierEmployeeAggregate");
        this.entityId=entityId;
        this.employeeName=employeeName;
        this.mail=mail;
        this.function=function;
    }

    public CashierEmployeeId getEntityId() {
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
