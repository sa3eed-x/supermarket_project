/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;

import java.io.*;
import java.util.*;

public class Admin extends User implements Serializable
{
    public Admin(){}
    
    public void addEmp(String fname, String lname, int salary, String department, int phone)
    {
        //Getting last id from file & set the new id % write the last id to the file
        try 
        {
            //Getting last id
            FileInputStream read_id_file = new FileInputStream("Users_id.bin");
            DataInputStream dis = new DataInputStream(read_id_file);
            int last_id = dis.readInt();
            
            //set new id for new emp
            setUser_id(last_id+1);
            
            //return the new id to the file
            FileOutputStream write_id_file = new FileOutputStream("Users_id.bin");
            DataOutputStream dos = new DataOutputStream(write_id_file);
            dos.writeInt(last_id+1);
        }
        catch (FileNotFoundException e){
            System.out.println("ID File Not found");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        //data for new emp
        setUser_fname(fname);
        setUser_lname(lname);
        setUser_salary(salary);
        setUser_department(department);
        setUser_phone(phone);
        
        //craet mail
        setUser_mail(fname+"@market.com");
        
        //generate pass
        int min = 1 , max = 7;
        int pass = (int)Math.floor(Math.random()*(max-min+1)+min);
        setUser_pass(String.valueOf(pass));
        
        //write data to file
        
    }
    
    public void addSupplier(String fname, String lname, int salary, String department, int phone, String supplier_company)
    {
        //Getting last id from file & set the new id % write the last id to the file
        try 
        {
            //Getting last id
            FileInputStream read_id_file = new FileInputStream("id.bin");
            DataInputStream dis = new DataInputStream(read_id_file);
            int last_id = dis.readInt();
            
            //set new id for new emp
            setUser_id(last_id+1);
            
            //return the new id to the file
            FileOutputStream write_id_file = new FileOutputStream("id.bin");
            DataOutputStream dos = new DataOutputStream(write_id_file);
            dos.writeInt(last_id+1);
        }
        catch (FileNotFoundException e){
            System.out.println("ID File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
        
        //data for new emp
        setUser_fname(fname);
        setUser_lname(lname);
        setUser_salary(salary);
        setUser_department(department);
        setUser_phone(phone);
        setSupplier_company(supplier_company);
        
        //craet mail
        setUser_mail(fname+"@market.com");
        
        //generate pass
        int min = 1 , max = 7;
        int pass = (int)Math.floor(Math.random()*(max-min+1)+min);
        setUser_pass(String.valueOf(pass));
        
        //write data to file
        
    }
    
    public void creatOffers(int id , double offer)
    {
        Porduct_Offer p_o = new Porduct_Offer();
        Stock s = new Stock();
        
        //reading files
        p_o.readFile();
        s.readFile();
        
        //check if the product is in stock
        if(s.check(id))
        {
            //check if the product is in offers list
            if(p_o.check(id))
            {
                //If there is, we will change the offer
                p_o.changeOffer(id, offer);
            }
            else
            {
                //If it doesn't exist we will create a new offer in the list
                p_o.creatOffer(id, offer);
            }
        }
        else
            System.out.println("The product is not in stock");
    }
    
    public void printReport(){
        
    }
}
