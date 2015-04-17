/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson6;

/**
 *
 * @author Anastasiy
 */
public interface Payable {
    final int INCREASE_CAP = 20;
    
    boolean increasePay(int percent);
}
