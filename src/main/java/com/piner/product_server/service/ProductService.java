package com.piner.product_server.service;

import com.piner.product_server.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();
    Product findbyid(int id);
}
