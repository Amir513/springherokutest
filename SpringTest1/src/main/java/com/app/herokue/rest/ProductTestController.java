package com.app.herokue.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.herokue.model.ProductTest;
import com.app.herokue.service.ProductTestService;

@RestController
public class ProductTestController {

    @Autowired
    private ProductTestService service;
    @GetMapping("/test")
    public String getMesg() {
    	return "Todays heroku concept statd";
    }

    @PostMapping("/addProduct")
    public ProductTest addProduct(@RequestBody ProductTest product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<ProductTest> addProducts(@RequestBody List<ProductTest> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<ProductTest> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public ProductTest findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public ProductTest findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public ProductTest updateProduct(@RequestBody ProductTest product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
