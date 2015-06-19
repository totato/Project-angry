/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import static game.Data.ANZAHL_SKILLS;
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
    private int autoDamage;
    private double spawnrateReduktion;
    private double brillenWK;
    private double expWK;
    private double kritChance;
    

    //Skilltree-Infos
    private int skillSelected;
    
    private static List<List<String>> skillTXTs;

    public SkillHandler() throws IOException {
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
        
        SkillHandler.skillTXTs = new ArrayList();
        
        for(int skillnr = 0; skillnr < Data.ANZAHL_SKILLS; skillnr++){
            SkillHandler.skillTXTs.add(WindowProperties.ladeTXT("Skills/Skill_" + skillnr + ".txt"));
        }

    }

    public boolean befehlAusführen(String befehl, String wert) throws IOException {
        if (!faggots.containsKey(befehl)) {
            System.out.println("Befehl nicht gefunden");
            return false;
        }

        faggots.get(befehl).mach(wert);
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

    public void recalculateSkills() throws IOException {

        List<String> skillTXT;
        int startPos = 0;
        int endPos = 0;
        int[] skillStufen = Game.getAktGame().getData().getSkillsStufen();
        //int befehlPos;

        for (int skillnr = 0; skillnr < skillStufen.length; skillnr++) {
            skillTXT = skillTXTs.get(skillnr);
            for (int subskillnr = 1; subskillnr <= skillStufen[skillnr]; subskillnr++) {

                startPos = skillTXT.indexOf("-START" + subskillnr + "-");
                endPos = skillTXT.indexOf("-END" + subskillnr + "-");
                for (int befehlPos = startPos + 6; befehlPos < endPos; befehlPos = befehlPos + 2) {
                    this.befehlAusführen(skillTXT.get(befehlPos), skillTXT.get(befehlPos + 1));
                }
            }

        }
    }

    public static String skillBeschreibung(int skillnr, int upgradeStufe) throws IOException {

        List<String> skillTXT = skillTXTs.get(skillnr);
        int startPos = skillTXT.indexOf("-START" + upgradeStufe + "-");
        return skillTXT.get(startPos + 2) + "\n" + skillTXT.get(startPos + 3) + "\nKosten in XP: " + skillTXT.get(startPos + 5) + "\nKosten in Brillen: " + skillTXT.get(startPos + 4);

    }

    public void setSkillSelected(int skillSelected) {
        this.skillSelected = skillSelected;
    }

    public int getSkillSelected() {
        return skillSelected;
    }

    public String buySkill(int skillnr) throws IOException {
        List<String> skillTXT = skillTXTs.get(skillnr);
        int startPos = skillTXT.indexOf("-START" + (Game.getAktGame().getData().getSkillStufe(skillnr) + 1)  + "-");
        if(startPos == -1){
            return "Bisheriges Maximallevel für diesen Skill erreicht";
        }
        if (Game.getAktGame().getData().getBrillen() >= Integer.parseInt(skillTXT.get(startPos + 4))) {
            upgradeSkill(skillnr);
            Game.getAktGame().getData().setBrillen(Game.getAktGame().getData().getBrillen()- Integer.parseInt(skillTXT.get(startPos + 4)));
            return "Skill " + skillTXT.get(startPos + 2) + " gekauft.";
        }
        return "Nicht genug Brillen für diesen Skill.";
    }

    public String unlockSkill(int skillnr) throws IOException {
        List<String> skillTXT = skillTXTs.get(skillnr);
        int startPos = skillTXT.indexOf("-START" + (Game.getAktGame().getData().getSkillStufe(skillnr) + 1) + "-");
        if(startPos == -1){
            return "Bisheriges Maximallevel für diesen Skill erreicht";
        }
        if (Game.getAktGame().getData().getExp() >= Integer.parseInt(skillTXT.get(startPos + 5))) {
            upgradeSkill(skillnr);
            Game.getAktGame().getData().setExp(Game.getAktGame().getData().getExp()- Integer.parseInt(skillTXT.get(startPos + 5)));
            return "Skill " + skillTXT.get(startPos + 2) + " erlernt.";
        }
        return "Nicht genug Erfahrung für diesen Skill.";
    }
    
    public static int getMaxSkillLevel(int skillnr){
        
        List<String> skillTXT = skillTXTs.get(skillnr);
        
        for(int s = 1; true; s++){
            if(skillTXT.indexOf("-START" + s + "-") == -1){
                return s-1;
            }
        }
        
    }
    
    public static boolean skillUnlocked(int skillnr){
        List<String> skillTXT = skillTXTs.get(skillnr);
        int startPos = skillTXT.indexOf("-START" + Game.getAktGame().getData().getSkillStufe(skillnr) + "-");
        return (Game.getAktGame().getData().getSkillStufe(Integer.parseInt(skillTXT.get(startPos + 1))) > 0) || (Integer.parseInt(skillTXT.get(startPos + 1)) == -1);
    }
    
    public void upgradeSkill(int skillnr) throws IOException {
        
        Game.getAktGame().getData().setSkillUnlocked(skillnr, Game.getAktGame().getData().getSkillStufe(skillnr) + 1);

    }

}
