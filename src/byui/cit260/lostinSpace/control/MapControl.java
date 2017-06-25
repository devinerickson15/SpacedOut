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
    
    Planet[] locations = new Planet[5];
    
    /*private String name;
    private String desc;
    private int currentLocation;
    public int planetDepth;
    public int surfaceDensity;*/
    
    locations[0] = new Planet("Neptune", "A cold planet.", 0, 15, 7);
    locations[1] = new Planet("Uranus", "Take a guess.", 1, 25, 14);
    locations[2] = new Planet("Saturn", "It has many rings.", 2, 37, 31);
    locations[3] = new Planet("Titan", "It is made up, I think it is acutally a moon.", 3, 34, 19);
    locations[4] = new Planet("Jupitar", "Has a red spot, should get it checked for cancer.", 4, 49, 24);
    
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
