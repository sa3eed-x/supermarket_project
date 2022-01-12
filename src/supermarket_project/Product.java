/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;

import java.util.*;

public class Product 
{
    private int product_id;
    private String product_name;
    private double product_price;
    private String product_brand;
    private String product_categorg;
    private int product_production_date;
    private int product_expiry_date;
    
    public Product(){}

    public Product(int product_id, String product_name, double product_price, String product_brand, String product_categorg, int product_production_date, int product_expiry_date) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_brand = product_brand;
        this.product_categorg = product_categorg;
        this.product_production_date = product_production_date;
        this.product_expiry_date = product_expiry_date;
    }
    
    public int getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public String getProduct_categorg() {
        return product_categorg;
    }

    public int getProduct_production_date() {
        return product_production_date;
    }

    public int getProduct_expiry_date() {
        return product_expiry_date;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    public void setProduct_categorg(String product_categorg) {
        this.product_categorg = product_categorg;
    }

    public void setProduct_production_date(int product_production_date) {
        this.product_production_date = product_production_date;
    }

    public void setProduct_expiry_date(int product_expiry_date) {
        this.product_expiry_date = product_expiry_date;
    }
    
    
}
