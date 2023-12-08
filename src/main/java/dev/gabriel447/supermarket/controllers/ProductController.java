package dev.gabriel447.supermarket.controllers;

import dev.gabriel447.supermarket.entities.Product;
import dev.gabriel447.supermarket.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    //http://localhost:8080/products
    @GetMapping
    public List<Product> findAll() {
        List<Product> result = productService.findAll();
        return result;
    }

    //http://localhost:8080/products/add
    @PostMapping("/add")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        try {
            Product _product = productService.save(product);
            return new ResponseEntity<>(_product, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
