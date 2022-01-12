/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;
import java.util.*;
import java.io.*;
public class Manager 
{
    public Manager(){}
    
    public void creatProduct(int product_id, String product_name, double product_price, String product_brand,
            String product_categorg, int product_production_date, int product_expiry_date, int qty)
    {
        Product p = new Product(product_id, product_name, product_price, product_brand,
            product_categorg, product_production_date, product_expiry_date);
        Stock s = new Stock();
        s.readFile();
        s.creatProduct(p,qty);
    }
    
    public void addProduct(int id, int product_production_date, int product_expiry_date, int qty)
    {
        Product old = new Product();
        Product p   = new Product();
        Stock s = new Stock();
        
        old = s.getProduct(id);
        
        if(old.getProduct_production_date() == product_production_date && old.getProduct_expiry_date() == product_expiry_date)
        {
            s.incQty(id, qty);
        }
        else
        {
            p.setProduct_id(id);
            p.setProduct_name(old.getProduct_name());
            p.setProduct_price(old.getProduct_price());
            p.setProduct_brand(old.getProduct_brand());
            p.setProduct_categorg(old.getProduct_categorg());
            p.setProduct_production_date(product_production_date);
            p.setProduct_expiry_date(product_expiry_date);
            s.readFile();
            s.creatProduct(p,qty);
        }
    }
    
    public void creatOrderRequste(HashMap<Product,Integer> order_details)
    {
        Order o = new Order();
        Date d = new Date();
        
        try 
        {
            //set id
            //Getting last id
            FileInputStream read_id_file = new FileInputStream("orders_id.bin");
            DataInputStream dis = new DataInputStream(read_id_file);
            
            int last_id = dis.readInt();
            
//            if(last_id == null)
//                last_id=0;
            
            //set new id for new order
            o.setOrder_id(+1);
            //return the new id to the file
            FileOutputStream write_id_file = new FileOutputStream("Invoices_id.bin");
            DataOutputStream dos = new DataOutputStream(write_id_file);
            dos.writeInt(last_id+1);
        }
        catch (FileNotFoundException e){
            System.out.println("ID File Not found");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        o.setOrder_details(order_details);
        o.setDate_requsted(d);
    }
}
