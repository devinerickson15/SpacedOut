/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.view;

/**
 *
 * @author Kevin
 */
public class FuelView {
    
    private String promptMessage;

    public FuelView() {
        
        this.promptMessage = "\nPlease enter the amount of fuel you wish to gather.";
        
        this.displayDescription();
    
    }
    
    private void displayDescription() {
        System.out.println(
                "\n*******************************************************"
                + " "
        );
    }
    
}
