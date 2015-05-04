/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson6;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class ForeignContractor extends Person {
    
    public ForeignContractor(String name){
        super(name);
    }
    
    public boolean increasePay(int percent){
        System.out.println("I'm just a foreign worker");
        return true;
    }
}
