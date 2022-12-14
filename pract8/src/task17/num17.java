package task17;

import java.util.Scanner;
import java.util.Vector;

public class num17 {
    public static int func() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num == 0)
            return 0;
        else return max(func(),num);
    }

    private static int max(int func, int num) {
        if (func>num)
            return func;
        return num;
    }

    ;
    public static void main(String[] args) {
        System.out.println(func());
    }
}
