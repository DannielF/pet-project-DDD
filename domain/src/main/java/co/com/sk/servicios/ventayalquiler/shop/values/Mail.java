package co.com.sk.servicios.ventayalquiler.shop.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public record Mail(String value) implements ValueObject<String> {

    public Mail(String value) {
        this.value = Objects.requireNonNull(value);
    }
}
