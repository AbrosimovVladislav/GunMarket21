package ru.vakoom.gunmarket.aggregator.model.shop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = Shop.SHOP_TABLE)
@Getter
@Setter
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Shop {

    public static final String SHOP_TABLE = "shop";
    public static final String SHOP_ID = "shopId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = SHOP_ID, nullable = false)
    private Long shopId;

}
