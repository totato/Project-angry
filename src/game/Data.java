package game;

/**
 *
 * @author nicht tseidelm
 */
public class Data {
    
    private static final int ANZAHL_SKILLS = 35;
    private static final int ANZAHL_WAFFEN = 6;
    private static final int ANZAHL_AUSRÜSTUNG = 3;
    

    private int brillen;//Eine Brille entspricht einem toten Streber entsrpicht einem Kill
    private int lebendeStreber;//Noch lebende Streber, wenn da 0 erreicht nächstes level!
    private int getoeteteStreber;//getötete Streber. Steigt immer weiter, wird aber niemals abgezogen.
    private int aktLevel;
    
    private boolean[] skillsUnlocked; //Welche Skills schon freigeschaltet sind
    private int autoDamage; //Schaden den man macht, wenn man gerade nicht klickt
    private int[] waffenStufen; //Die Stufen jeder Waffe
    private int[] ausrüstungStufen; //Die Stufen jeder Ausrüstung
    
    public Data(){
        brillen = 0;
        
        getoeteteStreber = 0;
        aktLevel = 0;
        
        skillsUnlocked = new boolean[ANZAHL_SKILLS];
        for(boolean b: skillsUnlocked){
            b = false;
        }
        
        autoDamage = 0;
        
        waffenStufen = new int[ANZAHL_WAFFEN];
        for(int i: waffenStufen){
            i = 0;
        }
        waffenStufen[0] = 1;
        
        ausrüstungStufen = new int[ANZAHL_AUSRÜSTUNG];
        for(int i: ausrüstungStufen){
            i = 0;
        }
        
    }
}
