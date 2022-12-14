package task1;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    static Student [] iDNumber;
    public void insertionSort(Student[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            Student swap = sortArr[i];
            for (j = i; j > 0 && swap.getGPA() < sortArr[j - 1].getGPA(); j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }
    public void setArray(int size) {
        String fn, sn, sp, gr;
        int num;
        double gpa;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            fn = "fname" + i;
            sn = "sname" + i;
            sp = "spec" + i;
            gr = "group" + i;
            num = random.nextInt(1, 6);
            gpa = random.nextDouble(1, 5);
            Student student = new Student(fn, sn, sp, gr, num, gpa);
            iDNumber[i] = student;
        }
    }
    public void outArray()
    {
        for(int i = 0; i< iDNumber.length;i++)
        {
            System.out.println(iDNumber[i].toString());
        }
    }
    public static void main(String[] args) {
        Tester tester = new Tester();
        Scanner s = new Scanner(System.in);
        System.out.print("Input count of students: ");
        int arraySize;
        arraySize = s.nextInt();
        iDNumber = new Student[arraySize];
        tester.setArray(arraySize);
        tester.outArray();
        tester.insertionSort(iDNumber);
        System.out.println("Sorted by course:");
        tester.outArray();
    }
}
