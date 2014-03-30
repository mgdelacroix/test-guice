# test-guice

This is a proof of concept to understand how dependency injection with [Google Guice](https://code.google.com/p/google-guice/) works.

We have the `BillingService` that will print the name of the `CreditCardProcessor` we inject.

In the `PaymentModule`, we choose which implementation of `CreditCardProcessor` we would like to use (we have `Paypal`, and `GoogleWallet` available). This implementation will be injected and used in the main class.
