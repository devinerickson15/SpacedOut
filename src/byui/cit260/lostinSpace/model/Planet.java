/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.model;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author devinerickson
 */
public class Planet implements Serializable {
   
    //Bean
    private String name;
    private String desc;
    private int currentLocation;
    public int planetDepth;
    public int surfaceDensity;
    
    //Public 
    public Planet(){
    }
    
    public Planet(String name, String desc, int currentLocation, int planetDepth, int surfaceDensity){
        setName(name);
        setDesc(desc);
        setCurrentLocation(currentLocation);
        setPlanetDepth(planetDepth);
        setSurfaceDensity(surfaceDensity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }
    
    public int getPlanetDepth() {
        return planetDepth;
    }
    
    public int setPlanetDepth(int planetDepth) {
        this.planetDepth = planetDepth;
        return planetDepth;
    }
    
    public int getSufaceDensity() {
        return surfaceDensity;
    }
    
    public int setSurfaceDensity(int surfaceDensity) {
        this.surfaceDensity = surfaceDensity;
        return surfaceDensity;
    }
    
    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Planet{" + "name=" + name + ", desc=" + desc + ", currentLocation=" + currentLocation + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.desc);
        hash = 67 * hash + this.currentLocation;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Planet other = (Planet) obj;
        if (this.currentLocation != other.currentLocation) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.desc, other.desc)) {
            return false;
        }
        return true;
    }

    public void setScene(RegularSceneType regularSceneType) {
       System.out.println("\n*** stub function called***"); 
    }
    
    
}
