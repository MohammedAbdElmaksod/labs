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
public class doctorCS  implements staff
{

    @Override
    public void getSalary() 
    {
        System.out.println("CS Doctor's Salary is 10000$! ");
        
    }

    @Override
    public void getYearsOfWork() 
    {
        System.out.println("CS Doctors work for 5 years! ");
        
    }
    
}
