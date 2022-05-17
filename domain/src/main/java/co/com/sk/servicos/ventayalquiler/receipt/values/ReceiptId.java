package co.com.sk.servicos.ventayalquiler.receipt.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Receipt class - Identity
 * @author dannielf
 * @version 0.0.1
 * @since 0.0.1
 */
public class ReceiptId extends Identity {

    public ReceiptId(String id) {
        super(id);
    }

    public static ReceiptId of(String id) {
        return new ReceiptId(id);
    }
}
