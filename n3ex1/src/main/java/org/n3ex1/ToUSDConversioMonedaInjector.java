package org.n3ex1;

public class ToUSDConversioMonedaInjector implements ConversioMonedaInjector{

    @Override
    public ConsumerService getConsumerService() {
        return new CurrencyConverter(new ToUSD());
    }
}
