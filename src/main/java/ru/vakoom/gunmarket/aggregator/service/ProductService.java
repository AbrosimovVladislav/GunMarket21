package ru.vakoom.gunmarket.aggregator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vakoom.gunmarket.aggregator.model.product.Product;
import ru.vakoom.gunmarket.aggregator.repository.ProdcutRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProdcutRepo productRepo;

    public List<Product> getAll() {
        return productRepo.findAll();
    }

}
