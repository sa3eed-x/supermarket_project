/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;

import java.io.*;
import java.util.*;

public class Stock implements Serializable
{
    private HashMap<Integer,Product> stock_details_product_details;
    private HashMap<Product, Integer> stock_qty_details;

    public Stock(){}
    
    public void setStock_qty_details(HashMap<Product, Integer> stock_qty_details) {
        this.stock_qty_details = stock_qty_details;
    }

    public HashMap<Product, Integer> getStock_qty_details() {
        return stock_qty_details;
    }

    public HashMap<Integer,Product> getStock_details() {
        return stock_details_product_details;
    }

    public void setStock_details(HashMap<Integer,Product> stock_details_product_details) {
        this.stock_details_product_details = stock_details_product_details;
    }
    
    public void printStockDetails(){
    
    }
    
    public void readFile()
    {
        try 
        {
            FileInputStream read_PS_map_file = new FileInputStream("PStock.bin");
            ObjectInputStream ois1 = new ObjectInputStream(read_PS_map_file);
            setStock_details((HashMap<Integer,Product>) ois1.readObject());
            
            FileInputStream read_QS_map_file = new FileInputStream("QStock.bin");
            ObjectInputStream ois2 = new ObjectInputStream(read_QS_map_file);
            setStock_qty_details((HashMap<Product, Integer>) ois2.readObject());
        } 
        catch (FileNotFoundException e) {
            System.out.println("Stock HashMap File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
        catch (ClassNotFoundException e2) {
            System.out.println(e2.getMessage());
        }
    }
    
    public boolean check(int id)
    {
        boolean found = false;
        
        while (!found) 
        {
            if(stock_details_product_details.containsKey(id))
                found = true;
        }
        return found;
    }
    
    public Product getProduct(int id)
    {
        if(check(id))
        {
            return stock_details_product_details.get(id);
        }
        else
        {
            System.out.println("product not found");
            return null;
        }
    }
    public void redQty(int id , int qty)
    {
        Product p = new Product();
        
        p = getProduct(id);
        int old_qty = stock_qty_details.get(id);
        stock_qty_details.replace(p, old_qty-qty);
    }
    
    public void incQty(int id , int qty)
    {
        Product p = new Product();
        
        p = getProduct(id);
        int old_qty = stock_qty_details.get(id);
        stock_qty_details.replace(p, old_qty+qty);
    }
    
    public void creatProduct(Product p, int qty)
    {
        stock_details_product_details.put(p.getProduct_id(), p);
        stock_qty_details.put(p, qty);
    }
}
