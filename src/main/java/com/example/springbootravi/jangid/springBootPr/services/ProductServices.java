package com.example.springbootravi.jangid.springBootPr.services;

import com.example.springbootravi.jangid.springBootPr.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {

    @Autowired
    MobileService mobileService;

    public void addProduct(Products product) {
        mobileService.insertProduct(product);
    }

    public void updateData(Products products) {
        mobileService.updateProduct(products);
    }
    public void deleteData(int id) {
        mobileService.deleteProduct(id);

    }

    public List<Products> showProducts() {
        return mobileService.getProduct();
    }
}
