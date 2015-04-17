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
public class Tax {

    double grossIncome;
    String state;
    int dependents;
    static int customerCounter;
    
    // Constructor
    Tax (double gi, String st, int depen){
        grossIncome = gi; // member variable initialization
        state = st;
        dependents = depen;
        customerCounter++; // increment the counter by one
        
        System.out.println("Prepering the tax data for customer #" + customerCounter);
    }

    public double calcTax() {
        double stateTax = 0;
        if (grossIncome < 30000) {
            stateTax = grossIncome * 0.05;
        } else {
            stateTax = grossIncome * 0.06;
        }
        return stateTax;
    }
    
    // USD to EUR Converter
    static void convertInEuros (double tax){
        System.out.println("$" + tax + " are " + tax * 0.75 + " Euros");
    }
}
