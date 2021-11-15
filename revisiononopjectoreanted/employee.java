/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisiononopjectoreanted;

/**
 *
 * @author MIDO
 */
public class employee extends person {

    public float salary;
     public employee(String name, int age, float salary ) {
        super(name, age);
        this.salary =salary;
        super.printName();
        super.printAge();
        System.out.println("salary is"+ salary);
    }
    
    
    
}
