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
public class IS extends workPostion
{
    public staff getStaff(String type)
    {
        type.toLowerCase();
        switch(type)
        {
            case "doctor":
                return new doctorIS();
            case "teaching assist":
                return new teachingAssistIS();
        }
        return null;
    }
    
}
