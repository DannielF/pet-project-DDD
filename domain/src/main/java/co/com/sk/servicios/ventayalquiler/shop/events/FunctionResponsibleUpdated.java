package co.com.sk.servicios.ventayalquiler.shop.events;

import co.com.sk.servicios.ventayalquiler.shop.values.Function;
import co.com.sk.servicios.ventayalquiler.shop.values.ResponsibleId;
import co.com.sofka.domain.generic.DomainEvent;

//Responsable Actualizado
public class FunctionResponsibleUpdated extends DomainEvent {
    private final ResponsibleId responsibleId;
    private final Function function;

    public FunctionResponsibleUpdated(ResponsibleId responsibleId, Function function) {
        super("teveo.shop.functionresponsibleupdate");
        this.responsibleId=responsibleId;
        this.function=function;
    }

    public ResponsibleId getResponsibleId() {
        return responsibleId;
    }

    public Function getFunction() {
        return function;
    }
}
