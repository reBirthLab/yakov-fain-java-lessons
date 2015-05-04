
import com.yakovfain.lesson6.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class TestPayIncreasePolyError1 {
    public static void main(String[] args) {
        
        Payable workers[] = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");
        // workers[2] = new ForeignContractor("Boris");
        
        for (Payable p: workers){
            ((Payable)p).increasePay(30);
        }
    }
}
