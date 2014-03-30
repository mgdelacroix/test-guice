package test

import com.google.inject.Injector
import com.google.inject.Guice

static main(args) {

    Injector injector = Guice.createInjector(new PaymentModule())

    BillingService billingService = injector.getInstance(BillingService.class)

    println "El nombre de mi método de pago es: $billingService"

}