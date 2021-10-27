/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author User
 */
public class Additions {
    
    private String add;
    private String add2;
    private String add3;
    private String add4;
    private double price;

    public Additions(String add) {
        
        if(add == "cheese" || add == "lettuce" || add == "bacon" || add == "tomato")
        this.add = add;
        price = 15;
    }
    
    public Additions(String add, String add2) {
        
        if(add == "cheese" || add == "lettuce" || add == "bacon" || add == "tomato"){
        this.add = add;
        }
        if(add2 == "cheese" || add2 == "lettuce" || add2 == "bacon" || add2 == "tomato"){
            this.add2 = add2;
        }
        price = 30;
    }
    
    public Double getTotal(){
        return price;
    }
    
}
