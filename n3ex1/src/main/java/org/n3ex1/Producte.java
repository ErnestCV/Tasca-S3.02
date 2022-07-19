package org.n3ex1;

import java.math.BigDecimal;

public class Producte {

    private final String nom;
    private final BigDecimal preu;

    public Producte(String nom, BigDecimal preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public BigDecimal getPreu() {
        return preu;
    }

    public String getNom() {
        return nom;
    }
}
