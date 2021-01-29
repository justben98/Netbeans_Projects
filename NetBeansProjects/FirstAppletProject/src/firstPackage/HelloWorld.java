/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstPackage;

//java imports
import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author justech
 */
public class HelloWorld extends Applet{
    public void paint (Graphics g){
        g.drawString("Hellow World!", 50, 25);
    }
    
}
