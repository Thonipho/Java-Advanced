/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Contacts {
    
    private Long phone;
    private String name;

    public Contacts(Long phone, String name) {
        
        this.phone = phone;
        this.name = name;
    } 

    public Long getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }
    
    public String toString(){
        return "Name: " + getName()+
         "\nPhone number:   " + getPhone() +"\n";
    }
}

