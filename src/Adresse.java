public class Adresse {
    private String straße, ort;
    private int hausnr;
    private long postleitzahl;

    public Adresse(String straße, String ort, int hausnr, long postleitzahl) {
        this.straße = straße;
        this.ort = ort;
        this.hausnr = hausnr;
        this.postleitzahl = postleitzahl;
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

    public int getHausnr() { return hausnr; }

    public void setHausnr(int hausnr) { this.hausnr = hausnr; }

    public long getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(long postleitzahl) {
        this.postleitzahl = postleitzahl;
    }
}
