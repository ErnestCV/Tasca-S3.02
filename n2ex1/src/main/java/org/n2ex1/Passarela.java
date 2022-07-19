package org.n2ex1;

import org.n2ex1.metodePagament.MetodePagament;

public class Passarela {

    private final Botiga botiga;
    private final MetodePagament metodePagament;

    public Passarela(Botiga botiga, MetodePagament metodePagament) {
        this.botiga = botiga;
        this.metodePagament = metodePagament;
    }

    public void execute() {
        metodePagament.processa();
        //Callback
        botiga.postPagament();
    }

}
