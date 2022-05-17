package co.com.sk.servicios.ventayalquiler.trolley;

import co.com.sk.servicios.ventayalquiler.trolley.commands.CreateTrolley;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

/**
 * CreateTrolleyUseCase class - Use case
 *
 * @author dannielf - riveco0120
 * @version 0.0.1
 * @since 0.0.1
 */
public class CreateTrolleyUseCase extends UseCase<RequestCommand<CreateTrolley>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateTrolley> trolleyRequestCommand) {
        var command = trolleyRequestCommand.getCommand();

        var trolley = new Trolley(command.trolleyId(), command.totalPrice());

        emit().onResponse(new ResponseEvents(trolley.getUncommittedChanges()));
    }
}
