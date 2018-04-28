public class Adresse {
    private String strasse, ort, postleitzahl;
    private int hausnummer;

    public Adresse(String strasse, int hausnummer, String postleitzahl, String ort) {
        this.strasse = strasse;
        this.ort = ort;
        this.postleitzahl = postleitzahl;
        this.hausnummer = hausnummer;
    }

    public boolean istGleicherOrt(Adresse adresse) {
        return ort.equals(adresse.ort) && postleitzahl.equals(adresse.postleitzahl);
    }

    public boolean istGleichesHaus(Adresse adresse) {
        return istGleicherOrt(adresse) && strasse.equals(adresse.strasse) && hausnummer == adresse.hausnummer;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }
}
