package com.example.springbootravi.jangid.springBootPr.subClasses;

import com.example.springbootravi.jangid.springBootPr.interfacesCollection.CountInterface;
import org.springframework.stereotype.Component;

@Component
public class ClassTwo implements CountInterface {

    public void runFunction(){
        System.out.println("THis is class two");
    }
}
