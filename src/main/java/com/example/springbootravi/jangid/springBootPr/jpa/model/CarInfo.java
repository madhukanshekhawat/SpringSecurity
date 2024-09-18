package com.example.springbootravi.jangid.springBootPr.jpa.model;


import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity
public class CarInfo {
    @Id
    int id;
    private String carBrand;
    String carModel;
    int launchDate;
    String country;

    @OneToOne
    @JoinColumn(name="person_id")
     PersonInfo personInfo;

    public CarInfo(int id, String carBrand, String carModel, int launchDate, String country, PersonInfo personInfo) {
        this.id = id;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.launchDate = launchDate;
        this.country = country;
        this.personInfo = personInfo;
    }

    public CarInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
