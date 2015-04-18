
import com.yakovfain.lesson6.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anastasiy
 */
public class TestPayIncreasePolyError {
    public static void main(String[] args) {
        
        Person workers[] = new Person[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new ForeignContractor("Boris");
        
        for (Person p: workers){
            ((Payable)p).increasePay(30);
        }
    }
}
