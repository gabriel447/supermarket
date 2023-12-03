package dev.gabriel447.supermarket.controllers;

import dev.gabriel447.supermarket.entities.Product;
import dev.gabriel447.supermarket.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        List<Product> result = productService.findAll();
        return result;
    }
}
