package co.com.sk.servicos.ventayalquiler.receipt.events;

import co.com.sk.servicos.ventayalquiler.receipt.values.PaymentId;
import co.com.sk.servicos.ventayalquiler.receipt.values.Type;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * TypePaymentUpdated class - Domain event
 *
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class TypePaymentUpdated extends DomainEvent {

    private final PaymentId paymentId;
    private final Type typePayment;
    public TypePaymentUpdated(PaymentId paymentId ,Type type) {
        super("co.com.sk.servicios.ventayalquiler.TypePaymentUpdated");
        this.paymentId = paymentId;
        this.typePayment = type;
    }

    public PaymentId paymentId() {
        return paymentId;
    }

    public Type typePayment() {
        return typePayment;
    }
}
