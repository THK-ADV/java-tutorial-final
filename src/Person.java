import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String vorname, nachname;
    private LocalDate geburtsDatum;
    private Adresse adresse;

    public Person(String vorname, String nachname, LocalDate geburtsDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }

    public Person(String vorname, String nachname, LocalDate geburtsDatum, Adresse adresse) {
        this(vorname, nachname, geburtsDatum);
        this.adresse = adresse;
    }

    public String getVollenNamen() {
        return vorname + " " + nachname;
    }

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

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getAlter() {
        return Period.between(geburtsDatum, LocalDate.now()).getYears();
    }
}
