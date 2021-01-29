/*
 * Program to find an area of a palallerogram
 * 
 * Date: 6th October, 2019.
 */
package palallerogram;

/**
 *
 * @author Justech@ubuntusystems.com
 */
//my import
import javax.swing.JOptionPane;

public class Palallerogram {
    public static void main (String [] args){
        //Welcome message
        JOptionPane screen = new JOptionPane();
        JOptionPane.showMessageDialog(null, "Welcome to Justech Computation Program \n"+"Proceed to compute an area of a palallerogram ?");
   
        //Object instantiation
        Area palallerogram1 = new Area();
        palallerogram1.areaPalallerogram(null, null);
        
        screen.showMessageDialog(null, "Area: " + Area.result + "cm squared");
        
        //Program exit status
        System.exit(0);
    }
}
