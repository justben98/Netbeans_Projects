/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmax;

/**
 *
 * @author Justech@ubuntusystems.com
 */
import javax.swing.JOptionPane;
public class TestMax{

public static void main (String [] args){

int i =5;
int j = 2;

int k = max (i, j);

JOptionPane.showMessageDialog(null,"The maximum "+i+" and "+j+" is "+"k");

SumOfIntegers answer = new SumOfIntegers();
answer.sum();

}

public static int max (int num1, int num2){

int result;

if(num1 > num2)
    result = num1;
else
    result = num2;
return result;

}

}
