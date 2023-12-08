package dev.gabriel447.supermarket.services;

import dev.gabriel447.supermarket.entities.Product;
        import dev.gabriel447.supermarket.repositories.ProductRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll() {
        List<Product> result = productRepository.findAll();
        return  result;
    }

    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }
}
