/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gui.WindowProperties;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Toast
 */
public class SkillHandler {

    private static HashMap<String, Methode> faggots;
    //Werte, die durch Skills steigen
    int autoDamage;
    double spawnrateReduktion;
    double brillenWK;
    double expWK;
    double kritChance;

    public SkillHandler() {
        faggots = new HashMap();
        autoDamage = 0;
        spawnrateReduktion = 0.0;
        brillenWK = 0.0;
        expWK = 0.0;
        kritChance = 0.0;

        faggots.put("AUTO-DAMAGE", new Methode() {

            @Override
            public void mach(String s) {
                autoDamage += Integer.parseInt(s);
            }
        });
        faggots.put("SPAWNRATE-REDUKTION", new Methode() {

            @Override
            public void mach(String s) {
                spawnrateReduktion += Double.parseDouble(s);
            }
        });
        faggots.put("BRILLEN-WK", new Methode() {

            @Override
            public void mach(String s) {
                brillenWK += Double.parseDouble(s);
            }
        });
        faggots.put("EXP-WK", new Methode() {

            @Override
            public void mach(String s) {
                expWK += Double.parseDouble(s);
            }
        });
        faggots.put("KRIT-CHANCE", new Methode() {

            @Override
            public void mach(String s) {
                kritChance += Double.parseDouble(s);
            }
        });
        faggots.put("WAFFEN-UPDATE", new Methode() {

            @Override
            public void mach(String s) throws IOException {
                Game.getAktGame().upgradeWeapon(Integer.parseInt(s));
            }
        });

    }

    public boolean befehlAusführen(String befehl, String wert) throws IOException {
        if (faggots.containsKey(befehl)) {
            System.out.println("Befehl nicht gefunden");
            return false;
        }
        
        faggots.get("befehl").mach(wert);
        return true;
    }

    public static HashMap<String, Methode> getFaggots() {
        return faggots;
    }

    public int getAutoDamage() {
        return autoDamage;
    }

    public double getSpawnrateReduktion() {
        return spawnrateReduktion;
    }

    public double getBrillenWK() {
        return brillenWK;
    }

    public double getExpWK() {
        return expWK;
    }

    public double getKritChance() {
        return kritChance;
    }
    
    public void recalculateSkills(int[] skillStufen) throws IOException{
        
        List<String> skillTXT;
        int startPos = 0;
        int endPos = 0;
        //int befehlPos;
        
        for(int skillnr = 0; skillnr < skillStufen.length; skillnr++){
            skillTXT = WindowProperties.ladeTXT("Skills/Skill_" + skillnr + ".txt");
            for(int subskillnr = 1; startPos >= 0; subskillnr++){
                
                startPos = skillTXT.indexOf("-START" + subskillnr + "-");
                for(int befehlPos = startPos +6; befehlPos < endPos; befehlPos = befehlPos + 2){
                    this.befehlAusführen(skillTXT.get(befehlPos), skillTXT.get(befehlPos+1));
                }
            }
            
        }
    }

}
