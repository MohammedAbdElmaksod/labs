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
public class student extends person
{
     final String status;

    public student(String name, Address address, int phoneNumber, String EmailAddress,String status) {
        super(name, address, phoneNumber, EmailAddress);
        this.status=status;
    }

    @Override
    public void print()
    {
        super.print();
        System.out.println(" status for this student is "+status);
    }
    
    
    
}
