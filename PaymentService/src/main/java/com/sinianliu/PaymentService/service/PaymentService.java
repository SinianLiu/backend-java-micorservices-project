package com.sinianliu.PaymentService.service;

import com.sinianliu.PaymentService.model.PaymentRequest;
import com.sinianliu.PaymentService.model.PaymentResponse;


public interface PaymentService {


    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}