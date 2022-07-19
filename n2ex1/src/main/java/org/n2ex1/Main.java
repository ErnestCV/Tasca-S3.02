package org.n2ex1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        String metodePagament = "Targeta"; //TODO triar mètode
        BigDecimal preu = new BigDecimal("79.99");

        Botiga botiga = new Botiga();
        Pagament pagament = new Targeta(preu);

        botiga.processaPagament(pagament);

        //TODO revisar procés callback

    }
}