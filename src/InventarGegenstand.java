public class InventarGegenstand {
    private String name;

    public InventarGegenstand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGleicherGegenstand(InventarGegenstand gegenstand) {
        return this.name.equals(gegenstand.name);
    }
}
