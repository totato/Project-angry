package game;

/**
 *
 * @author Toast
 */
public abstract class Item {
    
    private String name;
    private String beschreibung;
    private int kosten;

    public Item(String name, String beschreibung, int kosten) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.kosten = kosten;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getKosten() {
        return kosten;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setKosten(int kosten) {
        this.kosten = kosten;
    }
    
    
    
}
