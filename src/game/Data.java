package game;

/**
 *
 * @author nicht tseidelm
 */
public class Data {

    private static final int ANZAHL_SKILLS = 35;
    private static final int ANZAHL_WAFFEN = 6;
    private static final int ANZAHL_AUSRÜSTUNG = 3;

    public static final int START_AUTO_DAMAGE = 0;

    private int brillen;//Eine Brille entspricht einem toten Streber entsrpicht einem Kill
    private int lebendeStreber;//Noch lebende Streber, wenn da 0 erreicht nächstes level!
    private int vorherLebendeStreber;//Noch lebende Streber, voheriger wert, wenn da 0 erreicht nächstes level!
    private int getoeteteStreber;//getötete Streber. Steigt immer weiter, wird aber niemals abgezogen.
    private int aktLevel;
    private int exp;

    private int[] skillsStufen; //Welche Skills schon freigeschaltet sind
    private int autoDamage; //Schaden den man macht, wenn man gerade nicht klickt
    private int[] waffenStufen; //Die Stufen jeder Waffe
    private int[] ausrüstungStufen; //Die Stufen jeder Ausrüstung

    private int aktWaffe;

    public Data() {
        brillen = 0;
        exp = 0;

        getoeteteStreber = 0;
        aktLevel = 1;

        skillsStufen = new int[ANZAHL_SKILLS];
        for (int b : skillsStufen) {
            b = 0;
        }

        autoDamage = START_AUTO_DAMAGE;

        waffenStufen = new int[ANZAHL_WAFFEN];
        for (int i : waffenStufen) {
            i = 0;
        }
        waffenStufen[0] = 1;

        ausrüstungStufen = new int[ANZAHL_AUSRÜSTUNG];
        for (int i : ausrüstungStufen) {
            i = 0;
        }

        aktWaffe = 0;

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

    public int getAutoDamage() {
        return autoDamage;
    }

    public int getSkillUnlocked(int i) {
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

    public void setAutoDamage(int autoDamage) {
        this.autoDamage = autoDamage;
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
            brillen += anzahl;
            exp += anzahl;
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

}
