/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author MIDO
 */
public class Mammal implements Animal
{

    @Override
    public void eat(String s) 
    {
        
        switch(s)
        {
            case "monkey":
                System.out.println("monkeys eat nuts and leaves ");
                break;
            case "deer" :
                System.out.println("deers eat roots and stems ");
                break;
            case "dog" :
                System.out.println("dogs eat meat and small animals like cats ");
                break;
            case "sheep" :
                System.out.println("sheeps eat leaves and roots and stems ");
                break;
            default:
                System.out.println("wrong choose please select acorrect choose ");
                break;
        }
    }

    @Override
    public boolean travel(String s) {  
        switch(s)
        {
            case "monkey":
                return true;
            case "deer" :
                return true;
            case "dog" :
                return false;
            case "sheep" :
                return false;
        }
        return false;
    }
    
    public int NoOfLegs(String s)
    {
        switch(s)
        {
            case "monkey":
                return 2;
            case "deer" :
                return 4;
            case "dog" :
                return 4;
            case "sheep" :
                return 4;
        }

        return 0;
    }
    public void favFood(String s)
    {
        switch(s)
        {
            case "monkey" :
                System.out.println("monkey's fav food is nuts ");
                break;
            case "deer" :
                System.out.println("deers fav food is roots  ");
                break;
            case "dog" :
                System.out.println("dogs fav food is meat ");
                break;
            case "sheep" :
                System.out.println("sheeps fav food is leaves ");
                break;
   
    }
    
   
}
}
