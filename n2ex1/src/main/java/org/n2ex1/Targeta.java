package org.n2ex1;

public class Targeta implements Callback{

//    private Botiga botiga;
//
//    public Targeta(Botiga botiga) {
//        this.botiga = botiga;
//    }

    @Override
    public void pagament() {
        System.out.println("Pagament - callback");
    }
}


