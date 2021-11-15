
package assignment3;

import java.util.Scanner;


public class Assignment3 {


    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println(" plz select one Animal of these Mammal Animals {monkey,deer,dog,sheep} ");
        String animal = s.next();
        animal.toLowerCase();
        Mammal m1=new Mammal();
        System.out.println(m1.NoOfLegs(animal));
        m1.favFood(animal);
        System.out.println(m1.travel(animal));
        m1.eat(animal);
        
    }
    
}
