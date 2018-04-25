public class Adresse {
    private String straße, ort;
    private long postleihzahl;

    public Adresse(String straße, String ort, long postleihzahl) {
        this.straße = straße;
        this.ort = ort;
        this.postleihzahl = postleihzahl;
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
}
