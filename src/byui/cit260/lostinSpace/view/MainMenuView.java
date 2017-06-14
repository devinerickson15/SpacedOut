/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.GameControl;
import byui.cit260.lostinSpace.view.ViewInterface.View;
import java.util.Scanner;
import lostinspace.LostInSpace;

/**
 *
 * @author Megan
 */
public class MainMenuView extends View{
  
       public MainMenuView() {
                   super(  "\n"
                  + "\n--------------------------------"
                  + "|     Main Menu                   |"
                  + "\n--------------------------------"
                  + "\nN - Start new game"
                  + "\nR - Restore existing game"
                  + "\nH - Get help on how to play the game"
                  + "\nQ - Quit"
                  + "\n--------------------------------");           
    }
    

     @Override        
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "R":
                this.restoreExistingGame();
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

    private void startNewGame() {
        
        //Create a new game
        GameControl.createNewGame(LostInSpace.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void restoreExistingGame() {
        System.out.println("*** restoreExistingGame function called***");
    }

    private void displayHelpMenu() {
        
        //create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        //display the help menu view
        helpMenuView.display();
    }
    }
    
    
