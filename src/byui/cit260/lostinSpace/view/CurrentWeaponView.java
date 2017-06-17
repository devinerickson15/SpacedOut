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
public class CurrentWeaponView extends View{
    
    private String menu;
    
    public CurrentWeaponView() {
        super    ("\n*****************************************************"
                + "\n** You can view your currently equipped weapon,    **"
                + "\n** view the weapons in your inventory, and change  **"
                + "\n** your current weapon from this menu.             **"
                + "\n**                                                 **"
                + "\n** C - Currently Equipped Weapon                   **"
                + "\n** I - Inventory of Weapons                        **"
                + "\n** X - Equip a Different Weapon                    **"
                + "\n** Q - Quit to Game Menu                           **"
                + "\n**                                                 **"
                + "\n*****************************************************");
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "C":
                this.checkCurrentWeapon();
                break;
            case "I":
                this.checkWeaponInventory();
                break;
            case "X":
                this.equipDifferentWeapon();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
        }

    private void checkCurrentWeapon() {
        System.out.println("\n*** checkCurrentWeapon() stub function called***");
    }

    private void checkWeaponInventory() {
        System.out.println("\n*** checkWeaponInventory() stub function called***");
    }

    private void equipDifferentWeapon() {
        System.out.println("\n*** equipDifferentWeapon() stub function called***");
    }
    
}

