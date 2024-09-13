package com.example.springbootravi.jangid.springBootPr.jpa.services;

import com.example.springbootravi.jangid.springBootPr.jpa.model.CarInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface CarRepo extends JpaRepository<CarInfo,Integer> {
}
