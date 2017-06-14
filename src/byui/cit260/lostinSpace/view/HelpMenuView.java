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
public class HelpMenuView extends View{
    
    public HelpMenuView() {
                    super( "\n"
                  + "\n--------------------------------"
                  + "|     Help Menu                   |"
                  + "\n--------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to Move"
                  + "\nF - View Fuel Percentage"
                  + "\nE - Exit Help Menu"
                  + "\nQ - Quit Game"
                  + "\n--------------------------------"); 
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.displayGoal();
                break;
            case "M":
                this.howToMove();
                break;
            case "F":
                this.displayFuelPer();
                break;  
            case "E":
                this.returnMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        }

    private void displayGoal() {
         System.out.println("The goal is to return to Earth safely by "
                 + "\n navigating your way through space, fighting off "
                 + "\n dangerous alien creatures, and collecting helpful "
                 + "\n clues and resources to help you along the way.");
    }

    private void howToMove() {
        System.out.println("The player jumps from one planet to the "
                + "\n other in his spaceship. The player will “look to "
                + "\n the stars” to see the four planets they will be "
                + "\n able to move to. Will it move them closer to or "
                + "\n farther from Earth? The player doesn't know...");
    }

    private void displayFuelPer() {
         System.out.println("The player should check the fuel "
                 + "\n percentage of the spaceship before traveling "
                 + "\n to the next destination. If the fuel level "
                 + "\n is less than 20%, the player will need to "
                 + "\n earn more fuel before launching to a different "
                 + "\n celestial body.");
    }

    private void returnMainMenu() {
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        //Display the main menu view
        mainMenuView.display();
    }
 
}
