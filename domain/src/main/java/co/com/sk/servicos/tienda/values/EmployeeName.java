package co.com.sk.servicos.tienda.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EmployeeName implements ValueObject<String> {

    private final String value;

    public EmployeeName(String value) {
        this.value = Objects.requireNonNull(value);
    }


    @Override
    public String value() {
        return value;
    }
}
