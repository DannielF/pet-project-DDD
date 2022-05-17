package co.com.sk.servicos.shop;

import co.com.sk.servicos.shop.values.EmployeeName;
import co.com.sk.servicos.shop.values.Function;
import co.com.sk.servicos.shop.values.Mail;
import co.com.sk.servicos.shop.values.ResponsibleId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Responsible extends Entity<ResponsibleId> {

    private EmployeeName employeeName;
    private  Mail mail;
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
