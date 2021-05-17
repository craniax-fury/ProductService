package com.insignia.productservice.service;

import com.insignia.productservice.entity.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(int pid);
    Product saveProduct(Product product);

}
