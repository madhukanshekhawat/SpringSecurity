package com.example.springbootravi.jangid.springBootPr;

import com.example.springbootravi.jangid.springBootPr.classess.InterClass;
import com.example.springbootravi.jangid.springBootPr.subClasses.ClassOne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootPrApplication {

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(SpringBootPrApplication.class, args);

		InterClass interClass = applicationContext.getBean(InterClass.class);
		interClass.interFunction();
	}

}
