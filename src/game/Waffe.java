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
public class Waffe extends Item {

    
    private int damage;
    private int reloadTime;
    

    public Waffe(String name, String beschreibung, int damage, int reloadTime, int kosten) {
        
        super(name, beschreibung, kosten);
        
        this.damage = damage;
        this.reloadTime = reloadTime;
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
