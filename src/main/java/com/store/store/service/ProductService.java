package com.store.store.service;

import com.store.store.entitie.Product;
import com.store.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product add(Product product) {
        return productRepository.save(product);
    }

    public Page<Product> list(String name, Pageable pageable){
        return productRepository.findByNameContainingIgnoreCase(name, pageable);
    }
}
