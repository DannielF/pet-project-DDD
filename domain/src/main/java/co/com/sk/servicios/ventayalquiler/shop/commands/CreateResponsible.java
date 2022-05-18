package co.com.sk.servicios.ventayalquiler.shop.commands;

<<<<<<< HEAD:domain/src/main/java/co/com/sk/servicos/ventayalquiler/shop/commands/CreateResponsible.java
import co.com.sk.servicos.ventayalquiler.shop.values.*;
=======
import co.com.sk.servicios.ventayalquiler.shop.values.EmployeeName;
import co.com.sk.servicios.ventayalquiler.shop.values.Function;
import co.com.sk.servicios.ventayalquiler.shop.values.Mail;
import co.com.sk.servicios.ventayalquiler.shop.values.ResponsibleId;
>>>>>>> d11de5b0d93cfbe779e572541a42413fddddd1dd:domain/src/main/java/co/com/sk/servicios/ventayalquiler/shop/commands/CreateResponsible.java
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
