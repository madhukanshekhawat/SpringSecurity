package com.example.springbootravi.jangid.springBootPr.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Entity
public class HouseInfo {
    @Id
    private int id;
    private String plotNumber;
    private String street;
    private String district;
    private String state;
    private int pinCode;

    @ManyToOne
    PersonInfo personInfo;

    public HouseInfo() {
    }

    public HouseInfo(int id, String plotNumber, String street, String district, String state, int pinCode, PersonInfo personInfo) {
        this.id = id;
        this.plotNumber = plotNumber;
        this.street = street;
        this.district = district;
        this.state = state;
        this.pinCode = pinCode;
        this.personInfo = personInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
