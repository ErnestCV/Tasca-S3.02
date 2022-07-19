package org.n2ex1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal preu = new BigDecimal("79.99");
        Botiga botiga = new Botiga("Botiga de sabates");

        botiga.processaPagament(SelectorPagament.selectorPagament(preu));
    }
}