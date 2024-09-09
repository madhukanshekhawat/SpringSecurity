package com.example.springbootravi.jangid.springBootPr.classess;


import com.example.springbootravi.jangid.springBootPr.interfacesCollection.CountInterface;
import com.example.springbootravi.jangid.springBootPr.subClasses.ClassOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InterClass {
    @Autowired
    private ClassOne classOne;

    @Autowired
    @Qualifier("classOne")
    CountInterface countInterface;

    public void interFunction(){
        classOne.runFunction();

        countInterface.runFunction();

    }
    
}
