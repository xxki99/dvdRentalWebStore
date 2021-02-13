package com.dvdrental.webStore.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {

    @Id
    @GeneratedValue
    @Column(name="category_id")
    private Integer categoryId;

    @Column(name="name")
    private String name;

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
