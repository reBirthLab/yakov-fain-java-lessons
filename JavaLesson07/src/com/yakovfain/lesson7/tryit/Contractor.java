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
public class Contractor implements Payable {
    
    private String name;
    
    public Contractor(String name){
        this.name = name;
    }
    
    @Override
    public boolean increasePay(int percent){
        if(percent < Payable.INCREASE_CAP){
            System.out.println("Increasing hourly rate by " + percent 
                + "%. " + name);
        return true;
        } else {
            System.out.println("Sorry, can't increase hourly rate by "
                    + "more than " + Payable.INCREASE_CAP + "%. " + name);
        return false;
        } 
    }
}
