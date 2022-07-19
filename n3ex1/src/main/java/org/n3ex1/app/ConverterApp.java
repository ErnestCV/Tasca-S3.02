package org.n3ex1.app;

import org.n3ex1.Producte;
import org.n3ex1.injector.ConversioMonedaInjector;
import org.n3ex1.injector.ToJPYInjector;
import org.n3ex1.injector.ToUSDInjector;
import org.n3ex1.client.ServiceConsumer;

import java.util.List;
import java.util.Objects;

public class ConverterApp {

    private final List<Producte> list;
    private final String moneda;

    public ConverterApp(List<Producte> list, String moneda) {
        this.list = list;
        this.moneda = moneda;
    }

    public void run() {
        ConversioMonedaInjector injector = null;
        switch (moneda) {
            case "USD" -> injector = new ToUSDInjector();
            case "JPY" -> injector = new ToJPYInjector();
        }

        ServiceConsumer app;
        app = Objects.requireNonNull(injector).getConsumerService();

        list.forEach(producte -> {
            System.out.print(producte.getNom() + " - ");
            app.processConversion(producte.getPreu());
        });
    }
}
