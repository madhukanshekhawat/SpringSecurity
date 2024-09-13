package com.example.springbootravi.jangid.springBootPr.jpa.controller;

import com.example.springbootravi.jangid.springBootPr.jpa.model.CarInfo;
import com.example.springbootravi.jangid.springBootPr.jpa.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/showCarDetails")
    public List<CarInfo> showCarInfo(){

        return carService.getCarInfo();
    }

    @PostMapping("/addCarInfo")
    public void insertCarInfo(@RequestBody CarInfo carInfo){
        carService.addCarInfo(carInfo);
    }

}
