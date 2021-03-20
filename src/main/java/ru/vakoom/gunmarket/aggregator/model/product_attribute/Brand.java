package ru.vakoom.gunmarket.aggregator.model.product_attribute;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import ru.vakoom.gunmarket.aggregator.model.product.Product;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = Brand.BRAND_TABLE)
public class Brand {
    public static final String BRAND_TABLE = "brand";
    public static final String BRAND_ID = "brandId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = BRAND_ID)
    private Long brandId;

    private String shortName;

    private String fullName;

    @JsonIgnore
    @OneToMany(mappedBy = BRAND_TABLE)
    private Set<Product> product;
}
