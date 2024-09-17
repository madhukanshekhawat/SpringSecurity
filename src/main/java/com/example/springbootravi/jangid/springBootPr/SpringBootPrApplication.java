package com.example.springbootravi.jangid.springBootPr;

import com.example.springbootravi.jangid.springBootPr.jpa.model.CarInfo;
import com.example.springbootravi.jangid.springBootPr.jpa.services.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBootPrApplication {

//	@Autowired
//	CarRepo repo;
	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(SpringBootPrApplication.class, args);
//		System.out.println("program starts...");
//
		CarRepo repo = applicationContext.getBean(CarRepo.class);
//
//		System.out.println("Line1..");
//		CarInfo mobile1 = applicationContext.getBean(CarInfo.class);
//		System.out.println("Line2..");
		CarInfo mobile2 = applicationContext.getBean(CarInfo.class);
//		System.out.println("Line3..");
//		CarInfo mobile3 = applicationContext.getBean(CarInfo.class);
//
//		mobile1.setId(1);
//		mobile1.setCarBrand("maruti suzuki");
//		mobile1.setCarModel("alto");
//		mobile1.setLaunchDate(2001);
//		mobile1.setCountry("india");

		mobile2.setId(2);
		mobile2.setCarBrand("maruti suzuki");
		mobile2.setCarModel("breza");
		mobile2.setLaunchDate(2019);
		mobile2.setCountry("india");
//
//		mobile3.setId(3);
//		mobile3.setCarBrand("hundai");
//		mobile3.setCarModel("i10");
//		mobile3.setLaunchDate(2010);
//		mobile3.setCountry("usa");
//		System.out.println("object created..");
//
//		repo.save(mobile1);
//		System.out.println("main class....");

		repo.save(mobile1);







	}


}
