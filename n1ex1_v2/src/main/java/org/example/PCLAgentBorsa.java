package org.example;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PCLAgentBorsa {

    //És l'Observable

    private double stock;
    private final PropertyChangeSupport support;

    public PCLAgentBorsa() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    //firepropertyChange(propietat observada, valor antic, valor nou)
    public void setStock(double value) {
        support.firePropertyChange("stock", this.stock, value);
    }
}
