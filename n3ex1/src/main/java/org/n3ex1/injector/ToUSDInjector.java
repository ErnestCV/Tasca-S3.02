package org.n3ex1.injector;

import org.n3ex1.client.ServiceConsumer;
import org.n3ex1.client.CurrencyConverter;
import org.n3ex1.service.ToUSD;

public class ToUSDInjector implements ConversioMonedaInjector {

    @Override
    public ServiceConsumer getConsumerService() {
        return new CurrencyConverter(new ToUSD());
    }
}
