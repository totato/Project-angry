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
    private int reloadTime;
    private int kosten;

    public Waffe(String Name, int damage, int reloadTime, int kosten) {
        this.Name = Name;
        this.damage = damage;
        this.reloadTime = reloadTime;
        this.kosten = kosten;
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

    public int getKosten() {
        return kosten;
    }

    
    
    
    
}
