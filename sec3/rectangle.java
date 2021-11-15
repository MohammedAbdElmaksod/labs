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
public class rectangle extends shape {
    public double dim2;

    public rectangle(double dim1,double dim2) {
        super(dim1);
        this.dim2=dim2;
    }

    @Override
    public double copumetArea() {
        return dim1*dim2;
    }

    @Override
    public double copumetCircum() {
        return dim1+dim2*2;
    }
    public String toString()
    {
        return "length= "+ this.dim1+ " width= "+ this.dim2;
    }
        
      
    
}
