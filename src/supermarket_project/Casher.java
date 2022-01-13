/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Casher extends User
{
    public Casher(){}
    
    public void makeInvoices(ArrayList<Integer> items_ids, HashMap<Integer,Integer> items_qtys)
    {
        Invoice i = new Invoice();
        Stock   s = new Stock();
        Payment p = new Payment();
        Report  r = new Report();
        
        try 
        {
            //set id
            //Getting last id
            FileInputStream read_id_file = new FileInputStream("Invoices_id.bin");
            DataInputStream dis = new DataInputStream(read_id_file);
            
            int last_id = dis.readInt();
            
//            if(last_id == null)
//                last_id=0;
            
            //set new id for new emp
            i.setInvoice_id(last_id+1);
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
        
        //s.readFile();
        
        //check items
        for (int j = 0; j < items_ids.size(); j++) 
        {
            if(!s.check(items_ids.get(j)))
            {
                System.out.println("ID: " + items_ids.get(j) + " is wrong");
                items_ids.remove(j);
            }
        }
        //add items to the invoice & reduce quantity in the stock
        for (int j = 0; j < items_ids.size(); j++) 
        {
            i.addItemToInvoice(items_ids.get(j), items_qtys.get(j));
            s.redQty(items_ids.get(j), items_qtys.get(j));
        }
        
        //calc total price
        p.calcTotalPrice();
        
        //date
        Date d = new Date();
        i.setDate(d);
        
        //store the invoice
        r.storeNewInv(i.getInvoice_id(),i);
        
        //write
        r.writeFileInv();
    }
    
    public void editInvoice(int id, Product p, short opr, int qty)
    {
        Invoice i  = new Invoice();
        Stock   s  = new Stock();
        Payment py = new Payment();
        Report  r  = new Report();
        
        r.readFileReport();
        
        if(r.chekinv(id))
        {
            i = r.getInv(id);
            
            // -1 for remove item & 1 for increasing QTY
            if(opr==-1)
            {
                i.rempro(p,i.getQty(p));
            }
            else
            {
                i.incQty(p, qty);
                s.incQty(p.getProduct_id(), qty);
            } 
        }
        else
            System.out.println("ID wrong");
    }
}