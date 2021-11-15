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
public class person {
    public String name;
    public int age;
    
    public person(String name,int age)
    {
        this.name =name;
        this.age=age;
    }
    public void printName()
    {
        System.out.println("person name is "+ name);
    }
    public void printAge()
    {System.out.println("person age is " + age);
    }
    }
    
}
