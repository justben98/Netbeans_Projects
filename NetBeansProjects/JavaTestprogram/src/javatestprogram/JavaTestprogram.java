/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatestprogram;

/**
 *
 * @author administrator
 */

import javax. swing.JOptionPane;
import javax. swing.JTextField;


public class JavaTestprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null,"Enter Name:");
        JTextField name;
        name = new JTextField ();
        
            JOptionPane.showMessageDialog(null,"Hello "+name.getText());
        
        
    }
    
}
