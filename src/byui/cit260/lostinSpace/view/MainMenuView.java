/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.GameControl;
import java.util.Scanner;
import lostinspace.LostInSpace;

/**
 *
 * @author Megan
 */
public class MainMenuView {

    private String menu;
    
    
    public void displayMainMenuView() {
      
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        }
    
        public MainMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------"
                  + "|     Main Menu                   |"
                  + "\n--------------------------------"
                  + "\nN - Start new game"
                  + "\nR - Restore existing game"
                  + "\nH - Get help on how to play the game"
                  + "\nE - Exit"
                  + "\n--------------------------------";           
    }
    

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value =keyboard.nextLine();
            value =value.trim();
            if (value.length() < 1){
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break;
        }
        return value;
    }

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
                return false;
        }
        return true;
        }

    private void startNewGame() {
        
        //Create a new game
        GameControl.createNewGame(LostInSpace.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void restoreExistingGame() {
        System.out.println("*** restoreExistingGame function called***");
    }

    private void displayHelpMenu() {
        
        //create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        
        //display the help menu view
        helpMenuView.displayHelpMenuView();
    }
    }
    
    
