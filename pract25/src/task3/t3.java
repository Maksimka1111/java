package task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t3 {
    private static boolean bool;
    private static final String IPADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String S1 = "223.123.123.123";
        String S2 = "asd,dfg";
        bool= validate(S1);
        if(bool) {
            System.out.println("String is IP");
        }
        else {
            System.out.println("String is not IP");
        }
        bool= validate(S2);
        if(bool) {
            System.out.println("String is IP");
        }
        else {
            System.out.println("String is not IP");
        }
    }
    public static boolean validate(String ip){
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}

