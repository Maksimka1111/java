package task2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day,month,year;
        System.out.print("Input day: ");
        day = scanner.nextInt();
        System.out.print("Input month (num): ");
        month = scanner.nextInt();
        System.out.print("Input year: ");
        year = scanner.nextInt();
        Date date = new Date();
        Calendar user_date_cal = new GregorianCalendar(year, month ,day);
        Date user_date = user_date_cal.getTime();
        if (date.after(user_date) || date.equals(user_date))
        {
            System.out.print("It was earlier");
        }
        else System.out.print("It was later");
    }
}
