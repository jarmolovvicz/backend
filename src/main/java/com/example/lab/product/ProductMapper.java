package com.example.lab.product;

import com.example.lab.category.Category;
import com.example.lab.category.CategoryRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class ProductMapper {

    private final CategoryRepository categoryRepository;

    @Autowired
    public ProductMapper(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public ProductDto toDto(Product product) {
        return new ProductDto(product.getName(), product.getPrice(), product.getCategory().getId());
    }

    public Product toEntity(ProductDto productDTO) {
        Category category = categoryRepository.findById(productDTO.categoryId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid category ID: " + productDTO.categoryId()));
        return new Product(productDTO.name(), productDTO.price(), category);
    }
}
