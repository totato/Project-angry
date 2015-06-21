/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.List;

/**
 *
 * @author Toast
 */
public class Waffe extends Item {

    
    private int damage;
    private int reloadTime;
    private List<String> spruch;
    private double spruchWk;
    

    public Waffe(String name, String beschreibung, int damage, int reloadTime, int kosten, List<String> spruch, double spruchWk) {
        
        super(name, beschreibung, kosten);
        
        this.spruchWk = spruchWk;
        this.spruch = spruch;
        this.damage = damage;
        this.reloadTime = reloadTime;
    }

    
    public double getSpruchWk() {
        return spruchWk;
    }

    
    public List<String> getSpruch() {
        return spruch;
    }

    public int getDamage() {
        return damage;
    }

    public long getReloadTime() {
        return reloadTime;
    }


    public String getDescription() {
        String desc = "";
        desc += super.getName() + ":";
        desc += "\n" + super.getBeschreibung();
        desc += "\nSchaden: " + damage;
        desc += "\nNachladezeit: " + reloadTime;
        desc += "\nKosten: " + super.getKosten();

        return desc;
    }

}
