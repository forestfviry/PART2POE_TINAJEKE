/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poechecker;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class POEChecker {

    public static void main(String[] args) {
        
       
        
       // Creating an instance of the Message class
        Message objMessage = new Message();
               // Prompting the username
        String username = JOptionPane.showInputDialog("Please enter your username");

// Using if statements to check the username
if (objMessage.checkUsername(username)) {
    JOptionPane.showMessageDialog(null, "Thank you for the username");
} else {
    JOptionPane.showMessageDialog(null, "The username is incorrectly formatted", "Error", JOptionPane.ERROR_MESSAGE);

}

        // Prompt user to enter password
        String password = JOptionPane.showInputDialog("Please enter your password");

        // Using if statement to check password
        if (objMessage.checkPasswordComplexity(password)) {
            JOptionPane.showMessageDialog(null, "Password successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Password unsuccessfully captured", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Prompt user to enter a cellphone number
        String cellphoneNumber = JOptionPane.showInputDialog("Enter your cellphone number and include the SA format");

        // Using if statement to check cellphone number
        if (objMessage.checkCellphoneNumber(cellphoneNumber)) {
            JOptionPane.showMessageDialog(null, "Cellphone Number successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Cellphone Number unsuccessfully captured", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Prompt user for login verification
        String verifyUsername = JOptionPane.showInputDialog("Please enter the username that you used");
        String verifyPassword = JOptionPane.showInputDialog("Enter the password that you used");

        // Login Attempt
        JOptionPane.showMessageDialog(null, "Attempting to Login...");
    
   JOptionPane.showMessageDialog(null, "Attempting to Login...");
    
            // Login Attempt
        JOptionPane.showMessageDialog(null, "Attempting to Login...");
        objMessage.Login(username, password, verifyUsername, verifyPassword);
    }
}


    


      

        
   



        

    


    

