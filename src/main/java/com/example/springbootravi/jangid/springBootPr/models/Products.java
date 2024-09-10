package com.example.springbootravi.jangid.springBootPr.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
public class Products {
    String name;
    int androidVersion;
    String processor;

    public Products(String name, int androidVersion, String processor) {
        this.name = name;
        this.androidVersion = androidVersion;
        this.processor = processor;
    }

    public Products() {
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", androidVersion=" + androidVersion +
                ", processor='" + processor + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(int androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
