package org.n3ex1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //https://www.journaldev.com/2394/java-dependency-injection-design-pattern-example-tutorial
        //https://stackify.com/dependency-injection/

        //Servei, client, interface, injector

        /*
        main -> crea injector
        injector -> crea instancia servei, injecta al client
        client -> usa el servei injectat
        servei -> implementa interface
         */

        BigDecimal preu = new BigDecimal("39.99");
        String moneda = "USD";

        ConverterApp app = new ConverterApp(preu, moneda);
        app.run();
    }
}