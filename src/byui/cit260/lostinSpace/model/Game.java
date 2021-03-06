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
 * @author Megan
 */
public class Game implements Serializable{
    
    private String name;
    private double totalTime;
    
    private Player player;
    private Inventory[] inventory;
    private Map map;
    private Weapon[] weapons;
    private Fuel fuel;
    private Alien[] aliens;
    

    public Game() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public Map getMap(){
        return map;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", totalTime=" + totalTime + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }   

    public void setPlayer(Player player) {
        System.out.println("\n*** setPLayer() stub function called***");
    }

    public void setInventory(Inventory[] inventoryList) {
        System.out.println("\n*** setInventoryK() stub function called***");
    }

    public void setMap(Map newMap) {
        map = newMap;
    }

    public void setWeapon(Weapon[] weaponList) {
           System.out.println("\n*** setWeapon() stub function called***");
    }

    public void setFuel(Fuel fuel) {
        System.out.println("\n*** setFuel() stub function called***");
    }

    public void setAlien(Alien[] alienList) {
        System.out.println("\n*** setAlien() stub function called***");
    }
}

