/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;
import java.util.Date;
import java.util.HashMap;

public class Order 
{
    private int order_id;
    private Date date_requsted;
    private Date date_accepted;
    private HashMap<Product,Integer> order_details;
    private boolean approval;
    
    Order(){}

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public Date getDate_requsted() {
        return date_requsted;
    }

    public Date getDate_accepted() {
        return date_accepted;
    }

    public HashMap<Product, Integer> getOrder_details() {
        return order_details;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setDate_requsted(Date date_requsted) {
        this.date_requsted = date_requsted;
    }

    public void setDate_accepted(Date date_accepted) {
        this.date_accepted = date_accepted;
    }

    public void setOrder_details(HashMap<Product, Integer> order_details) {
        this.order_details = order_details;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }
    
    
}