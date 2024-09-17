package com.example.springbootravi.jangid.springBootPr.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Scope;

@Entity
@Scope("prototype")
@Table(name="person_info")
public class PersonInfo {
    @Id
    int id;
    String personName;
    String personAge;

    @OneToOne
     CarInfo carInfo;

    public PersonInfo(int id, String personName, String personAge) {
        this.id = id;
        this.personName = personName;
        this.personAge = personAge;
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

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }
}
