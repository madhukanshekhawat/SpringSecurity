package com.example.springbootravi.jangid.springBootPr.dao;


import com.example.springbootravi.jangid.springBootPr.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void showMobileDataFromDb(Products products) {
       // Map<String,Object> maps = jdbcTemplate.queryForMap("SELECT * FROM mobileproducts WHERE name=?","oppo");
       // System.out.println(maps);
        jdbcTemplate.update("INSERT INTO mobileproducts VALUES (?,?,?)",products.getName(),products.getAndroidVersion(),products.getProcessor());
        System.out.println("insert successfully...");
    }

    public void updateQuery(Products products) {
        jdbcTemplate.update("UPDATE mobileproducts SET version=?,processor=? WHERE name=?",products.getAndroidVersion(),products.getProcessor(),products.getName());
        System.out.println("update successfully... ");
    }
}
