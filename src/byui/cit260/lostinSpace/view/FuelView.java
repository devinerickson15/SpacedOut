/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.FuelControl;
import byui.cit260.lostinSpace.exceptions.FuelControlException;
import byui.cit260.lostinSpace.view.ViewInterface.View;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Megan
 */
public class FuelView extends View{
    
    public FuelView() {
        
        
        super("\n Please enter the amount of fuel you wish to gather.");
        
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
    
    @Override
    public boolean doAction(String userChoice) {
        
        int choice = 0;
        
        try {
            String input = userChoice;
            
            try {
            choice = Integer.parseInt(input); // convert input to int
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number."
                                  +"\n Try again or enter Q to quit.");
            return false;}
            int doEquation = FuelControl.gatherFuel(15,7,choice);
            
            //prints line if  user exceeded the maximum
            /*if (doEquation == 0) {
                System.out.println("You exceeded the maximum amount for your location. "
                        + "\n *** Please try again. ***");
                return false;
            }
            //Prints line if user inputs an invalid value
            else if (doEquation == -1) { //
                System.out.println("\n *** Invalid input. Please enter a number between 1-10. ***");
                return false;
            }*/
            
            this.displayNextView(doEquation);
            
            return true; //success!
        } catch (FuelControlException ex) {
            //System.out.println("\n YOU HAVE ARRIVED!");
            //String filePath = this.getInput();
            // Logger.getLogger(FuelView.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fuel exception:  "+ex.getMessage());
        }
           
    return true;}

    private void displayNextView(int doEquation) {
        
        // Display a custom welcome message
        System.out.println("\n========================================================"
                        + "\n You have mined" + " " + doEquation + " gallons of fuel!"
                        + "\n========================================================="
                         );
    }
}
