package com.example.springbootravi.jangid.springBootPr.services;


import com.example.springbootravi.jangid.springBootPr.dao.ProductDao;
import com.example.springbootravi.jangid.springBootPr.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {

    @Autowired
    private ProductDao productDao;

    public void fetchData(Products products){
        productDao.showMobileDataFromDb(products);

    }
    public void updateDataInDb(Products products){
        productDao.updateQuery(products);
    }

}
