package org.n2ex1;

import org.n2ex1.metodePagament.CompteBancari;
import org.n2ex1.metodePagament.MetodePagament;
import org.n2ex1.metodePagament.Paypal;
import org.n2ex1.metodePagament.Targeta;

import java.math.BigDecimal;
import java.util.Scanner;

public class SelectorPagament {

    public static MetodePagament selectorPagament(BigDecimal preu) {

        MetodePagament pagament = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Total a pagar: " + preu + " €");
        System.out.println("Introdueix el mètode de pagament (Targeta - Paypal - Compte Bancari): ");
        String metodePagament = scanner.nextLine();

        switch (metodePagament) {
            case "Targeta" -> pagament = new Targeta(preu);
            case "Paypal" -> pagament = new Paypal(preu);
            case "Compte Bancari" -> pagament = new CompteBancari(preu);
        }

        return pagament;
    }
}
