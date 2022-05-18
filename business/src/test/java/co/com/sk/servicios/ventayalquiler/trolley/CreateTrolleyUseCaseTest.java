package co.com.sk.servicios.ventayalquiler.trolley;

import co.com.sk.servicios.ventayalquiler.trolley.commands.CreateTrolley;
import co.com.sk.servicios.ventayalquiler.trolley.events.TrolleyCreated;
import co.com.sk.servicios.ventayalquiler.trolley.values.TotalPrice;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateTrolleyUseCaseTest {

    private CreateTrolleyUseCase useCase;

    @BeforeEach
    void setUp() {
        useCase = new CreateTrolleyUseCase();
    }

    @Test
    void createTrolleyAllOk() {
        //Arrange
        TrolleyId trolleyId = TrolleyId.of("ttt");
        TotalPrice totalPrice = new TotalPrice(12720.56D);
        var command = new CreateTrolley(trolleyId, totalPrice);

        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //Assert
        var trolleyCreated = (TrolleyCreated) events.get(0);
        assertEquals("ttt", trolleyCreated.aggregateRootId());
        assertEquals(totalPrice, trolleyCreated.totalPrice());
    }
}