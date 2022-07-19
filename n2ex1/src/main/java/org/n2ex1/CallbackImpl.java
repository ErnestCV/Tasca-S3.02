package org.n2ex1;

public class CallbackImpl implements Callback{

    //Implementa el mètode de callback

    private Botiga botiga;

    public CallbackImpl(Botiga botiga) {
        this.botiga = botiga;
    }

    @Override
    public void pagament() {
        System.out.println("Pagament - callback");
    }
}
