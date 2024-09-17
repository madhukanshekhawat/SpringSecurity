package com.example.springbootravi.jangid.springBootPr.jpa.services;

import com.example.springbootravi.jangid.springBootPr.jpa.model.HouseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepo extends JpaRepository<HouseInfo,Integer> {

}
