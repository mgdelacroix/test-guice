package test

import com.google.inject.Inject

class BillingService {

    final CreditCardProcessor ccp

    @Inject
    BillingService(CreditCardProcessor ccp) {
        this.ccp = ccp
    }

    String toString() {
        ccp.name
    }

}