package co.com.sk.servicos.shop;

import co.com.sk.servicos.shop.values.CashierEmployeeId;
import co.com.sk.servicos.shop.values.EmployeeName;
import co.com.sk.servicos.shop.values.Mail;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class CashierEmployee extends Entity<CashierEmployeeId> {

    private EmployeeName employeeName;
    private Mail mail;

    public CashierEmployee(CashierEmployeeId entityId, EmployeeName employeeName, Mail mail) {
        super(entityId);
        this.employeeName = employeeName;
        this.mail=mail;
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
}
