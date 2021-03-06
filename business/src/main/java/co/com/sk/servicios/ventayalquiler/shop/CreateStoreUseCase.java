package co.com.sk.servicios.ventayalquiler.shop;

import co.com.sk.servicios.ventayalquiler.shop.commands.CreateStore;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateStoreUseCase extends UseCase<RequestCommand<CreateStore>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateStore> createStoreRequestCommand) {
        var comman = createStoreRequestCommand.getCommand();
        var shop = new Shop(comman.getShopId(), comman.getStoreName(), comman.getDirection());
        emit().onResponse(new ResponseEvents(shop.getUncommittedChanges()));
    }
}