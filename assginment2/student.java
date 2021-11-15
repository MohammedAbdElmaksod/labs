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
public class student 
{
    public String name;
    private int id;
    private double GPA;
    Subject sub;
    Address address;
    public student(String name ,Subject sub,Address address)
    {
        this.name=name;
        this.sub=sub;
        this.address=address;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setGpa(double gpa)
    {
        this.GPA=gpa;
    }
    public int getId()
    {
        return id;
    }
    public double getGpa()
    {
        return GPA;
    }
    
    public void print()
    {
        System.out.println(" studnt name is "+name+" student id is "+id+" student GPA is "+GPA+" subject information is "+sub +" address is" +address);
    }
}
