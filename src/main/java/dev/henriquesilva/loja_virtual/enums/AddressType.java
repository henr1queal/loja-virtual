package dev.henriquesilva.loja_virtual.enums;

public enum AddressType {
    COBRANCA("Cobrança"),
    ENTREGA("Entrega");

    private String value;
    private AddressType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "AddressTypes{" +
                "value='" + value + '\'' +
                '}';
    }
}
