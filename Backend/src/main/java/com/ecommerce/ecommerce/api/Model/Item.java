package com.ecommerce.ecommerce.api.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "items")
public class Item {
        @Column(name = "id")
        private String id;
        @Column(name = "name")
        private String name;
        @Column(name = "category")
        private String category;
        @Column(name = "price")
        private double price;

    public Integer getprice() {
        return this.getprice();
    }

    public String getCategory() {
        return this.getCategory();
    }

    public Integer getPrice() {
     return this.getprice();
    }

    public Object getType() {
        return getType();
    }

    }


