import java.util.ArrayList;
import java.util.Scanner;

public class While {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Input size: ");
        n = scan.nextInt();
        int element;
        ArrayList <Integer> arr = new ArrayList<>(n);
        int i = 1;
        int sum = 0;
        while (i<=n)
        {
            System.out.print("Input "+i+" element: ");
            element = scan.nextInt();
            arr.add(element);
            sum+=element;
            i++;
        }
        System.out.println("Massive: " + arr);
        System.out.println("Sum: " + sum);
    }
}