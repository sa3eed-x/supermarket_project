/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;
import java.util.*;
import java.io.*;

public class Invoice 
{
    private int invoice_id;
    private HashMap<Product,Integer> items;
    private ArrayList<Integer> ids;

    public void setIds(ArrayList<Integer> ids) {
        this.ids = ids;
    }

    public ArrayList<Integer> getIds() {
        return ids;
    }
    private double totalprice;
    private Date date;
    
    public Invoice(){}

    public int getInvoice_id() {
        return invoice_id;
    }

    public HashMap<Product, Integer> getItems() {
        return items;
    }

    public double gettotalprice() {
        return totalprice;
    }

    public Date getDate() {
        return date;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public void setItems(HashMap<Product, Integer> items) {
        this.items = items;
    }

    public void settotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public void addItemToInvoice(int id , int qty)
    {
        Stock s = new Stock();
        Product p = new Product();
        
        p = s.getProduct(id);
        items.put(p, qty);
        ids.add(id);
    }
    
    public int getSizeOfItemsList()
    {
        return items.size();
    }
    
    public int getQty(Product p)
    {
        return items.get(p);
    }
    
    public void rempro(Product p, int QTY)
    {
        Stock s = new Stock();
        
        s.incQty(p.getProduct_id(), QTY);
        items.remove(p);
        ids.remove(p.getProduct_id());
        
    }
    
    public void incQty(Product p, int x)
    {
        int new_qty = items.get(p)-x;
        
        items.replace(p, new_qty);
    }
}
