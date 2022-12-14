package task1;

import java.util.Date;

public class t1 {
    public static void main(String[] args) {
        System.out.println("Terentev" + "\n" +  "task received: 00:00:00 1 Sep");
        Date date = new Date();
        System.out.println("task complited: " + " " +  date.getHours() + ':' + date.getMinutes() + ':' + date.getSeconds() + ' ' + date.getDate() + ' ' + date.toString().substring(4,8));
    }
}
