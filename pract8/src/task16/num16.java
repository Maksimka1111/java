package task16;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class num16 {
    public static int func(int max, int count)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num!=0) {
            if (num > max)
                func(num, 1);
            else
                func(num, count + 1);
        }
        else System.out.println(count);
        return 0;
    }
    public static void main(String[] args) {
        func(0,1);
    }
}
