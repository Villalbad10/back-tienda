package com.store.store.controller;

import com.store.store.entitie.Product;
import com.store.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    @GetMapping("/list")
    public Page<Product>list(@RequestParam String name, @RequestParam int page, @RequestParam int size){
        Pageable pageable = PageRequest.of(page, size);
        return productService.list(name, pageable);
    }

    @PostMapping("/state")
    public Product inactive(@RequestParam Long id){
        return productService.inactive(id);
    }
}

