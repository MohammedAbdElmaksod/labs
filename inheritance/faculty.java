/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author MIDO
 */
public class faculty extends employee 
{
    int facultyOffice;
    int hours;
    double rank;
    
    public faculty(String name, Address address, int phoneNumber, String EmailAddress, int office, double salary, myDate dateHired,int facultyOffice,int hours,double rank) {
        super(name, address, phoneNumber, EmailAddress, office, salary, dateHired);
        this.facultyOffice=facultyOffice;
        this.hours=hours;
        this.rank=rank;
    }

    @Override
    public void print()
    {
        super.print(); 
        System.out.println(" faculty office number is "+facultyOffice+" faculty hours is "+hours+" his rank is "+rank);
    }
    
    
    
        
    
    
}
