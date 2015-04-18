
import com.yakovfain.lesson7.tryit.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anastasiy
 */
public class TestPayIncreaseInterface {

    public static void main(String[] args) {
        Payable workers[] = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");

        for (Payable p : workers) {
            ((Payable) p).increasePay(30);
        }
    }
}
