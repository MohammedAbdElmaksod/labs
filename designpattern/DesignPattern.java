
package designpattern;


public class DesignPattern 
{


    public static void main(String[] args)
    {
       
        abstractFactory s = factoryProducer.getFactory("cs");
        staff f1 =s.getWorkPostion("cs doctor");
        f1.getSalary();
        f1=s.getWorkPostion("is teaching assist");
        f1.getSalary();
        f1.getYearsOfWork();
                
                
                
                
    
    }
    
}
