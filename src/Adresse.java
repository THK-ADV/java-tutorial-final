public class Adresse {
    private String straße, ort, hausnummer;
    private long postleitzahl;

    public Adresse(String straße, String hausnummer, String ort, long postleitzahl) {
        this.straße = straße;
        this.ort = ort;
        this.postleitzahl = postleitzahl;
        this.hausnummer = hausnummer;
    }

    public String getStraße() { return straße; }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public long getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(long postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getDruckAdresse(){
        return straße + " " + hausnummer + ", " + postleitzahl + " " + ort;
    }
}
