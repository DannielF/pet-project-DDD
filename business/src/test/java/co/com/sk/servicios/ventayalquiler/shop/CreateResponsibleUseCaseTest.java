package co.com.sk.servicios.ventayalquiler.shop;

import co.com.sk.servicos.ventayalquiler.shop.commands.CreateStore;
import co.com.sk.servicos.ventayalquiler.shop.events.StoreCreated;
import co.com.sk.servicos.ventayalquiler.shop.values.Direction;
import co.com.sk.servicos.ventayalquiler.shop.values.ShopId;
import co.com.sk.servicos.ventayalquiler.shop.values.StoreName;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateResponsibleUseCaseTest {

    private CreateStoreUseCase useCase;

    @BeforeEach
    public void setup(){
        useCase= new CreateStoreUseCase();
    }

    @Test
    @DisplayName("Test para crear tienda")
    public  void crearStoreTest(){
        //Arrange
        ShopId shopId =ShopId.of("xxxx");
        StoreName storeName = new StoreName("DolarCyty");
        Direction direction = new Direction("Centro comercial florida");
        var command = new CreateStore(shopId,storeName,direction);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var storeCreated =(StoreCreated)events.get(0);
        Assertions.assertEquals("xxxx",storeCreated.aggregateRootId());
        Assertions.assertEquals("DolarCyty",storeCreated.getStoreName().value());
        Assertions.assertEquals("Centro comercial florida",storeCreated.getDirection().value());
    }

}