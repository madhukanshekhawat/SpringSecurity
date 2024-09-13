package com.example.springbootravi.jangid.springBootPr.controller;


import com.example.springbootravi.jangid.springBootPr.models.Products;
import com.example.springbootravi.jangid.springBootPr.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import java.util.List;


//@RestController
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @RequestMapping("/showText")
    public String showText() {
        return "hello guys";
    }

    @GetMapping("/showAllProduct")
    public List<Products> showProducts(){
        try {
            return productServices.showProducts();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/addProduct")
    public void addProducts(@RequestBody Products product){
        System.out.println(product);
        productServices.addProduct(product);
    }

    @PutMapping("/updateProduct")
    public void updateProducts(@RequestBody Products products){
        productServices.updateData(products);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable int id){
        productServices.deleteData(id);
    }
}
