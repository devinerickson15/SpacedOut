/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.view.ViewInterface.View;
import java.util.Scanner;

/**
 *
 * @author Megan
 */
public class GameMenuView extends View{
    
    private String menu;
    
    public GameMenuView() {
               super("\n"
                  + "\n--------------------------------"
                  + "|          Game Menu                   |"
                  + "\n--------------------------------"
                  + "\nL - Lift Off"
                  + "\nG - Gather Fuel"
                  + "\nF - View Fuel Percentage"
                  + "\nC - Current Weapon"
                  + "\nE - Engage Alien"
                  + "\nP - Solve A Puzzle"
                  + "\nS - Save Game"
                  + "\nH - Help"
                  + "\nQ - Quit"
                  + "\n--------------------------------");           
    }

    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "L":
                this.startLiftOff();
                break;
            case "G":
                this.gatherFuel();
                break;
            case "F":
                this.viewFuelPercentage();
                break;
            case "C":
                this.currentWeapon();
                break;
            case "E":
                this.displayFightMenu();
                break;
            case "P":
                this.displayPuzzleMenu();
                break;
            case "S":
                this.saveGame();
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

    private void startLiftOff() {
          
        //Display the Navigation menu 
        NavigationMenuView navMenuView = new NavigationMenuView();
        navMenuView.display();
    }

    private void gatherFuel() {
        
        //Display the fuel View
        FuelView fuelView = new FuelView();
        fuelView.display();
    }

    private void viewFuelPercentage() {
        System.out.println("\n*** viewFuelPercentage() stub function called***");
    }

    private void currentWeapon() {
        System.out.println("\n*** currentWeapon() stub function called***");
    }
    
    private void displayPuzzleMenu() {
        PuzzleMenuView puzzMenuView = new PuzzleMenuView();
        puzzMenuView.display();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() stub function called***");
    }

    private void displayHelpMenu() {
        
        //display the help menu view
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void displayFightMenu() {
        FightMenuView fightMenuView = new FightMenuView();
        fightMenuView.display();
    }
   
}
