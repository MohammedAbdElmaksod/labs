/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author MIDO
 */
public class factoryProducer 
{
    public static abstractFactory getFactory(String s)
    {
        s.toLowerCase();
        if(s.equalsIgnoreCase("cs"))return new CS();
        else if (s.equalsIgnoreCase("IS"))return new IS();
        else if (s.equalsIgnoreCase("IT"))return new IT();
        else return null;
        
    }
    
}
