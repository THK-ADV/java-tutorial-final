public class Person {
    private String vorname, nachname;
    private int alter;
    private Double groesse;
    private Adresse adresse;

    public Person(String vorname, String nachname, int alter, Double groesse, Adresse adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.groesse = groesse;
        this.adresse = adresse;
    }

    public boolean istAelterAls(Person p) {
        return alter > p.alter;
    }

    public String getVollenNamen() {
        return vorname + " " + nachname;
    }

    public Double groessenunterschiedZu(Person p) {
        return Math.abs(groesse - p.groesse);
    }

    public boolean wohnenImGleichenOrt(Person p) {
        return adresse.istGleicherOrt(p.adresse);
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

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Double getGroesse() {
        return groesse;
    }

    public void setGroesse(Double groesse) {
        this.groesse = groesse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
