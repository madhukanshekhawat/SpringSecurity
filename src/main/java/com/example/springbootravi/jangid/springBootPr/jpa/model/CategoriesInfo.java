package com.example.springbootravi.jangid.springBootPr.jpa.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CategoriesInfo {
    @Id
    private int id;
    private String automobile;
    private String electronics;
    private String mobile;
    private String tv;
   // Private

    @ManyToMany(mappedBy = "categoriesInfoList",cascade = CascadeType.ALL)
    List<ProductInfo> productInfoList = new ArrayList<>();

    public CategoriesInfo() {
    }

    public CategoriesInfo(int id, String automobile, String electronics, String mobile, String tv, List<ProductInfo> productInfoList) {
        this.id = id;
        this.automobile = automobile;
        this.electronics = electronics;
        this.mobile = mobile;
        this.tv = tv;
        this.productInfoList = productInfoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutomobile() {
        return automobile;
    }

    public void setAutomobile(String automobile) {
        this.automobile = automobile;
    }

    public String getElectronics() {
        return electronics;
    }

    public void setElectronics(String electronics) {
        this.electronics = electronics;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
    }
}
