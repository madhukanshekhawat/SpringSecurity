package com.example.springbootravi.jangid.springBootPr.services;


import com.example.springbootravi.jangid.springBootPr.dao.ProductDao;
import com.example.springbootravi.jangid.springBootPr.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MobileService {

    @Autowired
    private ProductDao productDao;

    public List<Products> getProduct(){
        return productDao.showProduct();
    }

    public void insertProduct(Products products){
        productDao.insertProduct(products);
    }

    public void updateProduct(Products products){
        productDao.updateProduct(products);
    }

    public void deleteProduct(int id) {
        productDao.deleteProduct(id);
    }
}
