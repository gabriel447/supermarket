package dev.gabriel447.supermarket.services;

import dev.gabriel447.supermarket.entities.Product;
        import dev.gabriel447.supermarket.repositories.ProductRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll() {
        List<Product> result = productRepository.findAll();
        return  result;
    }
}
