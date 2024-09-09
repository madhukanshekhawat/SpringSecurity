package com.example.springbootravi.jangid.springBootPr.subClasses;


import com.example.springbootravi.jangid.springBootPr.interfacesCollection.CountInterface;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class ClassOne implements CountInterface {
    public void runFunction(){
        System.out.println("This is class One");

    }
}
