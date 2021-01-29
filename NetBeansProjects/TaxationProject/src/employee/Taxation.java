/**
 * 
 * File: taxation class implementation 
 * Date: 5th October, 2019.
 */
package employee;

/**
 *
 * @author Justech@ubuntusystems.com
 */
//my imports
import javax.swing.JOptionPane;

public class Taxation {
       public void taxationFunction() throws NumberFormatException{
            try{
                //Variable declaration and assignment
                double trate1, trate2, trate3;
                trate1=0.05; //5 percent
                trate2=0.1;  //10 percent
                trate3=0.2;  //20 percent

               //Declaration of member variables
                String income;
                double taxPAYE, netIncome;

               //Defination of variables
                income = JOptionPane.showInputDialog("Income");
                int i=Integer.parseInt(income);         

               if (i>=50000){
                        taxPAYE=trate3*i;
                        netIncome=i-taxPAYE;
                        JOptionPane.showMessageDialog(null,"Employee Name: "+Employee.userName+"\nID Number: "+Employee.idNO+"\nIncome: "+i+"\nTaxation class:  A"+"\nTaxation rate: "+"20%"+"\nNetTax: "+taxPAYE+"\nNetIncome: "+netIncome);
                }

                else if (i>20000){
                        taxPAYE=trate2*i;
                        netIncome=i-taxPAYE;
                        JOptionPane.showMessageDialog(null,"Employee Name: "+Employee.userName+"\nID Number: "+Employee.idNO+"\nIncome: "+i+"\nTaxation class:  B"+"\nTaxation rate: "+"10%"+"\nNetTax: "+taxPAYE+"\nNetIncome: "+netIncome);
                }
                
                else if(i>0){
                        taxPAYE=trate1*i;
                        netIncome=i-taxPAYE;
                        JOptionPane.showMessageDialog(null,"Employee Name: "+Employee.userName+"\nID Number: "+Employee.idNO+"\nIncome: "+i+"\nTaxation class:  C"+"\nTaxation rate: "+"5%"+"\nNetTax: "+taxPAYE+"\nNetIncome: "+netIncome);
                }
                
                else
                    JOptionPane.showMessageDialog(null,"Erro!\n" + "Consider a meaningful income amount.");
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, e + "\nThe income section can not be left null or take characters!");
                System.exit(-1);
            }
    }
}
