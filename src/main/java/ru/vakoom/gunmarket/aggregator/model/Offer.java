package ru.vakoom.gunmarket.aggregator.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Offer {
    public static final String OFFER_TABLE = "offer";
    public static final String OFFER_ID = "offerId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = OFFER_ID)
    private Long offerId;
}
