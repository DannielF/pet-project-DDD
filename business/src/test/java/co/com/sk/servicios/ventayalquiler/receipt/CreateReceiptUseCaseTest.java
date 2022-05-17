package co.com.sk.servicios.ventayalquiler.receipt;

import co.com.sk.servicios.ventayalquiler.receipt.commands.CreateReceipt;
import co.com.sk.servicios.ventayalquiler.receipt.events.ReceiptCreated;
import co.com.sk.servicios.ventayalquiler.receipt.values.DateReceipt;
import co.com.sk.servicios.ventayalquiler.receipt.values.ReceiptId;
import co.com.sk.servicios.ventayalquiler.shop.values.ShopId;
import co.com.sk.servicios.ventayalquiler.trolley.values.TrolleyId;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * CreateReceiptUseCaseTest test
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
class CreateReceiptUseCaseTest {

    private CreateReceiptUseCase useCase;

    @BeforeEach
    void setup() {
        useCase = new CreateReceiptUseCase();
    }

    @Test
    void createReceiptAllOk() {
        //Arrange
        ReceiptId receiptId = ReceiptId.of("xxx");
        ShopId shopId = ShopId.of("ddd");
        TrolleyId trolleyId = TrolleyId.of("ttt");
        DateReceipt date = new DateReceipt(LocalDateTime.of(2021,11, 5, 5,23));
        var command = new CreateReceipt(receiptId, shopId, trolleyId,date);

        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //Assert
        var receiptCreated = (ReceiptCreated) events.get(0);
        assertEquals("xxx", receiptCreated.aggregateRootId());
        assertEquals("ddd", receiptCreated.shopId().value());
        assertEquals("ttt", receiptCreated.trolleyId().value());
        assertEquals(date, receiptCreated.date());
    }

}