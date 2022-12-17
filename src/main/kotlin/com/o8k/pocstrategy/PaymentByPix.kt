package com.o8k.pocstrategy

import java.math.BigDecimal

/**
 * Concrete strategy. Implements PIX payment method.
 */
class PaymentByPix : IPaymentStrategy{
    override fun pay(paymentAmount: BigDecimal) {
        println("=======")
        println("Paying: R$ $paymentAmount via PIX")
        println("All good :)")
        println("Done.")
        println("")
    }

    override fun collectPaymentDetails() {
        println("=======")
        println("Collecting payment details!")
        println("Payment method chosen: PIX")
        println("Done.")
        Thread.sleep(1000)
    }
}