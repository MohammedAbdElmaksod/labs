package inheritance;


public class employee extends person
{
 int office;
 double salary;
 myDate dateHired;
 public employee(String name,Address address,int phoneNumber,String EmailAddress,int office,double salary,myDate dateHired)
 {
     super (name,address,phoneNumber,EmailAddress);
     this.office=office;
     this.salary=salary;
     this.dateHired=dateHired;
 }

@Override
 public String toString()
 {
     return"employee name is "+name + " the class name is employee " ;
 }

    @Override
    public void print()
    {
        super.print(); 
        System.out.println(" office number is "+office +" employee's salary is "+salary + " date hired for this employee is "+ dateHired);
    }
 
}
