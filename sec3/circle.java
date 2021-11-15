/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec3;

/**
 *
 * @author MIDO
 */
public class circle extends shape 
{

    public circle(double dim1) {
        super(dim1);
    }

    @Override
    public double copumetArea() {
        return 3.14*dim1*dim1;
    }

    @Override
    public double copumetCircum() 
    {
        return 2*3.14*dim1;
                
        
    }
    
    
}
