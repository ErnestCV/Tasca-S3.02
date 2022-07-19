package org.n2ex1;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Botiga botiga = new Botiga();
        Callback callback = new CallbackImpl(botiga);
        //botiga.passaPagament(callback);

        String tipus = "org.n2ex1.Targeta";

        Class c = Class.forName(tipus);
        Targeta ref = (Targeta) c.getDeclaredConstructor().newInstance();

        calcula(ref);

        //TODO la botiga ha d'invocar pasarel·la -> envia objecte pagament amb tipus. pasarel·la rep objecte, fa pagament, i fa callback a botiga
    }

    public static void calcula(Targeta ref) {
        ref.pagament();
    }

    //https://java-design-patterns.com/patterns/callback/
    //https://www.javamexico.org/blogs/bnk/haciendo_un_pequeno_callback
    //https://www.delftstack.com/howto/java/java-callback/
    //https://www.geeksforgeeks.org/callback-using-interfaces-java/?ref=lbp
}