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
    
    static public int gatherFuel (int planetDepth, int surfaceDensity, int userInput) {
        
        planetDepth = 15;
        surfaceDensity = 7;
       int miningAttempt;
       
       //Generate random nmber between 1-20
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(20) + 1;
        
            //Checks for invalid inputs
            if (userInput > 10 || userInput < 1){
                return -1;
            } 
        
        //equation to determine how much fuel to mine
        miningAttempt = userInput + random - surfaceDensity;
        
            //If fuel amount exceeds planet depth, no fuel is collected
           if (miningAttempt > planetDepth){
                return 0;
            }
        
        //Pass miningAttempt variable to percentFuel() function
        percentFuel(miningAttempt);
           
        return miningAttempt;
       
    }
    
    static public int percentFuel(int currentFuel) {
        
        //currentFuel = 100;
        
        //Fuel tank capacity
        int fuelCapacity = 30;
        
        //calculate percent
        currentFuel = (currentFuel/ fuelCapacity) * 100;
        
            if (currentFuel < 20) {
                return -2;
            }
        
        return currentFuel;
    }
}
