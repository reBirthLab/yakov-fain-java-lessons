/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson5;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class TestTax {
    public static void main (String[] args){
        if (args.length !=3){
            System.out.println("Sample usage of the program:" + 
                    " java TestTax 50000 NJ 2");
            System.exit(0);
        }
        
        double grossIncome = Double.parseDouble(args[0]); // local variables
        String state = args[1];
        int dependants = Integer.parseInt(args[2]);
        
        Tax t1 = new Tax(grossIncome, state, dependants);
        double yourTax = t1.calcTax(); // calculating tax
        System.out.println("Your tax is $" + yourTax);
        Tax.convertInEuros(yourTax);
        
        Tax t2 = new Tax(65000, "TX", 4);
        double hisTax = t2.calcTax();
        System.out.println("His tax is $" + hisTax);
        Tax.convertInEuros(hisTax);
                
    }
}
