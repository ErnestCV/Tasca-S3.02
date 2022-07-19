package org.n3ex1;

import java.math.BigDecimal;

public class CurrencyConverter implements ConsumerService{

    private ConverterService service;

    public CurrencyConverter(ConverterService service) {
        this.service = service;
    }

    @Override
    public void processConversion(BigDecimal preu) {
        this.service.convert(preu);
    }
}
