/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson3;

/**
 *
 * @author Anastasiy
 */
public class TestTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tax t1 = new Tax(); //creating an instance

        t1.grossIncome = 25000; // assigning the values
        t1.dependents = 2;
        t1.state = "TX";

        double yourTax = t1.calcTax(); // calculating tax

        NJTax t2 = new NJTax(); //creating an instance

        t2.grossIncome = 25000; // assigning the values
        t2.dependents = 2;
        t2.state = "NJ";

        double yourNJTax = t2.calcTax(); // calculating tax

        // Printing the result
        System.out.println("Your tax is " + yourTax);
        // Printing the result
        System.out.println("Your NJ tax is " + yourNJTax);

    }

}
