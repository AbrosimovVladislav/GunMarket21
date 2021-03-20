package ru.vakoom.gunmarket.aggregator.model.product_attribute;

import lombok.Data;

import javax.persistence.*;

import static ru.vakoom.gunmarket.aggregator.model.product_attribute.Type.TYPE_TABLE;

@Data
@Entity
@Table(name = TYPE_TABLE)
public class Type {

    public static final String TYPE_TABLE = "type";
    public static final String TYPE_ID = "typeId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = TYPE_ID)
    private Long typeId;

}
