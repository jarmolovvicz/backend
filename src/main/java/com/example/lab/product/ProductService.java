package com.example.lab.product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
    Product saveProduct(Product product);
}