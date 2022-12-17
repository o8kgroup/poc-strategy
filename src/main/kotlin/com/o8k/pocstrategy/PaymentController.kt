package com.o8k.pocstrategy

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("payment")
class PaymentController(private val paymentService: PaymentService) {
    @PostMapping
    fun pay(@RequestBody request: PaymentRequest): PaymentResponse =
        PaymentResponse(paymentService.pay(request))
}