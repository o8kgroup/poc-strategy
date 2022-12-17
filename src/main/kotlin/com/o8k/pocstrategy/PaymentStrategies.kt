package com.o8k.pocstrategy

class PaymentStrategies {
    companion object{
        val strategiesMap: HashMap<String, IPaymentStrategy> = hashMapOf(
            "PIX" to PaymentByPix(),
            "CREDIT_CARD" to PaymentByCreditCard()
        )
    }
}