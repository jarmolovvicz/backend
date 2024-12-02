package com.example.lab.product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
    List<Product> findProductsByCategoryId(Long categoryId);
    Product saveProduct(Product product);
}
