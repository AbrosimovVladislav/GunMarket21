package ru.vakoom.gunmarket.aggregator.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.gunmarket.aggregator.model.product.Product;
import ru.vakoom.gunmarket.aggregator.service.ProductService;
import ru.vakoom.gunmarket.aggregator.web.dto.MatcherProductDto;
import ru.vakoom.gunmarket.aggregator.web.mapper.MatcherProductMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final MatcherProductMapper matcherProductMapper;

    @CrossOrigin
//    @MeasurePerformance
    @GetMapping(value = "/allProducts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MatcherProductDto>> getAll() {
        List<Product> products = productService.getAll();
        return ResponseEntity.ok(matcherProductMapper.mapList(products));
    }

}
