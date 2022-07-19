package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PCLAgenciaBorsa implements PropertyChangeListener {

    //És l'Observer

    private double stock;

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setStock((double) evt.getNewValue());
    }
}
