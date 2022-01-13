/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;

import java.io.*;
import java.util.*;

public class Stock implements Serializable
{
    public HashMap<Integer,Product> stock_details_product_details=new HashMap<Integer,Product>();
    public HashMap<Product, Integer> stock_qty_details=new HashMap<Product, Integer>();

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
            FileInputStream read_PS_map_file = new FileInputStream("Dproducts.bin");
            ObjectInputStream ois1 = new ObjectInputStream(read_PS_map_file);
            setStock_details((HashMap<Integer,Product>) ois1.readObject());
            ois1.close();
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
        
        try 
        {
            FileInputStream read_QS_map_file = new FileInputStream("Qproducts.bin");
            ObjectInputStream ois2 = new ObjectInputStream(read_QS_map_file);
            setStock_qty_details((HashMap<Product, Integer>) ois2.readObject());
            ois2.close();
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
        //readFile();
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
    
    public void WriteFilepro()
    {
        try 
        {
            FileOutputStream write_RSS_map_file = new FileOutputStream("Dproducts.bin");
            ObjectOutputStream ois1 = new ObjectOutputStream(write_RSS_map_file);
            ois1.writeObject(stock_details_product_details);
            ois1.flush();
            ois1.close();
            
            
        } 
        catch (FileNotFoundException e) {
            System.out.println("Products File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
        try{
            FileOutputStream write_RIS_map_file = new FileOutputStream("Qproducts.bin");
            ObjectOutputStream ois2 = new ObjectOutputStream(write_RIS_map_file);
            ois2.writeObject(stock_qty_details);
            ois2.flush();
            ois2.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Products File Not found");
        }
        catch (IOException e1) {
            
            System.out.println(e1.getMessage());
        } 
    }
    public void view()
    {
       
       
           //getProduct().toString();
       
    }
    
}
