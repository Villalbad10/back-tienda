package com.store.store.controller;

import com.store.store.entitie.Product;
import com.store.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping("/add")
    public Product add(@RequestBody Product product){
        return productService.add(product);
    }
}

