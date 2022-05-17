package co.com.sk.servicios.ventayalquiler.shop.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public record Direction(String value) implements ValueObject<String> {

    public Direction(String value) {
        this.value = Objects.requireNonNull(value);
    }
}
