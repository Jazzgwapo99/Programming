/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fuck;
import javax.swing.JOptionPane; 
/**
 *
 * @author CISCO 01
 */
public class Fuck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String firstNumber,thirdNumber,inputNumber, //first string entered by user 
         secondNumber; // second string entered by user 

float money;    // first number to add 
float softdrink ;
float pizza ;
float  burger; //second number to add 
float  change;                //sum of number1 and number2 

//read in the first number from user as a string 
inputNumber = 
        JOptionPane.showInputDialog ( "Enter $$" ); 
firstNumber = 
        JOptionPane.showInputDialog ( "pizza price?" ); 

//read in the second number from user as a string 
secondNumber = 
        JOptionPane.showInputDialog ( "softdrink price" ); 
thirdNumber = 
        JOptionPane.showInputDialog ( "burger price" ); 

//convert numbers from type String to type int 
money = Integer.parseInt ( inputNumber); 
pizza = Integer.parseInt ( firstNumber); 
softdrink = Integer.parseInt ( secondNumber); 
burger = Integer.parseInt ( thirdNumber); 
//add the numbers 
change = money - burger - softdrink - pizza; 

//display the results 
JOptionPane.showMessageDialog ( 
null, "Your Change is " + change, "", 
JOptionPane.PLAIN_MESSAGE); 
System.exit ( 0 ); //ends the program 
    }
    }

