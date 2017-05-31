/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.control;

import java.util.Random;

/**
 *
 * @author Megan
 */
public class FuelControl {
    
    public int gatherFuel (int planetDepth, int surfaceDensity, int userInput) {
        
        planetDepth = 1;
        surfaceDensity = 1;
       
       int miningAttempt;
       
       //Generate random nmber
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(20) + 1;
        
        //Checks for invalid inputs
        if (userInput > 10 || userInput < 1){
           return -1;
       } 
        
        //equation to determine how much fuel to mine
        miningAttempt = userInput + randomNumber - surfaceDensity;
        
            //If fuel amount exceeds planet depth, no fuel is collected
           if (miningAttempt > planetDepth){
                return 0;
            }
        return miningAttempt;
       
    }
    
}
