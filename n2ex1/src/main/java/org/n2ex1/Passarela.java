package org.n2ex1;

public class Passarela {

    private Botiga botiga;
    private Pagament metodePagament;

    public Passarela(Botiga botiga, Pagament metodePagament) {
        this.botiga = botiga;
        this.metodePagament = metodePagament;
    }

    public void execute() {
        metodePagament.processa();
        //Callback
        botiga.postPagament();
    }

}
