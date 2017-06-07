/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import java.util.Scanner;

/**
 *
 * @author Megan
 */
public class GameMenuView {
    
    private String menu;
    
    public GameMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------"
                  + "|     Game Menu                   |"
                  + "\n--------------------------------"
                  + "\nL - Lift Off"
                  + "\nG - Gather Fuel"
                  + "\nF - View Fuel Percentage"
                  + "\nC - Current Weapon"
                  + "\nS - Save Game"
                  + "\nH - Help"
                  + "\nQ - Quit"
                  + "\n--------------------------------";           
    }
    
    public void displayMenu() {
      
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
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
            case "L":
                this.startLiftOff();
                break;
            case "R":
                this.gatherFuel();
                break;
            case "F":
                this.viewFuelPercentage();
                break;
            case "C":
                this.currentWeapon();
                break;
            case "S":
                this.saveGame();
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

    private void startLiftOff() {
        System.out.println("\n*** startLiftOff() stub function called***");
    }

    private void gatherFuel() {
        System.out.println("\n*** gatherFuel() stub function called***");
    }

    private void viewFuelPercentage() {
        System.out.println("\n*** viewFuelPercentage() stub function called***");
    }

    private void currentWeapon() {
        System.out.println("\n*** currentWeapon() stub function called***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() stub function called***");
    }

    private void displayHelpMenu() {
        
        //display the help menu view
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
   
}
