package com.example.springbootravi.jangid.springBootPr.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
public class Products {
    int id ;
    String mobileBrand;
    String mobileModel;
    String mobileOS;
    int mobileDate;

    public Products() {
    }

    public Products(int id, String mobileBrand, String mobileModel, String mobileOS, int mobileDate) {
        this.id = id;
        this.mobileBrand = mobileBrand;
        this.mobileModel = mobileModel;
        this.mobileOS = mobileOS;
        this.mobileDate = mobileDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public String getMobileOS() {
        return mobileOS;
    }

    public void setMobileOS(String mobileOS) {
        this.mobileOS = mobileOS;
    }

    public int getMobileDate() {
        return mobileDate;
    }

    public void setMobileDate(int mobileDate) {
        this.mobileDate = mobileDate;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", mobileBrand='" + mobileBrand + '\'' +
                ", mobileModel='" + mobileModel + '\'' +
                ", mobileOS='" + mobileOS + '\'' +
                ", mobileDate=" + mobileDate +
                '}';
    }
}
