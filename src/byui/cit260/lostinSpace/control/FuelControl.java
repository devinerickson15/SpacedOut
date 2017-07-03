/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.control;

import byui.cit260.lostinSpace.exceptions.FuelControlException;
import java.util.Random;

/**
 *
 * @author Megan
 */
public class FuelControl {
    
    static public int gatherFuel (int planetDepth, int surfaceDensity, int userInput) throws FuelControlException {
        
        planetDepth = 15;
        surfaceDensity = 7;
       int miningAttempt;
       
       //Generate random nmber between 1-20
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(20) + 1;
        
            //Checks for invalid inputs
            if (userInput > 10 || userInput < 1){
                throw new FuelControlException("Invalid input, please enter a number between 1 and 10.");
            } 
        
        //equation to determine how much fuel to mine
        miningAttempt = userInput + random - surfaceDensity;
        
            //If fuel amount exceeds planet depth, no fuel is collected
           if (miningAttempt > planetDepth){
                throw new FuelControlException("You have exceeded the planet's maximum depth, please try again.");
            }
        
        //Pass miningAttempt variable to percentFuel() function
        //percentFuel(miningAttempt);
           
        return miningAttempt;
       
    }
    
    public static double tankAmount(double currentFuel)throws FuelControlException{
        
       double tankCapacity = 30;
        double percFuel = 0;
        
        if (currentFuel < 0 || currentFuel > 30){
            throw new FuelControlException("Please enter a valid input");
        }
        
        percFuel = (currentFuel/ tankCapacity) * 100;
        
        if (percFuel < 20){
            throw new FuelControlException("Fuel is too low for travel. "
                    + "Return to Game Menu to mine more fuel.");
        }
        
        return percFuel;
    }
    
   /** static public int percentFuel(int currentFuel) {
        
        //currentFuel = 100;
        
        //Fuel tank capacity
        int fuelCapacity = 30;
        
        //calculate percent
        currentFuel = (currentFuel/ fuelCapacity) * 100;
        
            if (currentFuel < 20) {
                return -2;
            }
        
        return currentFuel;
    }*/
    
}
