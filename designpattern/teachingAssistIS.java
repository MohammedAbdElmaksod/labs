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
public class teachingAssistIS implements staff
{

    @Override
    public void getSalary() 
    {
        System.out.println("Teaching Assist's Salary is 4000$! ");
        
    }

    @Override
    public void getYearsOfWork() 
    {
        
        System.out.println("Teaching Assists work for 2 years! ");
    }
    
}
