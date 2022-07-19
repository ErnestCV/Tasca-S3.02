package org.n3ex1.service;

import java.math.BigDecimal;

public class ToJPY implements ConverterService {
    @Override
    public void convert(BigDecimal preu) {
        System.out.println("Preu en JPY: " + preu.multiply(new BigDecimal("141.36")));
    }
}
