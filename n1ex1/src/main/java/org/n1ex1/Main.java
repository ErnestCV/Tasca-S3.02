package org.n1ex1;

public class Main {
    public static void main(String[] args) {

        AgentBorsa observable = new AgentBorsa();
        Agencia1 observer = new Agencia1();
        Agencia2 observer1 = new Agencia2();

        observable.addObserver(observer);
        observable.addObserver(observer1);
        observable.setStock(145.23d);

        System.out.println(observable.getAgencies());
    }
}