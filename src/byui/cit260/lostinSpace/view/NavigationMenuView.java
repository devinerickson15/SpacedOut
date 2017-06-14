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
 * @author Devin
 */
public class NavigationMenuView extends View{
    
     private String menu;
    
    public NavigationMenuView() {
        super ("\n"
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
                  + "\nQ - Quit"
                  + "\n--------------------------------");           
    }

     @Override
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
        helpMenuView.display();
    }
}
