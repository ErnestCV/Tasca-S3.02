package org.n1ex1;

public class Agencia1 implements AgenciaBorsa{

    //Observa a l'Agent de Borsa (l'Observable)
    private double stock;

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    @Override
    public void update(double stock) {
        this.setStock(stock);
    }

    @Override
    public String toString() {
        return "Agencia1{" +
                "stock=" + stock +
                '}';
    }
}
