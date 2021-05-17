package com.insignia.productservice.controller;

import com.insignia.productservice.entity.Product;
import com.insignia.productservice.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping(value = "/{id}")
    public Optional<Product> getById(@PathVariable("id") int pid){
        return productService.getProductById(pid);
    }

    @PostMapping(value="/")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
}
