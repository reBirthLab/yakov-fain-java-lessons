/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain;

/**
 *
 * @author Anastasiy
 */
public class TestTax {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tax t = new Tax(); //creating an instance
        
        t.grossIncome = 50000; // assigning the values
        t.dependents = 2;
        t.state = "NJ";
        
        double yourTax = t.calcTax(); // calculating tax
        
        // Printing the result
        System.out.println("Your tax is " + yourTax);
        
        NJTax t2 = new NJTax();
        yourTax = t2.calcTax();
        double totalTax = t2.adjustForStudents(yourTax);
        
        System.out.println("Your NJ tax is " + totalTax);
    }
    
}
