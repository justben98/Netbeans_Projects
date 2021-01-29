/**
 * Program: Scan the student's units and display the same
 * Date: 5th October, 2019.
 */

/**
 *
 * @author Justech
 */

//Imported java packages
import javax.swing.JOptionPane;

public class Student {
    public static void main (String [] args) throws RuntimeException{
      try{  
        //Variable declaration
        String userName;
        
        //Variable defination
        JOptionPane keyboard = new JOptionPane();
        keyboard.showMessageDialog(null,"Welcome to Justech Systems, proceed to enter your units.");            
        userName = JOptionPane.showInputDialog("Enter username: ");        
           
        //Scan units
        String [] units = new String [7];
        for (int counter=0; counter<7; counter++){
            int no = counter+1;
            units[counter]=keyboard.showInputDialog("Enter Unit"+no);
        }
        
        //Output
            JOptionPane screen = new JOptionPane();
            screen.showMessageDialog(null, userName+", you have entered the following units:\n"
                    +"Unit1: "+units[0]+"\nUnit2: "+units[1]+"\nUnit3: "+units[2]+"\nUnit4: "+units[3]
                    +"\nUnit5: "+units[4]+"\nUnit6: "+units[5]+"\nUnit7: "+units[6]);
        
       //Exit status when no exception caught
        System.exit(0);
      }catch (RuntimeException e){
            JOptionPane.showMessageDialog(null, "Excepton occured! \n"+"Explanation: "+e);
      
            //Exit status when an exception is caught
            System.exit(-1);
      }
    }
    
}


