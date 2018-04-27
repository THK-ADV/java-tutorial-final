import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String vorname, nachname;
    private LocalDate gebDatum;
    private Adresse adresse;

    public Person(String vorname, String nachname, LocalDate gebDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebDatum = gebDatum;
    }

    public Person(String vorname, String nachname, LocalDate gebDatum, Adresse adresse) {
        this(vorname, nachname, gebDatum);
        this.adresse = adresse;
    }

    // ----------- Setter und Getter ----------
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGebDatum() { return gebDatum; }

    public void setGebDatum(LocalDate gebDatum) { this.gebDatum = gebDatum; }


    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    // Eigene Methoden
    public String getVollenNamen(){
        return vorname + " " + nachname;
    }



}
