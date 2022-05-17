package co.com.sk.servicios.ventayalquiler.receipt;

import co.com.sk.servicos.ventayalquiler.receipt.commands.CreateReceipt;
import co.com.sk.servicos.ventayalquiler.receipt.events.ReceiptCreated;
import co.com.sk.servicos.ventayalquiler.receipt.values.DateReceipt;
import co.com.sk.servicos.ventayalquiler.receipt.values.ReceiptId;
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
    void createReceipt() {
        //Arrange
        ReceiptId receiptId = ReceiptId.of("xxx");
        DateReceipt date = new DateReceipt(LocalDateTime.of(2021,11, 5, 5,23));
        var command = new CreateReceipt(receiptId, date);

        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //Assert
        var receiptCreated = (ReceiptCreated) events.get(0);
        assertEquals("xxx", receiptCreated.aggregateRootId());
        assertEquals(date, receiptCreated.date());
    }

}