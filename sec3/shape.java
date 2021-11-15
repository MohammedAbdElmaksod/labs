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
public abstract class shape 
{
    public double dim1;
    public shape(double dim1) 
    {
        this.dim1=dim1;
    }
    
    public void draw()
    {}
    
    public abstract double copumetArea();
    {}
    public abstract double  copumetCircum();
    {}
    
}
