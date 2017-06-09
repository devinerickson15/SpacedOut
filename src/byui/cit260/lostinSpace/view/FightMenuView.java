/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import java.util.Scanner;

/**
 *
 * @author JacobsonKe
 */
public class FightMenuView {
    
    private String menu;
    
    public FightMenuView() {
        this.menu = "\n"
                + "\n----------------------------------"
                + "\n      Battle Alien Menu           "
                + "\n----------------------------------"
                + "\n B - Battle alien                 "
                + "\n F - Flee from alien              "
                + "\n T - Throw dirt and scream        "
                + "\n Q - Quit to Main Menu            "
                + "\n----------------------------------"; 
    }
    
    public void displayFightMenuView() {
        
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

    private boolean doAction(String choice) {
        
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
    

    