package com.example.springbootravi.jangid.springBootPr.controller;


import com.example.springbootravi.jangid.springBootPr.models.Products;
import com.example.springbootravi.jangid.springBootPr.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @RequestMapping("/")
    private List<Products> prController(){
        return productServices.productService();
    }

    @RequestMapping("/showText")
    public String ShowText(){
        return "hello guys";
    }

    @GetMapping("/{prName}")
    public Products getPrByName(@PathVariable String prName){
        return productServices.getPrByName(prName);
    }

    @PostMapping("/productPage")
    public void setUpProduct(@RequestBody Products product){
        System.out.println(product);
        productServices.settingProduct(product);
    }

    @PutMapping("/productPage")
    public void putData(@RequestBody Products products){
        productServices.updateData(products);
    }

    @DeleteMapping("/productPage/{mobileName}")
    public void deleteData(@PathVariable String mobileName){
        productServices.deleteData(mobileName);
    }


}
