import java.util.ArrayList;

public class Raum {
    private String nummer, name;
    private ArrayList<InventarGegenstand> inventar;

    public Raum(String nummer, String name) {
        this(nummer, name, new ArrayList<>());
    }

    public Raum(String nummer, String name, ArrayList<InventarGegenstand> inventar) {
        this.nummer = nummer;
        this.name = name;
        this.inventar = inventar;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<InventarGegenstand> getInventar() {
        return inventar;
    }

    public void setInventar(ArrayList<InventarGegenstand> inventar) {
        this.inventar = inventar;
    }
}
