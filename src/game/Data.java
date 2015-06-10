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
    private int getoeteteStreber;//getötete Streber. Steigt immer weiter, wird aber niemals abgezogen.
    private int aktLevel;
    
    private boolean[] skillsUnlocked; //Welche Skills schon freigeschaltet sind
    private int autoDamage; //Schaden den man macht, wenn man gerade nicht klickt
    private int[] waffenStufen; //Die Stufen jeder Waffe
    private int[] ausrüstungStufen; //Die Stufen jeder Ausrüstung
    
    private int aktWaffe;
    
    public Data(){
        brillen = 0;
        
        getoeteteStreber = 0;
        aktLevel = 0;
        
        skillsUnlocked = new boolean[ANZAHL_SKILLS];
        for(boolean b: skillsUnlocked){
            b = false;
        }
        
        autoDamage = START_AUTO_DAMAGE;
        
        waffenStufen = new int[ANZAHL_WAFFEN];
        for(int i: waffenStufen){
            i = 0;
        }
        waffenStufen[0] = 1;
        
        ausrüstungStufen = new int[ANZAHL_AUSRÜSTUNG];
        for(int i: ausrüstungStufen){
            i = 0;
        }
        
        aktWaffe = 1;
        
    }

    public int getBrillen() {
        return brillen;
    }

    public int getLebendeStreber() {
        return lebendeStreber;
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
    
    public boolean getSkillUnlocked(int i){
        return skillsUnlocked[i];
    }
    
    public int getWaffenStufe(int i){
        return waffenStufen[i];
    }
    
    public int getAusrüstungsStufe(int i){
        return ausrüstungStufen[i];
    }

    public int getAktWaffe() {
        return aktWaffe;
    }
    
    

    public void setBrillen(int brillen) {
        this.brillen = brillen;
    }

    public void setLebendeStreber(int lebendeStreber) {
        this.lebendeStreber = lebendeStreber;
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
    
    public void setSkillUnlocked(int i, boolean b){
        skillsUnlocked[i] = b;
    }
    
    public void setWaffenStufe(int i, int ws){
        waffenStufen[i] = ws;
    }
    
    public void setAusrüstungsStufe(int i, boolean as){
        skillsUnlocked[i] = as;
    }

    public void setAktWaffe(int aktWaffe) {
        this.aktWaffe = aktWaffe;
    }
    
    
  
}
