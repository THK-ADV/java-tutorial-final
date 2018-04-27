import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {


        Calendar susgeb = Calendar.getInstance();
        susgeb.set(1993, 11, 02);

        Person susi = new Person("Susi", "Sonnenschein", susgeb);



    }
}
