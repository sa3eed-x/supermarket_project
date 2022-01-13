/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket_project;
import java.io.*;
import java.util.*;

public class User implements Serializable
{
    private int    user_id;
    private String user_fname;
    private String user_lname;
    private int    user_salary;
    private String user_department;
    private int    user_phone;
    private String supplier_company;
    private String user_mail;
    private String user_pass;
    
    
    public User(){}

    public User(int user_id, String user_fname, String user_lname, int user_salary, String user_department, int user_phone, String supplier_company, String user_mail, String user_pass) {
        this.user_id = user_id;
        this.user_fname = user_fname;
        this.user_lname = user_lname;
        this.user_salary = user_salary;
        this.user_department = user_department;
        this.user_phone = user_phone;
        this.supplier_company = supplier_company;
        this.user_mail = user_mail;
        this.user_pass = user_pass;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_fname() {
        return user_fname;
    }
    
    public String getUser_lname() {
        return user_lname;
    }

    public int getUser_salary() {
        return user_salary;
    }

    public String getUser_department() {
        return user_department;
    }

    public int getUser_phone() {
        return user_phone;
    }

    public String getSupplier_company() {
        return supplier_company;
    }
    
    public String getUser_mail() {
        return user_mail;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_fname(String user_fname) {
        this.user_fname = user_fname;
    }
    
    public void setUser_lname(String user_lname) {
        this.user_lname = user_lname;
    }

    public void setUser_salary(int user_salary) {
        this.user_salary = user_salary;
    }

    public void setUser_department(String user_department) {
        this.user_department = user_department;
    }

    public void setUser_phone(int user_phone) {
        this.user_phone = user_phone;
    }

    public void setSupplier_company(String supplier_company) {
        this.supplier_company = supplier_company;
    }
    
    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

}
