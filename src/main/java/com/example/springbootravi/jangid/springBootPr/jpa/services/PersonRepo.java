package com.example.springbootravi.jangid.springBootPr.jpa.services;

import com.example.springbootravi.jangid.springBootPr.jpa.model.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<PersonInfo , Integer> {
}
