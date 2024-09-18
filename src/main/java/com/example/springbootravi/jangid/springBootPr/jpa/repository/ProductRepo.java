package com.example.springbootravi.jangid.springBootPr.jpa.repository;

import com.example.springbootravi.jangid.springBootPr.jpa.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductInfo,Integer> {
}
