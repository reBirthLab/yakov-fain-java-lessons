
import com.yakovfain.lesson7.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com> Tovstik <anastasiy.tovstik@gmail.com>
 */
public class TestPayIncrease2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person workers[] = new Person[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");
        
        for (Person p: workers){
            p.promote(30);
        }
    }
    
}
