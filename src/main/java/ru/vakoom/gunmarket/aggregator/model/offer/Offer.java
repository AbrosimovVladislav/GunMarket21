package ru.vakoom.gunmarket.aggregator.model.offer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.vakoom.gunmarket.aggregator.model.product.Product;
import ru.vakoom.gunmarket.aggregator.model.shop.Shop;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import static ru.vakoom.gunmarket.aggregator.model.product.Product.PRODUCT_ID;
import static ru.vakoom.gunmarket.aggregator.model.shop.Shop.SHOP_ID;

@Data
@Entity
@Table(name = Offer.OFFER_TABLE)
@NoArgsConstructor
@Accessors(chain = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Offer {
    public static final String OFFER_TABLE = "offer";
    public static final String OFFER_ID = "offerId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = OFFER_ID)
    private String productInShopId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = PRODUCT_ID, nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = SHOP_ID, nullable = false)
    private Shop shop;

    @Min(value = 0, message = "Offer price cannot be lower than 0")
    private double price;

    private boolean inStock;

    private String link;

    @Min(0)
    @Max(1)
    private double popularity;

    @SuppressWarnings("unused")
    public Offer(Product product, Shop shop, double price, boolean inStock, String link, double popularity) {
        this.productInShopId = product.getProductId() + ":" + shop.getShopId();
        this.product = product;
        this.shop = shop;
        this.price = price;
        this.inStock = inStock;
        this.link = link;
        this.popularity = popularity;
    }
}
