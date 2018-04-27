import com.sun.javafx.binding.StringFormatter;

public class Adresse {
    private String straße, ort, hausnummer;
    private long postleihzahl;

    public Adresse(String straße, String hausnummer, String ort, long postleihzahl) {
        this.straße = straße;
        this.ort = ort;
        this.postleihzahl = postleihzahl;
        this.hausnummer = hausnummer;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public long getPostleihzahl() {
        return postleihzahl;
    }

    public void setPostleihzahl(long postleihzahl) {
        this.postleihzahl = postleihzahl;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getDruckAdresse(){
        return straße + " " + hausnummer + ", " + postleihzahl + " " + ort;
    }
}
