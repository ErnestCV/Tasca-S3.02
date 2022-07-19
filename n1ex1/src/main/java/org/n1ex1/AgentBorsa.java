package org.n1ex1;

import java.util.ArrayList;
import java.util.List;

public class AgentBorsa {

    //És l'Observable

    private double stock;
    private final List<AgenciaBorsa> agencies = new ArrayList<>();

    public List<AgenciaBorsa> getAgencies() {
        return agencies;
    }

    public void addObserver(AgenciaBorsa agencia) {
        this.agencies.add(agencia);
    }

    public void removeObserver(AgenciaBorsa agencia) {
        this.agencies.remove(agencia);
    }

    //Fa un update de la informació rebuda a les diferents agències (els observers)
    public void setStock(double stock) {
        this.stock = stock;
        this.agencies.forEach(agenciaBorsa -> agenciaBorsa.update(this.stock));
    }

}
