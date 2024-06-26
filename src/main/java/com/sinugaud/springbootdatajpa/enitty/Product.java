package com.sinugaud.springbootdatajpa.enitty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Byte imageUri;
    private String name;
    private String description;
    private double price;
    private double quantity;
//    private long cartId;

}
