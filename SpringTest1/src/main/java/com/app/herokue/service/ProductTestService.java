package com.app.herokue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.herokue.model.ProductTest;
import com.app.herokue.repo.ProductTestRepo;

@Service
public class ProductTestService {
	@Autowired
    private ProductTestRepo repository;

    public ProductTest saveProduct(ProductTest product) {
        return repository.save(product);
    }

    public List<ProductTest> saveProducts(List<ProductTest> products) {
        return repository.saveAll(products);
    }

    public List<ProductTest> getProducts() {
        return repository.findAll();
    }

    public ProductTest getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public ProductTest getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public ProductTest updateProduct(ProductTest product) {
    	ProductTest existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }


}
