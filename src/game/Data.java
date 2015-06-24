package game;

import java.io.Serializable;

/**
 *
 * @author nicht tseidelm
 */
public class Data implements Serializable{

    public static final int ANZAHL_SKILLS = 35;
    public static final int ANZAHL_WAFFEN = 7;
    public static final int ANZAHL_AUSRÜSTUNG = 3;
    

    private int brillen;//Eine Brille entspricht einem toten Streber entsrpicht einem Kill
    private int lebendeStreber;//Noch lebende Streber, wenn da 0 erreicht nächstes level!
    private int vorherLebendeStreber;
    private int getoeteteStreber;//getötete Streber. Steigt immer weiter, wird aber niemals abgezogen.
    private int aktLevel;
    private int exp;
    private int granaten;//Zahl der noch vorhandenen Granaten
    private int[] skillsStufen; //Welche Skills schon freigeschaltet sind
    private int[] waffenStufen; //Die Stufen jeder Waffe
    private int[] ausrüstungStufen; //Die Stufen jeder Ausrüstung

    private int aktWaffe;

    public Data() {
        brillen = 10000;
        exp = 10000;

        getoeteteStreber = 0;
        aktLevel = 1;

        skillsStufen = new int[ANZAHL_SKILLS];
        for (int b : skillsStufen) {
            b = 0;
        }

        waffenStufen = new int[ANZAHL_WAFFEN];
        for (int i : waffenStufen) {
            i = 0;
        }

        ausrüstungStufen = new int[ANZAHL_AUSRÜSTUNG];
        for (int i : ausrüstungStufen) {
            i = 0;
        }

        aktWaffe = -1;

    }


    public int getGranaten() {
        return granaten;
    }

    public void setGranaten(int granaten) {
        this.granaten = granaten;
    }

    public int getBrillen() {
        return brillen;
    }

    public int getLebendeStreber() {
        return lebendeStreber;
    }

    public int getVorherLebendeStreber() {
        return vorherLebendeStreber;
    }

    public int getGetoeteteStreber() {
        return getoeteteStreber;
    }

    public int getAktLevel() {
        return aktLevel;
    }

    public int getSkillStufe(int i) {
        return skillsStufen[i];
    }

    public int getWaffenStufe(int i) {
        return waffenStufen[i];
    }

    public int getAusrüstungsStufe(int i) {
        return ausrüstungStufen[i];
    }

    public int getAktWaffe() {
        return aktWaffe;
    }

    public int[] getWaffenStufen() {
        return waffenStufen;
    }

    public int[] getUpgradeStufen() {
        int[] upgradeStufen = waffenStufen.clone();

        for (int i = 0; i < upgradeStufen.length; i++) {
            upgradeStufen[i]++;
        }

        return upgradeStufen;
    }

    public void setBrillen(int brillen) {
        this.brillen = brillen;
    }

    public void setLebendeStreber(int lebendeStreber) {
        this.lebendeStreber = lebendeStreber;
    }

    public void setVorherLebendeStreber(int vorherLebendeStreber) {
        this.vorherLebendeStreber = vorherLebendeStreber;
    }

    public void setGetoeteteStreber(int getoeteteStreber) {
        this.getoeteteStreber = getoeteteStreber;
    }

    public void setAktLevel(int aktLevel) {
        this.aktLevel = aktLevel;
    }

    public void setSkillUnlocked(int i, int b) {
        skillsStufen[i] = b;
    }

    public void setWaffenStufe(int i, int ws) {
        waffenStufen[i] = ws;
    }

    public void setAusrüstungStufen(int i, int as) {
        ausrüstungStufen[i] = as;
    }

    public void setAktWaffe(int aktWaffe) {
        this.aktWaffe = aktWaffe;
    }

    public void killStreber(int anzahl) {
        if (lebendeStreber >= anzahl) {
            vorherLebendeStreber = lebendeStreber;
            lebendeStreber -= anzahl;
            getoeteteStreber += anzahl;
            if ((0.5 + Math.random() + Game.getAktGame().getSkills().getBrillenWK()) >= 1.0) {
                brillen += anzahl;
            }
            if ((0.2 + Math.random() + Game.getAktGame().getSkills().getExpWK()) >= 1.0) {
            exp += anzahl;
            }
        } else {
            getoeteteStreber += lebendeStreber;
            brillen += lebendeStreber;
            exp += lebendeStreber;
            lebendeStreber = 0;
        }
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int[] getSkillsStufen() {
        return skillsStufen;
    }
    
    
}
