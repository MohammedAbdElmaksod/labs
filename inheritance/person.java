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
public class person 
{
    String name;
    Address address;
    int phoneNumber;
    String EmailAddress;
    public person(String name,Address address,int phoneNumber,String EmailAddress)
    {
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.EmailAddress=EmailAddress;
    }
    public void print()
    {
        System.out.println("name is "+name + " address is "+address + " phone number is "+phoneNumber + " email address is "+EmailAddress);
        
    }
}
