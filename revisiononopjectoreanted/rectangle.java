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
public class rectangle extends shape 
{
    public int dim2;
    
    public rectangle(int width , int length)
    {
    dim1=width;
    dim2=length;
    
    }
    public void printRec()
    {
        System.out.println("dim1 = "+ dim1 + "dim2 = "+dim2 + "area = "+ dim1*dim2);
    }
    public void p rintAtrbutes()
    {
        System.out.println(super.x);}
}
