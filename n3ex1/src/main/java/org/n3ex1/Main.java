package org.n3ex1;

import org.n3ex1.app.ConverterApp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //https://www.journaldev.com/2394/java-dependency-injection-design-pattern-example-tutorial
        //https://stackify.com/dependency-injection/

        /*
        Resum:

        main (ConverterApp) -> crea injector
        injector -> crea instància servei, injecta servei al client
        client -> usa el servei injectat
        servei -> implementa interface de conversió

        (Més explicació al readme).
         */

        /*
        - La classe Main conté la llista de productes i la moneda a la qual es vol convertir el seu preu.
        - Amb la llista i la moneda concreta s'instancia una ConverterApp.
        La ConverterApp fa un switch de la moneda i escull quin injector emprarà.
        L'injector crea les classes de servei, així l'app principal ConverterApp s'encarrega només d'usar serveis, no de crear-los.
        L'injector injecta el servei concret de conversió de divisa al client (CurrencyConverter).
        El client usa el servei que ha sigut injectat (encara que el client no l'ha creat).
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