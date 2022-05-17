package co.com.sk.servicos.ventayalquiler.shop.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Function implements ValueObject {
    private final String value;

    public Function(String value) {
        this.value = Objects.requireNonNull(value);
    }


    @Override
    public Object value() {
        return value;
    }
}
