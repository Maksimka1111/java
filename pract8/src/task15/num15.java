package task15;

import java.util.Scanner;

public class num15 {
    public static int func(int N)
    {
        if (N==0)
            return 0;
        System.out.print(N%10);
        System.out.print(' ');
        func(N/10);
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        N = func(N);
    }
}
