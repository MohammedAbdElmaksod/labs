/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author MIDO
 */
public class ball implements tossable
{
    private String brandName;

    public ball(String brandName) 
    {
        this.brandName=brandName;
    }
    
    public String getBrandName()
    {
        return brandName;
    }
    public void bounce()
    {}

    @Override
    public void toss() {}
    
    
}
