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
public class doctorIT implements staff{

    @Override
    public void getSalary() 
    {
        System.out.println("IT Doctor's Salary is 15000$! ");
        
    }

    @Override
    public void getYearsOfWork() 
    {
        
        System.out.println("IT Doctors work for 7 years! ");
    }
    
}
