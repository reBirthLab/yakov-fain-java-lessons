/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson7;

/**
 *
 * @author Anastasiy
 */
public class Employee extends Person {
    
    public Employee(String name){
        super(name);
    }
    
    @Override
    public boolean increasePay(int percent){
        System.out.println("Increasing salary by " +
                percent + "%. " + getName());
        return true;
    }
}
