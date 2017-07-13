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

public class FuelAmountView extends View{
    
    public FuelAmountView() {
        
        
        super("\n Please enter amount of fuel gathered.");
        
        this.displayDescription();
    
    }
    
    private void displayDescription() {
        System.out.println(
                "\n*******************************************************"
              + "\n You must have at least 20% of fuel capacity to attempt take off"
              + "\n Enter the amount of fuel you mined to deteremine if "
              + "\n take off is a possibility for you, Earthling."
              + "\n*******************************************************"
        );
    }
    
    @Override
    public boolean doAction(String userChoice) {
        
        double choice = 0;
        
        try {
            String input = userChoice;
            
            try {
            choice = Double.parseDouble(input); // convert input to double
            } catch (NumberFormatException nf) {
                System.out.println("\nYou must enter a valid number."
                                  +"\n Try again or enter Q to quit.");
            return false;}
           double doEquation = FuelControl.tankAmount(choice);
            
            
            this.displayNextView(doEquation);
            
            return true; //success!
        } catch (FuelControlException ex) {
            Logger.getLogger(FuelView.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    return true;}

    private void displayNextView(double doEquation) {
        
        // Display a custom welcome message
        System.out.println("\n=================================================================="
                        + "\n You have " + " " + doEquation + " percent of fuel remaining!"
                        + "\n==================================================================="
                         );
    }
}

    
