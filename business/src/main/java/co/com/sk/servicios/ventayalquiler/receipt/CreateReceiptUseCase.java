package co.com.sk.servicios.ventayalquiler.receipt;

import co.com.sk.servicios.ventayalquiler.receipt.commands.CreateReceipt;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

/**
 * CreateReceiptUseCase class - Use case
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class CreateReceiptUseCase extends UseCase<RequestCommand<CreateReceipt>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateReceipt> receiptRequestCommand) {
        var command = receiptRequestCommand.getCommand();

        var receipt = new Receipt(command.receiptId(), command.shopId(), command.trolleyId(),command.date());

        emit().onResponse(new ResponseEvents(receipt.getUncommittedChanges()));
    }
}
