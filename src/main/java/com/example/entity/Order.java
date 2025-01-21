package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = )
    private int id;
    private String name;

}
