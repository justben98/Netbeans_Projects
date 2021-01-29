/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmax;

import javax.swing.JOptionPane;

/**
 *
 * @author Justech@ubuntusystems.com
 */
public class SumOfIntegers {

    
    public void sum(){
    
    int sum=0;
    
    for (int i=0; i<=30; i++)

        sum+=i;
    
    JOptionPane.showMessageDialog(null,sum);
    }
}

