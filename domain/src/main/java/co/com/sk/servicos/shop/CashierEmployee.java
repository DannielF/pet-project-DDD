package co.com.sk.servicos.shop;

import co.com.sk.servicos.shop.values.CashierEmployeeId;
import co.com.sk.servicos.shop.values.EmployeeName;
import co.com.sk.servicos.shop.values.Function;
import co.com.sk.servicos.shop.values.Mail;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class CashierEmployee extends Entity<CashierEmployeeId> {

    private EmployeeName employeeName;
    private Mail mail;
    private Function function;

    public CashierEmployee(CashierEmployeeId entityId, EmployeeName employeeName, Mail mail,Function function) {
        super(entityId);
        this.employeeName = employeeName;
        this.mail=mail;
        this.function=function;
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
