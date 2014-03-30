package test

import com.google.inject.AbstractModule

class PaymentModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CreditCardProcessor.class).to(GoogleWallet.class)
    }

}