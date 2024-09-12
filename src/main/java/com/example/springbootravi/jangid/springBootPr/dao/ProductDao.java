package com.example.springbootravi.jangid.springBootPr.dao;


import com.example.springbootravi.jangid.springBootPr.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Products> showProduct() {
        String query = "SELECT * FROM mobile_product";
        return jdbcTemplate.query(query, (rs, _) -> {
            Products products = new Products();
            products.setId(rs.getInt("id"));
            products.setMobileBrand(rs.getString("mobile_brand"));
            products.setMobileModel(rs.getString("mobile_model"));
            products.setMobileOS(rs.getString("mobile_os"));
            products.setMobileDate(rs.getInt("mobile_date"));
            return products;
        });
    }

    public void insertProduct(Products products) {
        jdbcTemplate.update("INSERT INTO mobile_product(mobile_brand,mobile_model,mobile_os,mobile_date) VALUES (?,?,?,?)",
                products.getMobileBrand(), products.getMobileModel(), products.getMobileOS(), products.getMobileDate());
        System.out.println("insert successfully...");
    }

    public void updateProduct(Products products) {
        jdbcTemplate.update("UPDATE mobile_product SET mobile_brand=?,mobile_model=? ,mobile_os=?,mobile_date=? WHERE id=?",
                products.getMobileBrand(), products.getMobileModel(), products.getMobileOS(), products.getMobileDate(), products.getId());
        System.out.println("update successfully... ");
    }

    public void deleteProduct(int id) {
        jdbcTemplate.update("DELETE FROM mobile_product WHERE id=?", id);
        System.out.println("delete successfully..");
    }
}
