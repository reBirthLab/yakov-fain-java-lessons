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
public abstract class Person {
    
    private String name;
    
    int INCREASE_CAP = 20; // cap on pay increase
    
    public Person(String name){
        this.name = name;
    }
    
    public String getName(){
        return "Person's name is " + name;
    }
    
    public void changeAddress(String address){
        System.out.println("New address is " + address);
    }
    
    private void giveDayOff(){
        System.out.println("Giving a day off to " + name);
    }
    
    public void promote(int percent){
        System.out.println("Promoting a worker...");
        giveDayOff();
        
        // calling an abstract method
        increasePay(percent);
    }
    
    // calling abstract method to be implemented in subclasses
    public abstract boolean increasePay(int percent);
}
