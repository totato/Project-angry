/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Toast
 */
public class Waffe {
    
    private String Name;
    private int damage;
    private long reloadTime;

    public Waffe(String Name, int damage, long reloadTime) {
        this.Name = Name;
        this.damage = damage;
        this.reloadTime = reloadTime;
    }

    public String getName() {
        return Name;
    }

    public int getDamage() {
        return damage;
    }

    public long getReloadTime() {
        return reloadTime;
    }
    
    
}
