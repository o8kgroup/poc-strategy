package com.o8k.pocstrategy

import java.math.BigDecimal

data class PaymentRequest(
    var method: String,
    var amount: BigDecimal
)