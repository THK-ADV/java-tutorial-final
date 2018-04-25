import java.util.ArrayList;

public class Gebäude {

    private String name;
    private Adresse adresse;
    private ArrayList<Raum> räume;

    public Gebäude(String name, Adresse adresse) {
        this(name, adresse, new ArrayList<>());
    }

    public Gebäude(String name, Adresse adresse, ArrayList<Raum> räume) {
        this.name = name;
        this.adresse = adresse;
        this.räume = räume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Raum> getRäume() {
        return räume;
    }

    public void setRäume(ArrayList<Raum> räume) {
        this.räume = räume;
    }
}
