package ru.vakoom.gunmarket.aggregator.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.HashSet;
import java.util.Set;

import static ru.vakoom.gunmarket.aggregator.model.Brand.BRAND_ID;
import static ru.vakoom.gunmarket.aggregator.model.Product.PRODUCT_TABLE;
import static ru.vakoom.gunmarket.aggregator.model.Type.TYPE_ID;

@Entity
@Table(name = PRODUCT_TABLE)
@Builder
@Getter
@Setter
@ToString
public class Product implements BasicEntity {
    public static final String PRODUCT_TABLE = "product";
    public static final String PRODUCT_ID = "productId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = PRODUCT_ID)
    private Long productId;

    @ApiModelProperty("model")
    private String model;

    @ManyToOne
    @JoinColumn(name = BRAND_ID, nullable = false)
    @ApiModelProperty("brand")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = TYPE_ID, nullable = false)
    @ApiModelProperty("type")
    private Type type;

    @ApiModelProperty("description")
    private String description;
    @ApiModelProperty("characteristics")
    private String characteristics;
    @ApiModelProperty("link")
    private String link;
    @ApiModelProperty("srcImageLink")
    private String srcImageLink;
    @ApiModelProperty("imageLink")
    private String imageLink;
    @OneToMany(mappedBy = PRODUCT_TABLE)
    @ApiModelProperty("offers")
    private Set<Offer> offer = new HashSet<>();
    @Min(value = 0, message = "Product minPrice cannot be lower than 0")
    @ApiModelProperty("minPrice. Product minPrice cannot be lower than 0")
    private Double minPrice;
    @ApiModelProperty("maxPrice")
    private Double maxPrice;

}

