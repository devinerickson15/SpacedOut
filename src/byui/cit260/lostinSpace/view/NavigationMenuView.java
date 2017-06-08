/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import java.util.Scanner;

/**
 *
 * @author Devin
 */
public class NavigationMenuView {
    
     private String menu;
    
    public NavigationMenuView() {
        this.menu = "\n"
                  + "\n--------------------------------"
                  + "|     Navigation Menu                   |"
                  + "\n--------------------------------"
                  + "\nN - Neptune"
                  + "\nU - Uranus"
                  + "\nS - Saturn"
                  + "\nT - Titan"
                  + "\nJ - Jupiter"
                  + "\nM - Mars"
                  + "\nL - Luna"
                  + "\nE - Earth"
                  + "\nH - Help"
                  + "\nQ - Exit"
                  + "\n--------------------------------";           
    }
    
    public void displayNavigationMenuView() {
      
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
            case "N":
                this.startNeptune();
                break;
            case "U":
                this.startUranus();
                break;
            case "S":
                this.startSaturn();
                break;
            case "T":
                this.startTitan();
                break;
            case "J":
                this.startJupiter();
                break;
            case "M":
                this.startMars();
                break;
            case "L":
                this.startLuna();
                break;
            case "E":
                this.startEarth();
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

    private void startNeptune() {
                System.out.println("\n*** startNeptune() stub function called***");
    }

    private void startUranus() {
               System.out.println("\n*** startUranus() stub function called***");
    }

    private void startSaturn() {
                System.out.println("\n*** startSaturn() stub function called***");
    }

    private void startTitan() {
               System.out.println("\n*** startTitan() stub function called***");
    }

    private void startJupiter() {
                System.out.println("\n*** startJupiter() stub function called***");
    }
    
    private void startMars() {
                System.out.println("\n*** startMars() stub function called***");
    }
    
    private void startLuna() {
                System.out.println("\n*** startLuna() stub function called***");
    }

    private void startEarth() {
                System.out.println("\n*** startEarth() stub function called***");
    }
   

    private void displayHelpMenu() {
        
        //display the help menu view
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }
}