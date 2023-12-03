package dev.gabriel447.supermarket.repositories;

import dev.gabriel447.supermarket.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
