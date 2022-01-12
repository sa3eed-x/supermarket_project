/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;

public class Cash extends Payment
{
    private double cash_back;
    
    public Cash(){}

    public double getCash_back() {
        return cash_back;
    }

    public void setCash_back(double cash_back) {
        this.cash_back = cash_back;
    }
    
    public double calcCashBack(double money)
    {
        Invoice i = new Invoice();
        setCash_back(i.gettotalprice()-money);
        
        return getCash_back();
    }
}

