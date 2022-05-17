package co.com.sk.servicios.ventayalquiler.shop.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public record EmployeeName(String value) implements ValueObject<String> {

    public EmployeeName(String value) {
        this.value = Objects.requireNonNull(value);
    }
}
