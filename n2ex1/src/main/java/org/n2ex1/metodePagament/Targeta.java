package org.n2ex1.metodePagament;

import java.math.BigDecimal;

public class Targeta implements MetodePagament {

    private final BigDecimal preu;

    public Targeta(BigDecimal preu) {
        this.preu = preu;
    }

    @Override
    public void processa() {
        System.out.println("Fent un càrrec de " + preu + " a la targeta...");
    }
}
