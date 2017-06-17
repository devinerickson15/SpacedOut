/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.view.ViewInterface.View;

/**
 *
 * @author Megan
 */
public class FuelPercentMenuView extends View{
    
    public FuelPercentMenuView() {
               super("\n"
                  + "\n--------------------------------"
                  + "|          Game Menu                   |"
                  + "\n--------------------------------"
                  + "\nF - Fuel Percentage"
                  + "\nG - How to gather Fuel"
                  + "\nH - Help"
                  + "\nQ - Quit"
                  + "\n--------------------------------");           
    }

    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "F":
                this.displayPercent();
                break;
            case "G":
                this.gatherFuel();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        }

    private void displayPercent() {
        System.out.println("**** Stub function displayPercent() called ***");
    }

    private void gatherFuel() {
        System.out.println("To collect more fuel, go to Game Menu and select 'Gather Fuel'");
    }

    private void displayHelpMenu() {
        
         //display the help menu view
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
}
