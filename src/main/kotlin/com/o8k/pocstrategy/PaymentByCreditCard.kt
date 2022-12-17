package com.o8k.pocstrategy

import java.math.BigDecimal

/**
 * Concrete strategy. Implements CreditCard payment method.
 */
class PaymentByCreditCard : IPaymentStrategy{
    override fun pay(paymentAmount: BigDecimal) {
        println("=======")
        println("Paying: R$ $paymentAmount via CREDIT CARD")
        println("All good :)")
        println("Done.")
        println("")
    }

    override fun collectPaymentDetails() {
        println("=======")
        println("Collecting payment details!")
        println("Payment method chosen: CREDIT_CARD")
        println("Done.")
        Thread.sleep(1000)
    }
}