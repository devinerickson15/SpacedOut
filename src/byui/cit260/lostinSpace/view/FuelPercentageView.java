/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

import byui.cit260.lostinSpace.control.FuelControl;
//import byui.cit260.lostinSpace.model.AltViewInterface.AltView;
import byui.cit260.lostinSpace.view.ViewInterface.View;

/**
 *
 * @author Kevin
 */
public class FuelPercentageView{
    
    private String promptMessage;
    
    private int percent = FuelControl.percentFuel();
    
    public FuelPercentageView() {
                        
        this.displayDescription();
    }
    
    public void displayDescription() {
        System.out.println("\n ***You currently have " + percent +"% fuel.***"
                + "\n "
                + "\n ***Liftoff requires a minimum of 20% of "
                + "\n your spaceship’s fuel capacity. ***");
    }
    
    /**@Override
    public boolean doAction() {
          
        
        
        //int X = Integer.parseInt(input);
        
        int percent = FuelControl.percentFuel(); 
            
            //prints line if fuel is below 20%
           if (percent == -2) {  
                System.out.println("***Your spaceship has " 
                        + percent + "% fuel remaining."
                        + "\n WARNING: Low on fuel. ADD fuel now! ");
                return false;
            }

        this.displayNextView(percent);
    
        return true; //success!
    }
    */
    

    
   /** private void displayNextView(int percent) {
        
        // Display a custom welcome message
        System.out.println("\n========================================================"
                        + "\n You have" + " " + percent + " % fuel remaining!"
                        + "\n========================================================="
                         );
    }
*/

    
}
