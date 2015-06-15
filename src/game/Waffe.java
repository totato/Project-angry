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
    
    private String name;
    private int damage;
    private int reloadTime;
    private int kosten;

    public Waffe(String name, int damage, int reloadTime, int kosten) {
        this.name = name;
        this.damage = damage;
        this.reloadTime = reloadTime;
        this.kosten = kosten;
    }

    public String getName() {
        return name;
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
    
    public String getDescription(){
        String desc = "";
        desc += name + ":";
        desc += "\nSchaden: " + damage;
        desc += "\nNachladezeit: " + reloadTime;
        desc += "\nKosten: " + kosten;
        
        return desc;
    }
    
}
