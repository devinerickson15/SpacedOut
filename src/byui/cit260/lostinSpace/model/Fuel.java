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
public class Fuel implements Serializable {
    
    private String collectFuel;
    private double storeFuel;

    public Fuel() {
    }
    

    public String getCollectFuel() {
        return collectFuel;
    }

    public void setCollectFuel(String collectFuel) {
        this.collectFuel = collectFuel;
    }

    public double getStoreFuel() {
        return storeFuel;
    }

    public void setStoreFuel(double storeFuel) {
        this.storeFuel = storeFuel;
    }

    @Override
    public String toString() {
        return "Fuel{" + "collectFuel=" + collectFuel + ", storeFuel=" + storeFuel + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.collectFuel);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.storeFuel) ^ (Double.doubleToLongBits(this.storeFuel) >>> 32));
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
        final Fuel other = (Fuel) obj;
        if (Double.doubleToLongBits(this.storeFuel) != Double.doubleToLongBits(other.storeFuel)) {
            return false;
        }
        if (!Objects.equals(this.collectFuel, other.collectFuel)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
