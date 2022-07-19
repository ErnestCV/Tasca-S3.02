package org.n2ex1.metodePagament;

import java.math.BigDecimal;

public class Paypal implements MetodePagament {

    private final BigDecimal preu;

    public Paypal(BigDecimal preu) {
        this.preu = preu;
    }

    @Override
    public void processa() {
        System.out.println("Fent un càrrec de " + preu + " al compte de Paypal...");
    }

}
