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
 * @author JacobsonKe
 */
public class Inventory implements Serializable{
    
    //class instance variables
    private double remainingFuel;
    private String currentWeapon;

    public Inventory() {
    }
    

    public double getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(double remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public String getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(String currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    @Override
    public String toString() {
        return "Inventory{" + "remainingFuel=" + remainingFuel + ", currentWeapon=" + currentWeapon + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.remainingFuel) ^ (Double.doubleToLongBits(this.remainingFuel) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.currentWeapon);
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.remainingFuel) != Double.doubleToLongBits(other.remainingFuel)) {
            return false;
        }
        if (!Objects.equals(this.currentWeapon, other.currentWeapon)) {
            return false;
        }
        return true;
    }
             
}
