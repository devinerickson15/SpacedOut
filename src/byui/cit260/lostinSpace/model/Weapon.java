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
public class Weapon implements Serializable {
    
    private String weaponName;
    private int weaponDamage;

    public Weapon() {
    }
    

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    @Override
    public String toString() {
        return "Weapon{" + "weaponName=" + weaponName + ", weaponDamage=" + weaponDamage + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.weaponName);
        hash = 11 * hash + this.weaponDamage;
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
        final Weapon other = (Weapon) obj;
        if (this.weaponDamage != other.weaponDamage) {
            return false;
        }
        if (!Objects.equals(this.weaponName, other.weaponName)) {
            return false;
        }
        return true;
    }
    
    
    
}
