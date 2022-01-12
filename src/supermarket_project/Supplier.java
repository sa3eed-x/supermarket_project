/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;

import java.util.*;

public class Supplier extends User
{
    
    public Supplier(){}
    
    public void acceptRquest(int id)
    {
        Report r = new Report();
        Order o = new Order();
        Date d = new Date();
        r.readFileOrders();
        
        o = r.getOrder(id);
        o.setApproval(true);
        o.setDate_accepted(d);
    }
    
    public void rejectRquest(int id)
    {
        Report r = new Report();
        Order o = new Order();
        Date d = new Date();
        r.readFileOrders();
        
        o = r.getOrder(id);
        o.setApproval(false);
        o.setDate_accepted(d);
    }
}
