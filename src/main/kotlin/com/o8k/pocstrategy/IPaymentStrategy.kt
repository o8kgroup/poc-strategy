package com.o8k.pocstrategy

import java.math.BigDecimal

/**
 * Common interface for all strategies.
 */
interface IPaymentStrategy {
    fun pay(paymentAmount: BigDecimal)
    fun collectPaymentDetails()
}