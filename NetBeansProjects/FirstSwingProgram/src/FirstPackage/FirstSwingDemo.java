/**
 * Program: First JFrame Form
 * 
 * Date:    9th November, 2019.
 */
package FirstPackage;

import javax.swing.JFrame;
import javax.swing.JButton;

/**
 *
 * @author justech@ubuntu.com
 */
public class FirstSwingDemo {
    //Class constants
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    
    
    public static void main (String [] args){
        JFrame firstWindow = new JFrame();
        firstWindow.setSize(WIDTH, HEIGHT);
        
        firstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton endButton = new JButton ("Click to end program.");
        EndingListener buttonEar = new EndingListener();
        endButton.addActionListener(buttonEar);
        firstWindow.add(endButton);
        
        firstWindow.setVisible(true);
        
    }
}
