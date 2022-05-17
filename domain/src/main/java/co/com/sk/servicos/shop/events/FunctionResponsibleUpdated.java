package co.com.sk.servicos.shop.events;

import co.com.sk.servicos.shop.values.Function;
import co.com.sk.servicos.shop.values.ResponsibleId;
import co.com.sofka.domain.generic.DomainEvent;

//Responsable Actualizado
public class FunctionResponsibleUpdated extends DomainEvent {
    private final ResponsibleId responsibleId;
    private final Function function;

    public FunctionResponsibleUpdated(ResponsibleId responsibleId,Function function) {
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
