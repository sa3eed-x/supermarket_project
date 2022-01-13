/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;

import java.util.*;
import java.io.*;

public class Report implements Serializable
{
    private HashMap<Product,Integer> sales=new HashMap<Product,Integer>();
    private HashMap<Integer, Invoice> invoices=new HashMap<Integer, Invoice>();
    private ArrayList<Integer> ids=new ArrayList<Integer>();
    public ArrayList<User> users=new ArrayList<User>();
    private ArrayList<Order> orders=new ArrayList<Order>();
    private ArrayList<Integer> ids_ord=new ArrayList<Integer>();
    
    
    public Report(){}

    public HashMap<Product, Integer> getSales() {
        return sales;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setInvoices(HashMap<Integer, Invoice> invoices) {
        this.invoices = invoices;
    }

    public void setIds(ArrayList<Integer> ids) {
        this.ids = ids;
    }

    public HashMap<Integer, Invoice> getInvoices() {
        return invoices;
    }

    public ArrayList<Integer> getIds() {
        return ids;
    }
    
    public void setSales(HashMap<Product, Integer> sales) {
        this.sales = sales;
    }
    
    public void storeNewInv(int id, Invoice i)
    {
        invoices.put(id,i);
        ids.add(id);
    }
    
    public boolean chekinv(int id)
    {
        for (int i = 0; i < ids.size(); i++) 
        {
            if(id == ids.get(id))
                return true;
        }
        return false;
    }
    
    public Invoice getInv(int id)
    {
        return invoices.get(id);
    }
    
    public void readFileReport()
    {
        try 
        {
            FileInputStream read_RSS_map_file = new FileInputStream("RSStock.bin");
            ObjectInputStream ois1 = new ObjectInputStream(read_RSS_map_file);
            setSales((HashMap<Product, Integer>) ois1.readObject());
            
            FileInputStream read_RIS_map_file = new FileInputStream("RIStock.bin");
            ObjectInputStream ois2 = new ObjectInputStream(read_RIS_map_file);
            setInvoices((HashMap<Integer, Invoice>) ois2.readObject());
            
            FileInputStream read_RIDS_map_file = new FileInputStream("RIDStock.bin");
            ObjectInputStream ois3 = new ObjectInputStream(read_RIDS_map_file);
            setIds((ArrayList<Integer>) ois3.readObject());
        } 
        catch (FileNotFoundException e) {
            System.out.println("Report File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
        catch (ClassNotFoundException e2) {
            System.out.println(e2.getMessage());
        }
    }
    
    public void WriteFileReport()
    {
        try 
        {
            FileOutputStream write_RSS_map_file = new FileOutputStream("RSStock.bin");
            ObjectOutputStream ois1 = new ObjectOutputStream(write_RSS_map_file);
            ois1.writeObject(sales);
            ois1.flush();
            ois1.close();
            FileOutputStream write_RIS_map_file = new FileOutputStream("RIStock.bin");
            ObjectOutputStream ois2 = new ObjectOutputStream(write_RIS_map_file);
            ois2.writeObject(invoices);
            ois2.flush();
            ois2.close();
            FileOutputStream write_RIDS_map_file = new FileOutputStream("RIDStock.bin");
            ObjectOutputStream ois3 = new ObjectOutputStream(write_RIDS_map_file);
            ois3.writeObject(ids);
            ois3.flush();
            ois3.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Report File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    public void readFileUsers()
    {
        try
        {
        FileInputStream read_Users_map_file = new FileInputStream("Users.bin");
        ObjectInputStream ois = new ObjectInputStream(read_Users_map_file);
        setUsers((ArrayList<User>) ois.readObject());
        }
        catch (FileNotFoundException e) {
            System.out.println("Users File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
        catch (ClassNotFoundException e2) {
            System.out.println(e2.getMessage());
        }
    }
    
    public void writeFileUsers()
    {
        try 
        {
            FileOutputStream write_RSS_map_file = new FileOutputStream("Users.bin");
            ObjectOutputStream ois1 = new ObjectOutputStream(write_RSS_map_file);
            ois1.writeObject(users);
            ois1.flush();
            ois1.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("users File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
    }

    public ArrayList<Integer> getIds_ord() {
        return ids_ord;
    }

    public void setIds_ord(ArrayList<Integer> ids_ord) {
        this.ids_ord = ids_ord;
    }
    
    public void readFileOrders()
    {
        try
        {
        FileInputStream read_orders_map_file = new FileInputStream("Orders.bin");
        ObjectInputStream ois = new ObjectInputStream(read_orders_map_file);
        setOrders((ArrayList<Order>) ois.readObject());
        
        FileInputStream IDOrders = new FileInputStream("IDOrders.bin");
        ObjectInputStream ois3 = new ObjectInputStream(IDOrders);
        setIds_ord((ArrayList<Integer>) ois3.readObject());
        }
        catch (FileNotFoundException e) {
            System.out.println("Users File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
        catch (ClassNotFoundException e2) {
            System.out.println(e2.getMessage());
        }
    }
    
    public void writeFileOrders()
    {
        try 
        {
            FileOutputStream write_RSS_map_file = new FileOutputStream("Orders.bin");
            ObjectOutputStream ois1 = new ObjectOutputStream(write_RSS_map_file);
            ois1.writeObject(orders);
            
            FileOutputStream IDOrders_map_file = new FileOutputStream("IDOrders.bin");
            ObjectOutputStream ois2 = new ObjectOutputStream(IDOrders_map_file);
            ois2.writeObject(ids_ord);
        } 
        catch (FileNotFoundException e) {
            System.out.println("Orders File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
    }
    
    public void writeFileInv()
    {
        try 
        {
            FileOutputStream write_RSS_map_file = new FileOutputStream("Inv.bin");
            ObjectOutputStream ois1 = new ObjectOutputStream(write_RSS_map_file);
            ois1.writeObject(invoices);
            ois1.flush();
            ois1.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Orders File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
        
        try 
        {
            FileOutputStream IDOrders_map_file = new FileOutputStream("Inv_ids.bin");
            ObjectOutputStream ois2 = new ObjectOutputStream(IDOrders_map_file);
            ois2.writeObject(ids);
            ois2.flush();
            ois2.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Orders File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }
    
    public boolean check(int id)
    {
        boolean found = false;
        
        while (!found) 
        {
            if(ids_ord.contains(id))
                found = true;
        }
        return found;
    }
    
    public Order getOrder(int id)
    {
        if(check(id))
        {
            return orders.get(id);
        }
        else
        {
            System.out.println("Order not found");
            return null;
        }
    }
    
    public int chekMailPass(String mail, String pass)
    {
        
        this.readFileUsers();
        int found = -1;
        for(int i=0; i<users.size(); i++)
        {
            // "admin".equals(mail)&&"admin".equals(pass)
            //users.get(i).getUser_mail() == mail && users.get(i).getUser_pass() == pass
            
            System.out.println("mail: " + users.get(i).getUser_mail() + " pass: " + users.get(i).getUser_pass());
            
            if( users.get(i).getUser_mail().equals(mail) && users.get(i).getUser_pass().equals(pass)) 
            {
                found = 1;
            }
        }
        return found;
    }
    
    public void addEmpToRe(User u)
    {
        readFileUsers();
        users.add(u);
        writeFileUsers();
//        users.get(0).getUser_fname();
//        users.get(0).getUser_id();
        //System.out.println(users.get(0));
       //setUsers(users);
       //users.add(0, u);
    }
    
    public void view()
    {
        for(int i=0; i<users.size(); i++)
        {
            System.out.println("mail: " + users.get(i).getUser_mail() + " pass: " + users.get(i).getUser_pass() + " dep " + users.get(i).getUser_department()
             + " salary: "+ users.get(i).getUser_salary());
        }
    }
    
    public String getDep(String mail, String pass)
    {
        
        this.readFileUsers();
        
        for(int i=0; i<users.size(); i++)
        {
            if( users.get(i).getUser_mail().equals(mail) && users.get(i).getUser_pass().equals(pass)) 
            {
                return users.get(i).getUser_department();
            }
        }
        return null;
    }
    
}