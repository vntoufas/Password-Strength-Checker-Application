
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

/**
 *
 * @author Billy
 */
public class NoNumberException extends Exception{
    private String password; 
    public NoNumberException (){}
    
    public String toString(){
    return "Your password does not include a numerical value";}
    
    
    
    
}
