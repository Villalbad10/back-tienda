package com.store.store.service;

import com.store.store.entitie.Product;
import com.store.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public Product add(Product product) {
        return productRepository.save(product);
    }
}
