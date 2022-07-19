package org.n3ex1;

import org.n3ex1.app.ConverterApp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Resum:

        main (ConverterApp) -> crea injector
        injector -> crea instància servei, injecta servei al client
        client -> usa el servei injectat
        servei -> implementa interface de conversió

        (Més explicació al readme).
         */

        List<Producte> list = new ArrayList<>();
        list.add(new Producte("Beguda", new BigDecimal("2.99")));
        list.add(new Producte("Samarreta", new BigDecimal("14.99")));
        list.add(new Producte("Cotxe", new BigDecimal("12999")));

        String moneda = "USD";

        ConverterApp app = new ConverterApp(list, moneda);
        app.run();
    }
}