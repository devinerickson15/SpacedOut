/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.FuelControl;
import java.util.Scanner;

/**
 *
 * @author Megan
 */
public class FuelView {
    
    private String promptMessage;

    public FuelView() {
        
        this.promptMessage = "\n Please enter the amount of fuel you wish to gather.";
        
        this.displayDescription();
    
    }
    
    private void displayDescription() {
        System.out.println(
                "\n*******************************************************"
              + "\n Replenish your fuel supply by mining from your current location. "
              + "\n Each planet or moon has a unique depth and surface density."
              + "\n The maximum amount of fuel you may collect is equal "
              + "\n to each location's depth. You must enter an amount you wish to "
              + "\n mine, understanding that the the system tries to compensate for the "
              + "\n depth and density, often overcompensating and exceeding the "
              + "\n allowed fuel amount. Your selection must be between 1-10."
              + "\n Be wise in your selection, and Good Luck!"
              + "\n*******************************************************"
        );
    }
    
     public void displayFuelView() {
      
        boolean done = false;
        do {
            String userChoice = this.getUserInput();
            if (userChoice.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(userChoice);
            
        } while (!done);
        }
    
    private String getUserInput() {
 
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned 
        boolean valid = false; //initialize to not valid
        
        while (!valid) {// loop WHILE an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //GET next line typed on keyboard
            value = value.trim(); //TRIM leading and trailing blanks 
            
            if (value.length() <1) {// value is blank
                    System.out.println("\nInvalid value: value cannot be blank");
                    continue;
            }
            
            break; // end the loop
        }
           
        return value; // return the value entered
    }
    
    public boolean doAction(String userChoice) {
        
        String input = userChoice;
        
        int choice = Integer.parseInt(input); // convert input to int
        
        int doEquation = FuelControl.gatherFuel(15,7,choice);
            
            //prints line if  user exceeded the maximum 
           if (doEquation == 0) {  
                System.out.println("You exceeded the maximum amount for your location. "
                        + "\n *** Please try again. ***");
                return false;
            }
            //Prints line if user inputs an invalid value
            else if (doEquation == -1) { //
                System.out.println("\n *** Invalid input. Please enter a number between 1-10. ***");
                return false;
            }
   
        this.displayNextView(doEquation);
    
        return true; //success!
           
    }

    private void displayNextView(int doEquation) {
        
        // Display a custom welcome message
        System.out.println("\n========================================================"
                        + "\n You have mined" + " " + doEquation + " gallons of fuel!"
                        + "\n========================================================="
                         );
    }
}
