package ru.vakoom.gunmarket.aggregator.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Type {

    public static final String TYPE_TABLE = "type";
    public static final String TYPE_ID = "typeId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = TYPE_ID)
    private Long typeId;

}
