package inheritance;


public class Inheritance
{


    public static void main(String[] args)
    {
        myDate d=new myDate(22,10,2000);
        Address a =new Address("bani mazar", "minia", "egypt");
        employee e1=new employee("mohammed", a,23456, "mi038126@gmail.com",7,7000,d);
        e1.print();
        String s= e1.toString();
        System.out.println(s);

    }
    
}
