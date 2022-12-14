package task4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day,month,year, hour, minutes;
        System.out.print("Input day: ");
        day = scanner.nextInt();
        System.out.print("Input month (num): ");
        month = scanner.nextInt()-1;
        System.out.print("Input year: ");
        year = scanner.nextInt();
        System.out.print("Input hour: ");
        hour = scanner.nextInt();
        System.out.print("Input minute: ");
        minutes = scanner.nextInt();
        Calendar calendar = new GregorianCalendar(year,month,day,hour,minutes);
        Date date = calendar.getTime();
        System.out.print("Object has been created; " + "\n" + date);
    }
}
