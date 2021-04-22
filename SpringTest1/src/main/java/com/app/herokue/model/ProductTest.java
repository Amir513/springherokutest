package com.app.herokue.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCTTEST_TBL")
public class ProductTest {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;
}
