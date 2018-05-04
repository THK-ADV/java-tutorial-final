import java.time.LocalDate;

public class Anwendung {
    public static void main(String[] args) {

        Adresse a1 = new Adresse("Martin-Straße", 5, "51645", "Gummersbach");
        Adresse a2 = new Adresse("Taubenweg", 2, "51643", "Gummersbach");

        Person paul = new Person("Paul", "Peters", 26, 1.80, a2);
        Person rainer = new Person("Rainer", "Zufall", 21, 1.65, a1);
        Person regina = new Person("Regina", "Rosig", 18, 1.74, a1);

        System.out.println(rainer.istAelterAls(paul));
        System.out.println(rainer.istAelterAls(regina));
        System.out.println(rainer.groessenunterschiedZu(paul));

    }
}
