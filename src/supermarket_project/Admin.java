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
    
    public String addEmp(String fname, String lname, int salary, String department, int phone)
    {
        Report r = new Report();
        User u = new User();
        //Getting last id from file & set the new id % write the last id to the file
        try 
        {
            //Getting last id
            FileInputStream read_id_file = new FileInputStream("Users_id.bin");
            DataInputStream dis = new DataInputStream(read_id_file);
            int last_id = dis.readInt();
            
            //int last_id =0;
            
            //set new id for new emp
            u.setUser_id(last_id+1);
            
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
        u.setUser_fname(fname);
        u.setUser_lname(lname);
        u.setUser_salary(salary);
        u.setUser_department(department);
        u.setUser_phone(phone);
        
        //craet mail
//        u.setUser_mail(fname+"@market.com");
        u.setUser_mail(fname);
        //generate pass
        int min = 1111 , max = 9999;
        int pass = (int)Math.floor(Math.random()*(max-min+1)+min);
        u.setUser_pass(String.valueOf(pass));
        System.out.println("pass: " + u.getUser_pass());
        
        //write data to file
        r.addEmpToRe(u);
        return u.getUser_pass();
    }
    
    public String addSupplier(String fname, String lname, int phone, String supplier_company)
    {
        Report r = new Report();
        User u = new User();
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
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
        
        //data for new emp
        u.setUser_fname(fname);
        u.setUser_lname(lname);
        //setUser_salary(salary);
        u.setUser_department("Supplier");
        u.setUser_phone(phone);
        u.setSupplier_company(supplier_company);
        
        //craet mail
        //setUser_mail(fname+"@market.com");
        u.setUser_mail(fname);
        
        //generate pass
        int min = 1111 , max = 9999;
        int pass = (int)Math.floor(Math.random()*(max-min+1)+min);
        u.setUser_pass(String.valueOf(pass));
        System.out.println("pass: " + u.getUser_pass());
        //write data to file
        r.addEmpToRe(u);
        return u.getUser_pass();
    }
    
    public void creatOffers(int id , double offer)
    {
        try{
        Porduct_Offer p_o = new Porduct_Offer();
        Stock s = new Stock();
        
        //reading files
//        p_o.readFile();
          s.readFile();
          
        
        //check if the product is in stock
        if(s.check(id))
        {
            //check if the product is in offers list
            if(p_o.check(id))
            {
                //If there is, we will change the offer
                p_o.changeOffer(id, offer);
                p_o.writefile();
            }
            else{
                //If it doesn't exist we will create a new offer in the list
                p_o.creatOffer(id, offer);
                p_o.writefile();
            }
        }
        else
            System.out.println("The product is not in stock");
   
    }catch(Exception e){
            System.out.println(e.getMessage());
}
    }
    
    public void printReport(){
        
    }
}
