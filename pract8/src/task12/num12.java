package task12;

import java.util.Scanner;
import java.util.Vector;

public class num12 {
    public static int func() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num == 0)
            return 0;
        if (num%2==1)
        {
            System.out.println(num);
        }
        func();
        return 0;
    }

    ;
    public static void main(String[] args) {
      func();
    }
}
