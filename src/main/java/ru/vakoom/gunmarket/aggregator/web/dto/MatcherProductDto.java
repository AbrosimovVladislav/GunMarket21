package ru.vakoom.gunmarket.aggregator.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.vakoom.gunmarket.aggregator.model.product_attribute.Type;

@Setter
@Getter
@Accessors(chain = true)
public class MatcherProductDto {
    private Long productId;
    private String model;
    private String brand;
    private Type type;
    private String age;
    private String link;
}
