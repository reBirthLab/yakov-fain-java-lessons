/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson7.tryit;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class Employee implements Payable {
    
    private String name;
    
    public Employee(String name){
        this.name = name;
    }
    
    @Override
    public boolean increasePay(int percent){
        System.out.println("Increasing hourly rate by " + percent 
                + "%. " + name);
        return true;
    }
}
