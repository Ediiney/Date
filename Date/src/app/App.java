import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // ISO 8601 format

        System.out.println("--------------------------");
        System.out.println("Data 1: " + sdf2.format(y1));
        System.out.println("Data 2: " + sdf2.format(y2));
        System.out.println("Data 3: " + sdf2.format(y3));
        System.out.println("Data 4: " + sdf2.format(x1));
        System.out.println("Data 5: " + sdf2.format(x2));
        System.out.println("Data 6: " + sdf2.format(x3));
        System.out.println("Data 7: " + sdf2.format(x4));
        System.out.println("--------------------------");
        System.out.println("Data 1: " + sdf3.format(y1));
        System.out.println("Data 2: " + sdf3.format(y2));
        System.out.println("Data 3: " + sdf3.format(y3));
        System.out.println("Data 4: " + sdf3.format(x1));
        System.out.println("Data 5: " + sdf3.format(x2));
        System.out.println("Data 6: " + sdf3.format(x3));
        System.out.println("Data 7: " + sdf3.format(x4));
        System.out.println("--------------------------");
        System.out.println("Data 1: " + y1);
        System.out.println("Data 2: " + y2);
        System.out.println("Data 3: " + y3);
        System.out.println("Data 4: " + x1);
        System.out.println("Data 5: " + x2);
        System.out.println("Data 6: " + x3);
        System.out.println("Data 7: " + x4);
        System.out.println("--------------------------");
    }
}
