package task3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day,month,year;
        System.out.print("Input day: ");
        day = scanner.nextInt();
        System.out.print("Input month (num): ");
        month = scanner.nextInt()-1;
        System.out.print("Input year: ");
        year = scanner.nextInt();
        Student student = new Student(day,month,year);
        System.out.print(student.toString());
    }
}
