package com.sinianliu.OrderService.service;

import com.sinianliu.OrderService.model.OrderRequest;
import com.sinianliu.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);

}