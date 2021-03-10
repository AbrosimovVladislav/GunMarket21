package ru.vakoom.gunmarket.aggregator.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Brand {
    public static final String BRAND_TABLE = "brand";
    public static final String BRAND_ID = "brandId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = BRAND_ID)
    private Long brandId;
}
