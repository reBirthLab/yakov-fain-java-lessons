/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson3;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class Tax {

    double grossIncome;
    String state;
    int dependents;

    public double calcTax() {
        double stateTax = 0;
        if (grossIncome < 30000) {
            stateTax = grossIncome * 0.05;
        } else {
            stateTax = grossIncome * 0.06;
        }
        return stateTax;
    }
}
