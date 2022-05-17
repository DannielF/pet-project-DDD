package co.com.sk.servicios.ventayalquiler.shop;

import co.com.sk.servicios.ventayalquiler.shop.values.EmployeeName;
import co.com.sk.servicios.ventayalquiler.shop.values.Function;
import co.com.sk.servicios.ventayalquiler.shop.values.Mail;
import co.com.sk.servicios.ventayalquiler.shop.values.ResponsibleId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Responsible extends Entity<ResponsibleId> {

    private EmployeeName employeeName;
    private Mail mail;
    private Function function;

    public Responsible(ResponsibleId entityId, EmployeeName employeeName, Mail mail, Function function) {
        super(entityId);
        this.employeeName = employeeName;
        this.mail=mail;
        this.function=function;
    }

    public Function getFunction() {
        return function;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }

    public Mail getMail() {
        return mail;
    }

    public void UpdateEmployeeName(EmployeeName employeeName){
        this.employeeName= Objects.requireNonNull(employeeName);

    }
    public void UpdateMail(Mail mail){
        this.mail= Objects.requireNonNull(mail);

    }
    public void UpdateFunction(Function function){
        this.function= Objects.requireNonNull(function);

    }
}
