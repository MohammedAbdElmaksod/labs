/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author MIDO
 */
public class workPostion extends abstractFactory
{

    @Override
    public staff getWorkPostion(String type) 
    {
        type.toLowerCase();
        switch (type)
        {
            case "cs doctor":
                return new doctorCS();
            case "is doctor":
                return new doctorIS();
            case "it doctor":
                return new doctorIT();
            case "cs teaching assist":
                return new teatchingAssistCS();
            case"is teaching assist":
                return new teachingAssistIS();
            case "it teaching assist":
                return new teachingAssistIT();
        }
        return null;
    }
    
}
    
    

