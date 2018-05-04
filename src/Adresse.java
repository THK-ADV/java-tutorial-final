public class Adresse {
    private String strasse, ort, postleitzahl;
    private int hausnummer;

    public Adresse(String strasse, int hausnummer, String postleitzahl, String ort) {
        this.strasse = strasse;
        this.ort = ort;
        this.postleitzahl = postleitzahl;
        this.hausnummer = hausnummer;
    }

    public static boolean istGleicherOrt(Adresse adresse1, Adresse adresse2) {
        return adresse1.ort.equals(adresse2.ort) && adresse1.postleitzahl.equals(adresse2.postleitzahl);
    }

    public String getBriefkopf() {
        return strasse + " " + hausnummer + ", " + postleitzahl + " " + ort;
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
