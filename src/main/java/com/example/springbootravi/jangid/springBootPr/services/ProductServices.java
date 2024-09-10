package com.example.springbootravi.jangid.springBootPr.services;

import com.example.springbootravi.jangid.springBootPr.models.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {

     List<Products> productsList = new ArrayList<>(Arrays.asList(
            new Products("samsung",14,"snapdragon 8 gen 1"),
            new Products("oneplus",14,"snapdragon 8 gen 3")));




    public List<Products> productService(){
        return productsList;
    }

    public Products getPrByName(String prName) {
        return productsList.stream()
                .filter(p->p.getName().equals(prName))
                .findFirst().orElse(new Products("new Phone",15,"qualcom demensity"));
    }

    public void settingProduct(Products product) {
        productsList.add(product);
    }



    public int giveIndex(String mobile){
        int index=0;
        int check=-1;
        for(int i=0;i<productsList.size();i++){
            if(productsList.get(i).getName().equals(mobile)){
                index = i;
                check=1;
                break;
            }
        }
        if(check==-1){
            return -1;
        }else{
            return index;
        }
    }


    public void updateData(Products products) {

        int check = giveIndex(products.getName());
        if(check>=0){
            productsList.set(check,products);
        }else{
            System.out.println("Data not Found...");
        }

    }

    public void deleteData(String mobileName) {
        int check = giveIndex(mobileName);
        if(check>=0){
            productsList.remove(check);
        }else{
            System.out.println("data not found for delete...");
        }
    }
}
