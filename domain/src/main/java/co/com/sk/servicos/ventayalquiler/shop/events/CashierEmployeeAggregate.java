package co.com.sk.servicos.ventayalquiler.shop.events;

import co.com.sk.servicos.ventayalquiler.shop.values.CashierEmployeeId;
import co.com.sk.servicos.ventayalquiler.shop.values.EmployeeName;
import co.com.sk.servicos.ventayalquiler.shop.values.Function;
import co.com.sk.servicos.ventayalquiler.shop.values.Mail;
import co.com.sofka.domain.generic.DomainEvent;

//Cajero Empleado Agregadp
public class CashierEmployeeAggregate extends DomainEvent {

    private final CashierEmployeeId entityId;
    private final EmployeeName employeeName;
    private final Mail mail;
    private final Function function;

    public CashierEmployeeAggregate(CashierEmployeeId entityId, EmployeeName employeeName, Mail mail, Function function){
        super("teveo.shop.cashieremployeeaggregate");
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