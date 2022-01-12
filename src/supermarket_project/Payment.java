/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;
import java.util.*;
public class Payment 
{   
    Payment(){};
    
    public void calcTotalPrice()
    {
        Invoice i = new Invoice();
        Stock   s = new Stock();
        Product p = new Product();
        
        i.settotalprice(0);
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr = i.getIds();
        
        for(int j =0; j<i.getSizeOfItemsList(); j++)
        {
            p = s.getProduct(arr.get(j));
            i.settotalprice(i.gettotalprice() + (p.getProduct_price() * i.getQty(p)));
        }
    }
}