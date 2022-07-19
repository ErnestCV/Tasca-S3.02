package org.n3ex1.client;

import org.n3ex1.service.ConverterService;

import java.math.BigDecimal;

public class CurrencyConverter implements ServiceConsumer {

    private final ConverterService service;

    public CurrencyConverter(ConverterService service) {
        this.service = service;
    }

    @Override
    public void processConversion(BigDecimal preu) {
        this.service.convert(preu);
    }
}
