package com.example.springbootravi.jangid.springBootPr;

import com.example.springbootravi.jangid.springBootPr.jpa.model.CarInfo;
import com.example.springbootravi.jangid.springBootPr.jpa.model.HouseInfo;
import com.example.springbootravi.jangid.springBootPr.jpa.model.PersonInfo;
import com.example.springbootravi.jangid.springBootPr.jpa.repository.PersonRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootPrApplication {

//	@Autowired
//	CarRepo repo;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootPrApplication.class, args);

//		CarRepo repo = applicationContext.getBean(CarRepo.class);
//		HouseRepo houseRepository = applicationContext.getBean(HouseRepo.class);
//		PersonRepo personRepo = applicationContext.getBean(PersonRepo.class);
//
//		CarInfo car1 = new CarInfo();
//		car1.setId(3);
//		car1.setCarBrand("mercedes");
//		car1.setCarModel("x31");
//		car1.setLaunchDate(2021);
//		car1.setCountry("india");
//
//		PersonInfo personInfo = new PersonInfo();
//		personInfo.setId(2);
//		personInfo.setPersonAge(21);
//		personInfo.setPersonName("Tony stark");
//
//		HouseInfo house1 = new HouseInfo();
//		house1.setId(1);
//		house1.setDistrict("jaipur");
//		house1.setStreet("triveni dham");
//		house1.setPlotNumber("12");
//		house1.setState("rajasthan");
//		house1.setPinCode(302342);
//		HouseInfo house2 = new HouseInfo();
//		house2.setId(2);
//		house2.setDistrict("pali");
//		house2.setStreet("ganesh nagar");
//		house2.setPlotNumber("42");
//		house2.setState("rajasthan");
//		house2.setPinCode(432232);
//
//		List<HouseInfo> houseList = new ArrayList<>();
//		houseList.add(house1);
//		houseList.add(house2);
//
//
//		personInfo.setHouse(houseList);
//		personInfo.setCarInfo(car1);
//		house1.setPersonInfo(personInfo);
//		house2.setPersonInfo(personInfo);
//		car1.setPersonInfo(personInfo);
//
//
//
//		personRepo.save(personInfo);
//




	}


}
