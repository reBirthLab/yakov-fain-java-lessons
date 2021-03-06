/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson4;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class Tax {
    double grossIncome; // class member variables
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
    
    // Tax Calculations
    double calcTax(){
        return (grossIncome*0.33 - dependents*100);
    }
    
    // USD to EUR Converter
    static void convertInEuros (double tax){
        System.out.println("$" + tax + " (" + tax * 0.75 + " Euros)");
    }
}
