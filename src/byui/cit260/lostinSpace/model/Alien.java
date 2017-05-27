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
public class Alien implements Serializable {
    
    //Bean
    private int alienHp;
    private String description;
    private int weakAttack;
    private int mediumAttack;
    private int strongAttack;

    public Alien() {
    }

    @Override
    public String toString() {
        return "Alien{" + "alienHp=" + alienHp + ", description=" + description + ", weakAttack=" + weakAttack + ", mediumAttack=" + mediumAttack + ", strongAttack=" + strongAttack + '}';
    }

    
    public int getAlienHp() {
        return alienHp;
    }

    public void setAlienHp(int alienHp) {
        this.alienHp = alienHp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeakAttack() {
        return weakAttack;
    }

    public void setWeakAttack(int weakAttack) {
        this.weakAttack = weakAttack;
    }

    public int getMediumAttack() {
        return mediumAttack;
    }

    public void setMediumAttack(int mediumAttack) {
        this.mediumAttack = mediumAttack;
    }

    public int getStrongAttack() {
        return strongAttack;
    }

    public void setStrongAttack(int strongAttack) {
        this.strongAttack = strongAttack;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.alienHp;
        hash = 73 * hash + Objects.hashCode(this.description);
        hash = 73 * hash + this.weakAttack;
        hash = 73 * hash + this.mediumAttack;
        hash = 73 * hash + this.strongAttack;
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
        final Alien other = (Alien) obj;
        if (this.alienHp != other.alienHp) {
            return false;
        }
        if (this.weakAttack != other.weakAttack) {
            return false;
        }
        if (this.mediumAttack != other.mediumAttack) {
            return false;
        }
        if (this.strongAttack != other.strongAttack) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
}
