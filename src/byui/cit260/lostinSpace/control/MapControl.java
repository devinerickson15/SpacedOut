/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.control;

import byui.cit260.lostinSpace.model.Map;
import byui.cit260.lostinSpace.model.Planet;

/**
 *
 * @author JacobsonKe
 */
class MapControl {

    public static Map createMap() {
    
    Map map = new Map();
    
    Planet[] locations = new Planet[16];
    
    /*private String name;
    private String desc;
    private int currentLocation;
    public int planetDepth;
    public int surfaceDensity;*/
    
    locations[0] = new Planet("Neptune", "A cold planet.", 0, 15, 7);
    locations[1] = new Planet("Uranus", "Take a guess.", 1, 25, 14);
    locations[2] = new Planet("Saturn", "It has many rings.", 2, 37, 31);
    locations[3] = new Planet("Titan", "It is made up, I think it is acutally a moon.", 3, 34, 19);
    locations[4] = new Planet("Jupiter", "Has a red spot, should get it checked for cancer.", 4, 49, 24);
    locations[5] = new Planet("Mars" , "Dry and barren", 5, 29, 15);
    locations[6] = new Planet("Moon", "Hey, I can see my house from here", 6, 22, 12);
    locations[7] = new Planet("Pluto", "Did you hear about Pluto?! That's messed up!", 7, 33, 18);
    locations[8] = new Planet ("Fiesta", "A party around every crater.", 8, 16, 28);
    locations[9] = new Planet ("Orblook", "A perfectly round planet", 9, 17, 20);
    locations[10] = new Planet ("Zarthon", "Made of crystals (not crystal meth).", 10, 31, 12);
    locations[11] = new Planet ("Athenia", "Watch out for the teenagers.", 11 , 25, 22);
    locations[12] = new Planet ("Draconia", "A harsh place to make a home.", 12, 19, 29);
    locations[13] = new Planet ("Blowhard", "High heat and strong winds", 13, 45, 22); //My mother-in-law named this one :)
    locations[14] = new Planet ("Enano", "Beware the dwarf!", 14, 40, 21);
    locations[15] = new Planet ("Niqueetun", "Don't get caught in the curls!", 15, 42, 19);
   
    
    assignScenesToLocations(locations);
    return map;
    
    }

    static void movePlayersToStartingLocation(Map map) {
        System.out.println("\n*** movePlayersToStartingLocation() stub function called***");
    }

    private static void assignScenesToLocations(Planet[] locations) {
        System.out.println("\n*** assignScenesToLocations() stub function called***");
    }
    
}
