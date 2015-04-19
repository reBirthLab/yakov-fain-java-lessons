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
public class Contractor extends Person {
    
    public Contractor(String name){
        super(name);
    }
    
    @Override
    public boolean increasePay(int percent){
        if (percent < INCREASE_CAP){
            System.out.println("Increasing hourly rate by " +
                    percent + "%. " + getName());
            return true;
        } else {
            System.out.println("Sorry, can't increase hourly rate by more than " +
                    INCREASE_CAP + "%. " + getName());
            return false;
        }
    }
}