/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assginment2;

/**
 *
 * @author MIDO
 */
public class testClass 
{
    public static void main(String[] args) 
    {
        Address a =new Address(7,"bani mazar","egypt");
        Subject s = new Subject(7, "data structure", 3);
        student s1 =new student("mohammed", s, a);
        s1.setGpa(1.99);
        s1.setId(7);
        s1.print();
        
    }
    
}
