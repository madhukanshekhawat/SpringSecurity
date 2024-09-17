package com.example.springbootravi.jangid.springBootPr.jpa.service;

import com.example.springbootravi.jangid.springBootPr.jpa.model.CarInfo;
import com.example.springbootravi.jangid.springBootPr.jpa.services.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarService {

    @Autowired
    CarRepo repository;
    
    public void addCarInfo(CarInfo carInfo) {
        repository.save(carInfo);

    }

    public List<CarInfo> getCarInfo() {
        return repository.findAll();
    }


    public void deleteCarInfo(int id) {
         repository.deleteById(id);
    }
}
