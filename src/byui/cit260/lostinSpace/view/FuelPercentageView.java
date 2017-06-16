/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.FuelControl;
import byui.cit260.lostinSpace.model.AltViewInterface.AltView;
import byui.cit260.lostinSpace.view.ViewInterface.View;

/**
 *
 * @author Kevin
 */
public class FuelPercentageView{
    
    public FuelPercentageView() {

        this.displayBanner();
    }
    
    public void displayBanner() {
        System.out.println("\n ***Liftoff requires a minimum of 20% of "
                + "your spaceship’s fuel capacity. ***");
    }
    
    public boolean doAction(int percent) {
        
        percent = FuelControl.percentFuel(percent); 
            
            //prints line if fuel is below 20%
           if (percent == -2) {  
                System.out.println("***Your spaceship has " 
                        + percent + "% fuel remaining."
                        + "\n WARNING: Low on fuel. ADD fuel now! ");
                return true;
            }

        this.displayNextView(percent);
    
        return true; //success!
           
    }

    private void displayNextView(int percent) {
        
        // Display a custom welcome message
        System.out.println("\n========================================================"
                        + "\n You have" + " " + percent + " % fuel remaining!"
                        + "\n========================================================="
                         );
    }
    
}
