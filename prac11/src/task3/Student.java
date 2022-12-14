package task3;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    Calendar calendar;
    int Day,Month,Year;
    Date date;
    public Student(int day,int month, int year)
    {
        Day = day;
        Month = month;
        Year = year;
        calendar = new GregorianCalendar(year,month,day);
        date = calendar.getTime();
    }
    public String toString()
    {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat(" 'Day' dd 'Month' MM 'Year' yyyy");
        return ("Short: " + format1.format(date) + "\n" + "Medium:" + format2.format(date) + "\n" + "Full: " +date);
    }
}
