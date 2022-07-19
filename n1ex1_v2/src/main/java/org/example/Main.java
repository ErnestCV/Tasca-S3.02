package org.example;

public class Main {
    public static void main(String[] args) {

        PCLAgentBorsa observable = new PCLAgentBorsa();
        PCLAgenciaBorsa observer = new PCLAgenciaBorsa();
        PCLAgenciaBorsa2 observer2 = new PCLAgenciaBorsa2();

        observable.addPropertyChangeListener(observer);
        observable.addPropertyChangeListener(observer2);

        observable.setStock(145.23d);

        System.out.println(observer.getStock() + ", " + observer2.getStock());

    }
}