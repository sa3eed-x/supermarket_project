/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;
import java.io.*;
import java.util.*;

//calcOffer();
public class Porduct_Offer 
{
    private HashMap<Integer,Double> offers_list=new HashMap<Integer,Double>();
    
    Porduct_Offer(){}

    public HashMap<Integer, Double> getOffers_list() {
        return offers_list;
    }

    public void setOffers_list(HashMap<Integer, Double> offers_list) {
        this.offers_list = offers_list;
    }
    
    public double calcOffer(){
        
        return 0;
    }
    public void readFile()
    {
        try 
        {
            FileInputStream read_Off_map_file = new FileInputStream("Offers_HashMap.bin");
            ObjectInputStream ois = new ObjectInputStream(read_Off_map_file);
            
            setOffers_list(
                    (HashMap<Integer, Double>) ois.readObject()
            );
        } 
        catch (FileNotFoundException e) {
            System.out.println("Offers HashMap File Not found");
        }
        catch (IOException e1) {
            System.out.println(e1.getMessage());
        } 
        catch (ClassNotFoundException e2) {
            System.out.println(e2.getMessage());
        }
    }
    public void writefile(){
        try 
        {
            FileOutputStream write_RSS_map_file = new FileOutputStream("Offers_HashMap.bin");
            ObjectOutputStream ois1 = new ObjectOutputStream(write_RSS_map_file);
            ois1.writeObject(offers_list);
            ois1.flush();
            ois1.close();
            
            
        } 
        catch (FileNotFoundException e) {
            System.out.println("Products File Not found");
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
            if(offers_list.containsKey(id))
                found = true;
        }
        
        return found;
    }
    
    public void changeOffer(int id, double offer)
    {
        offers_list.replace(id, offer);
    }
    
    public void creatOffer(int id, double offer)
    {
        offers_list.put(id, offer);
    }
}
