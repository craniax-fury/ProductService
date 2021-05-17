package com.insignia.productservice.service;

import com.insignia.productservice.entity.Product;
import com.insignia.productservice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Optional<Product> getProductById(int pid) {
        return productRepo.findById(pid);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }
}
