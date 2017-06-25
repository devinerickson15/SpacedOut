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
                  + "\nMO - Moon"
                  + "\nP - Pluto"
                  + "\nF - Fiesta"
                  + "\nO - Orblook"
                  + "\nZ - Zarathon"
                  + "\nA - Athenia"
                  + "\nD - Draconia"
                  + "\nB - Blowhard"
                  + "\nE - Enano"
                  + "\nNQ - Niqueetun"
                  + "\nBM - Barometer"
                  + "\nBH - Black Hole"
                  + "\nAN - Andromida"
                  + "\nPH - Phobos"
                  + "\nMA - Mathilde"
                  + "\nC - Cupid"
                  + "\nMM - MakeMake"
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
            case "MO":
                this.startMoon();
                break;
            case "P":
                this.startPluto();
                break;
            case "F":
                this.startFiesta();
                break;
            case "O":
                this.startOrblook();
                break;
            case "Z":
                this.startZarthon();
                break;
            case "A":
                this.startAthenia();
                break;
            case "D":
                this.startDraconia();
                break;
            case "B":
                this.startBlowhard();
                break;
            case "EN":
                this.startEnano();
                break;
            case "NQ":
                this.startNiqueetun();
                break;
            case "BM":
                this.startBarometer();
                break;
            case "BH":
                this.startBlackHole();
                break;
            case "AN":
                this.startAndromida();
                break;
            case "PH":
                this.startPhobos();
                break;
            case "MA":
                this.startMathilde();
                break;
            case "C":
                this.startCupic();
                break;
            case "MM":
                this.startMakeMake();
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

    private void startMoon() {
                System.out.println("\n***  stub function called***");
    }

    private void startPluto() {
                System.out.println("\n***  stub function called***");    
    }

    private void startFiesta() {
                System.out.println("\n***  stub function called***");    
    }

    private void startOrblook() {
                System.out.println("\n***  stub function called***");    
    }

    private void startZarthon() {
                System.out.println("\n***  stub function called***");    
    }

    private void startAthenia() {
                System.out.println("\n***  stub function called***");    
    }

    private void startDraconia() {
                System.out.println("\n***  stub function called***");    
    }

    private void startBlowhard() {
                System.out.println("\n***  stub function called***");    
    }

    private void startEnano() {
                System.out.println("\n***  stub function called***");    
    }

    private void startNiqueetun() {
                System.out.println("\n***  stub function called***");    
    }

    private void startBarometer() {
                System.out.println("\n***  stub function called***");    
    }

    private void startBlackHole() {
                System.out.println("\n***  stub function called***");    
    }

    private void startAndromida() {
                System.out.println("\n***  stub function called***");    
    }

    private void startMathilde() {
                System.out.println("\n***  stub function called***");    
    }

    private void startPhobos() {
                System.out.println("\n***  stub function called***");    
    }

    private void startCupic() {
                System.out.println("\n***  stub function called***");    
    }

    private void startMakeMake() {
                System.out.println("\n***  stub function called***");    
    }
}
