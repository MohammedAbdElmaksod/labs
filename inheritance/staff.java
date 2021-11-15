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
public class staff extends employee

{
    String tittle;
    
    public staff(String name, Address address, int phoneNumber, String EmailAddress, int office, double salary, myDate dateHired,String tittle)
    {
        super(name, address, phoneNumber, EmailAddress, office, salary, dateHired);
        this.tittle=tittle;
    }

    @Override
    public void print()
    {
        super.print(); 
        System.out.println("staff tittle is "+tittle);
    }
    
    
}
