
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
public class NoAlphaException extends Exception{
    private String password; 
    public NoAlphaException (){}
    
    public String toString(){
    return "You password does not include a plain character value";}
    
    
    
    
}
