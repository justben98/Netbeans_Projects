//class definition is contained here.
package palallerogram;

/**
 * 
 * @author Justech@ubuntusystems.com
 */
//import java extention package
import javax.swing.JOptionPane;

public class Area {
    //Variable declaration
     protected static double result;
    
    public double areaPalallerogram(String breadth, String height) throws NumberFormatException{
        try{
            //Variable definations
            breadth = JOptionPane.showInputDialog("Breadth (cm)");
            //convert variable breadth into integer
            double i=Double.parseDouble(breadth); 

            height = JOptionPane.showInputDialog("Perpendicular Height (cm)");
            double j=Double.parseDouble(height);  

            //Calculate the area.
            result= i*j;
            
        }catch (NumberFormatException e){
            JOptionPane screen = new JOptionPane();
            screen.showMessageDialog(null, e + "\nBreadth and Height can only be integers or decimals and can not be null!");
            
            //Program exit status on exception occurrence
            System.exit(-1);
        }
        
        return result;
    }
    
}