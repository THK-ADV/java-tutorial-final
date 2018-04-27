import java.time.LocalDate;

public class Anwendung {
    public static void main(String[] args) {

        Adresse paulsAdresse = new Adresse("Ziegelstraße", "60", "Neuhaus", 91284);
        Person paul = new Person("Paul", "Panzer", LocalDate.of(1998, 12, 3), paulsAdresse);

        System.out.printf("Pauls Adresse: %s%n", paul.getAdresse().getDruckAdresse());

        Raum raum1 = new Raum("1.325", "Innovationsraum");
        InventarGegenstand beamer = new InventarGegenstand("Beamer");

        raum1.getInventar().add(beamer);
        System.out.println(raum1.getVolleRaumBezeichnung());

        if(raum1.beinhaltet(beamer)) {
            System.out.println("Der Innovationsraum beinhaltet einen Beamer!");
        } else {
            System.out.println("Der Innovationsraum beinhaltet keinen Beamer!");
        }

    }
}
