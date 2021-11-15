/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisiononopjectoreanted;

/**
 *
 * @author MIDO
 */
public class rev2 
{
    private int x,y;
    


    public rev2()
    {
        System.out.println("this is defualt constractor");
    }
    public rev2(int x, int y ) {
        this();
        this.x = x;
        this.y = y;
        System.out.println("cons 2 is invoked");
    }

    public void printX()
    {
        System.out.println("x="+ x);
    }
    public void printY()
    {
        this.printX();
        System.out.println("y="+ y);
    }
    
    
    
    

    
    
}
