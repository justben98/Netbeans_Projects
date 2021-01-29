/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nameGameFrame;

/**
 *
 * @author Justech@ubuntusystems.com
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NameGameFrame extends JFrame
{

    // Moved these 2 variables to be class-level
    static JTextField textfield = new JTextField(20);
    static JTextArea  textarea = new JTextArea(5,30);

    public static void main( String[] args)
    {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Name Game");
        frame.setLocation(500,400);
        frame.setSize(500,500);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel label = new JLabel("Enter the Name or Partial Name to search:");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(2,10,10,10);

        panel.add(label,c);

        panel.add(textarea);

        JButton button = new JButton("Search");
        c.gridx = 1;
        c.gridy = 1;
        panel.add(button,c);

        panel.add(textfield);

        frame.getContentPane().add(panel, BorderLayout.NORTH);
        frame.setVisible(true);

    }
    static class Action implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String name  = textfield.getText();
            textarea.append(name);
            textfield.selectAll();
        }
    }
}
