package co.com.sk.servicos.ventayalquiler.shop.commands;

import co.com.sk.servicos.shop.values.*;
import co.com.sk.servicos.ventayalquiler.shop.values.CashierEmployeeId;
import co.com.sk.servicos.ventayalquiler.shop.values.EmployeeName;
import co.com.sk.servicos.ventayalquiler.shop.values.Function;
import co.com.sk.servicos.ventayalquiler.shop.values.Mail;
import co.com.sk.servicos.ventayalquiler.shop.values.ShopId;
import co.com.sofka.domain.generic.Command;

//Crear cajero Empleado
public class CreateCashierClerk extends Command {
    private final ShopId shopId;
    private final CashierEmployeeId entityId;
    private final EmployeeName employeeName;
    private final Mail mail;
    private final Function function;

    public CreateCashierClerk(ShopId shopId, CashierEmployeeId entityId, EmployeeName employeeName, Mail mail, Function function) {
        this.shopId = shopId;
        this.entityId = entityId;
        this.employeeName = employeeName;
        this.mail = mail;
        this.function = function;
    }

    public ShopId getShopId() {
        return shopId;
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
