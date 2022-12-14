package task13;

import java.util.Scanner;
import java.util.Vector;

public class num13 {
    public static int func() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num!=0)
        {
            int num1 = s.nextInt();
            System.out.println(num);
            if (num1!=0)
                func();
            else return 0;
        }
        else return 0;
        func();
        return 0;
    };
    public static void main(String[] args) {
        func();
    }
}
