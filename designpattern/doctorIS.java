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
public class doctorIS implements staff{

    @Override
    public void getSalary() 
    {
        System.out.println("IS Doctor's Salary is 12000$! ");
        
    }

    @Override
    public void getYearsOfWork() 
    {
        
        System.out.println("IS doctors work for 7 years! ");
    }
    
}
