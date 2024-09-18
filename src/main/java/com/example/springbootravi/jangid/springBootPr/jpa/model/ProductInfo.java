package com.example.springbootravi.jangid.springBootPr.jpa.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ProductInfo {
    @Id
    private int id;
    private String productName;
    private float price;

    @ManyToMany
    List<CategoriesInfo> categoriesInfoList = new ArrayList<>();

    public ProductInfo() {
    }

    public ProductInfo(int id, String productName, float price, List<CategoriesInfo> categoriesInfoList) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.categoriesInfoList = categoriesInfoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<CategoriesInfo> getCategoriesInfoList() {
        return categoriesInfoList;
    }

    public void setCategoriesInfoList(List<CategoriesInfo> categoriesInfoList) {
        this.categoriesInfoList = categoriesInfoList;
    }
}
