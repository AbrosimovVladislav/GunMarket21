package ru.vakoom.gunmarket.aggregator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vakoom.gunmarket.aggregator.model.product.Product;

public interface ProdcutRepo extends JpaRepository<Product, Long> {
}
