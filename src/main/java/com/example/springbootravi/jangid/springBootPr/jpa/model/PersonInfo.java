package com.example.springbootravi.jangid.springBootPr.jpa.model;

import jakarta.persistence.*;
import org.apache.catalina.startup.HomesUserDatabase;
import org.springframework.context.annotation.Scope;
import java.util.ArrayList;
import java.util.List;

@Entity
@Scope("prototype")
@Table(name="person_info")
public class PersonInfo {
    @Id
    int id;
    String personName;
    int personAge;

    @OneToOne(mappedBy = "personInfo",cascade = CascadeType.ALL)
     CarInfo carInfo;

    @OneToMany(mappedBy ="personInfo",cascade = CascadeType.ALL)
    List<HouseInfo> house = new ArrayList<>();

    public PersonInfo() {
    }

    public PersonInfo(int id, String personName, int personAge, CarInfo carInfo, List<HouseInfo> house) {
        this.id = id;
        this.personName = personName;
        this.personAge = personAge;
        this.carInfo = carInfo;
        this.house = house;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(CarInfo carInfo) {
        this.carInfo = carInfo;
    }

    public List<HouseInfo> getHouse() {
        return house;
    }

    public void setHouse(List<HouseInfo> house) {
        this.house = house;
    }
}
