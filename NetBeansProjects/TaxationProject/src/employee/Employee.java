/**
 * 
 * Program to Mimic KRA taxation
 * Date: 6th October, 2019.
 */
package employee;

/**
 *
 * @author Justech@ubuntusystems.com
 */

//my importations
import javax.swing.JOptionPane;
        
public class Employee {
     //variable declarations
        static String userName;
        static String idNO;
    
    public static void main(String [] args)throws NumberFormatException{
       try{ //Welcome message
            JOptionPane.showMessageDialog(null, "Welcome to KRA systems. Click OK to proceed.");

            //variable definations
            userName = JOptionPane.showInputDialog("Employee Name:");
            idNO = JOptionPane.showInputDialog("ID Number:");
            int id = Integer.parseInt(idNO);

            //Call the taxation function
            Taxation employee1 = new Taxation();
            employee1.taxationFunction();

            System.exit(0);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Excepción:\n " + e + "\nThe ID number section can not be left null or contain characters!");

            //Program exit status
            System.exit(-1);
       }
            
    }
   
}
