/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostinSpace.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Megan
 */
public class Map implements Serializable{
    
    private Planet[] location;

    public Map() {
    }
    
    public Planet[] getLocation() {
        return location;
    }

    public void setLocation(Planet[] location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Map{" + "location=" + location + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Arrays.deepHashCode(this.location);
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
        final Map other = (Map) obj;
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        return true;
    }

}
