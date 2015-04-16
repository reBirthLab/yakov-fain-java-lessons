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
public class NJTax extends Tax {
    double adjustForStudents (double stateTax) {
        double adjustedTax = stateTax - 500;
        return adjustedTax;
    }
}
