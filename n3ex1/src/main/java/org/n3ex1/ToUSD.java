package org.n3ex1;

import java.math.BigDecimal;

public class ToUSD implements ConverterService {

    @Override
    public void convert(BigDecimal preu) {
        System.out.println("Preu en USD: " + preu.multiply(new BigDecimal("1.2")));
    }
}
