import java.util.Calendar;

public class BJ16170 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(cal.YEAR));
        System.out.println(cal.get(cal.MONTH)+1);
        System.out.println(cal.get(cal.DATE));
    }
}