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
 * @author JacobsonKe
 */
public class FightMenuView extends View{
    
    public FightMenuView() {
        super ("\n"
                + "\n----------------------------------"
                + "\n      Battle Alien Menu           "
                + "\n----------------------------------"
                + "\n B - Battle alien                 "
                + "\n F - Flee from alien              "
                + "\n T - Throw dirt and scream        "
                + "\n Q - Quit to Game Menu            "
                + "\n----------------------------------"); 
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "B":
                this.attackAlien();
                break;
            case "F":
                this.fleeAlien();
                break;
            case "T":
                this.throwDirt();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        }

    private void attackAlien() {
        System.out.println("\n*** attackAlien() stub function called***");
    }

    private void fleeAlien() {
        System.out.println("\n*** fleeAlien() stub function called***");
    }

    private void throwDirt() {
        System.out.println("You throw some dirt at the alien and scream like a little girl. Luckily nothing happens to you... for now.");
    }
        
    }
    

    