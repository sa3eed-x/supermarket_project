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