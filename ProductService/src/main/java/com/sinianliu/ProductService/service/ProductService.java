package com.sinianliu.ProductService.service;

import com.sinianliu.ProductService.model.ProductRequest;
import com.sinianliu.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
