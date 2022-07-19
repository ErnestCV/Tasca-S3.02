package org.n2ex1;

import org.n2ex1.metodePagament.MetodePagament;

public class Botiga {

    private final String nom;

    public Botiga(String nom) {
        this.nom = nom;
    }

    public void processaPagament(MetodePagament metodePagament) {
        Passarela passarela = new Passarela(this, metodePagament);
        passarela.execute();
    }

    public void postPagament() {
        System.out.println("Pagament realitzat correctament.");
    }
}
