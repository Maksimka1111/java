package task6;

import java.util.Scanner;

public class test_array {
    public static void main(String[] args) {
        int n = 0;
        String name, author;
        System.out.print("Input size of array: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        Printable[] printables = new Printable[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input name of book: ");
            name = s.next();
            System.out.print("Input author name: ");
            author = s.next();
            Book book1 = new Book(name, author);
            printables[i] = book1;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print("Book " + (i+1) + ": ");
            printables[i].print();
        }
    }
}
