package com.example.springbootravi.jangid.springBootPr.jpa.controller;

import com.example.springbootravi.jangid.springBootPr.jpa.model.CarInfo;
import com.example.springbootravi.jangid.springBootPr.jpa.service.CarService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @RequestMapping("/showJspFile")
    public String showJspMessage(){
        return "index";
    }

    @RequestMapping("/takeinput")
    public String addNumber(){
        return "addwebpage";
    }
    @RequestMapping("add")
    public String result(HttpServletRequest request){
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int res = i+j;
        HttpSession session = request.getSession();
        session.setAttribute("num3",res);
        return "resultPage";
    }


//
//    @GetMapping("/showCarDetails")
//    public List<CarInfo> showCarInfo(){
//
//        return carService.getCarInfo();
//    }
//
//    @PostMapping("/addCarInfo")
//    public void insertCarInfo(@RequestBody CarInfo carInfo){
//        carService.addCarInfo(carInfo);
//    }
//
//    @DeleteMapping("/deleteCarInfo/{id}")
//    public void removeCarInfo(@PathVariable int id){
//        carService.deleteCarInfo(id);
//
//    }

}
