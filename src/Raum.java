import java.util.ArrayList;

public class Raum {
    private String nummer, name;
    private ArrayList<InventarGegenstand> inventarGegenstände;

    public Raum(String nummer, String name) {
        this(nummer, name, new ArrayList<>());
    }

    public Raum(String nummer, String name, ArrayList<InventarGegenstand> inventarGegenstände) {
        this.nummer = nummer;
        this.name = name;
        this.inventarGegenstände = inventarGegenstände;
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

    public ArrayList<InventarGegenstand> getInventarGegenstände() {
        return inventarGegenstände;
    }

    public void setInventarGegenstände(ArrayList<InventarGegenstand> inventarGegenstände) {
        this.inventarGegenstände = inventarGegenstände;
    }
}
