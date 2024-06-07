package com.alura.desafio.CoversorMoneda;

public class Conversor {
    private String base_code;
    private String target_code;
    private double conversion_rate;

    public String monedaBase() {
        return base_code;
    }

    public String monedaConvertir() {
        return target_code;
    }

    public double conversionRate() {
        return conversion_rate;
    }
}
