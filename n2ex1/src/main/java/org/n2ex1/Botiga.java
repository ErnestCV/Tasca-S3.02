package org.n2ex1;

public class Botiga {

    public void processaPagament(Pagament pagament) {
        Passarela passarela = new Passarela(this, pagament);
        passarela.execute();
    }

    public void postPagament() {
        System.out.println("Pagament realitzat correctament.");
    }
}
