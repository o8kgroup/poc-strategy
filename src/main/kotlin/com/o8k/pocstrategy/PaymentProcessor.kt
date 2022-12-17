package com.o8k.pocstrategy

import java.math.BigDecimal

data class PaymentProcessor(
    var amount: BigDecimal
) {
    //The original object, called context
    fun process(paymentStrategy: IPaymentStrategy) {
        paymentStrategy.collectPaymentDetails()
        paymentStrategy.pay(amount)
    }
}