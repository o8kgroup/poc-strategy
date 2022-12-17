package com.o8k.pocstrategy

import org.springframework.stereotype.Service

@Service
class PaymentService {
    fun pay(request: PaymentRequest): String {
        val strategy = PaymentStrategies.strategiesMap[request.method.uppercase()]
            ?: return "Payment method [${request.method}] not found"

        val paymentProcessor = PaymentProcessor(request.amount)
        paymentProcessor.process(strategy)

        return "Payment of [R$ ${request.amount}] via [${request.method}] done!"
    }
}