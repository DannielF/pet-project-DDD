package co.com.sk.servicos.ventayalquiler.shop.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Mail implements ValueObject<String> {

    private final String value;

    public Mail(String value) {
        this.value = Objects.requireNonNull(value);
    }


    @Override
    public String value() {
        return value;
    }
}
