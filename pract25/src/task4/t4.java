package task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t4 {
    public static boolean check(String str)
    {
        Pattern pattern = Pattern.compile("\\(");
        Pattern pattern2 = Pattern.compile("\\)");
        Matcher matcher = pattern.matcher(str);
        Matcher matcher2 = pattern2.matcher(str);
        long k1 = matcher.results().count();
        long k2 = matcher2.results().count();
        if (k1==k2)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\(");
        Pattern pattern2 = Pattern.compile("\\)");
        String s = "((3*+*5))*–*9*×*4";
        String s2 = "((3*+*5))*–*9*×*4)";
        if (check(s))
            System.out.println("Good string");
        else System.out.println("Bad string");
        if (check(s2))
            System.out.println("Good string");
        else System.out.println("Bad string");
    }
}
