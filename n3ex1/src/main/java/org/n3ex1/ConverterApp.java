package org.n3ex1;

import java.math.BigDecimal;

public class ConverterApp {

    private BigDecimal preu;
    private String moneda;

    public ConverterApp(BigDecimal preu, String moneda) {
        this.preu = preu;
        this.moneda = moneda;
    }

    public void run() {
        ConversioMonedaInjector injector;
        injector = new ToUSDConversioMonedaInjector();
        ConsumerService app;
        app = injector.getConsumerService();
        app.processConversion(preu);
    }
}
