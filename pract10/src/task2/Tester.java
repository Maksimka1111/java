package task2;

import task1.Student;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Tester implements Comparator<Student> {
    static Student[] iDNumber;
    static int arraySize;
    int recur = 0;

    public int compare(Student a, Student b) {
        return Double.compare(a.getGPA(), b.getGPA());
    }

    public int compare_course(Student a, Student b) {
        return Integer.compare(a.getCourse(), b.getCourse());
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

    public void quickSort(Student[] arr, int leftBorder, int rightBorder) {
        recur++;
        if (recur>100)
            return;
        if (leftBorder >= rightBorder) return;
        Student pivot = arr[rightBorder - 1];
        int index = leftBorder;
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (compare(arr[i], pivot) < 0) {
                Student temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        Student temp = arr[index];
        arr[index] = arr[rightBorder - 1];
        arr[rightBorder - 1] = temp;
        quickSort(arr, leftBorder, index);
        quickSort(arr, index + 1, rightBorder);
    }

    public void quickSortByCourse(Student[] arr, int leftBorder, int rightBorder) {
        if (leftBorder >= rightBorder) return;
        Student pivot = arr[rightBorder - 1];
        int index = leftBorder;
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (compare_course(arr[i], pivot) < 0) {
                Student temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        Student temp = arr[index];
        arr[index] = arr[rightBorder - 1];
        arr[rightBorder - 1] = temp;
        quickSortByCourse(arr, leftBorder, index);
        quickSortByCourse(arr, index + 1, rightBorder);
    }

    public void mergeSort(Student[] arr, int start, int end) {
        if (end - start + 1 <= 1) return;
        mergeSort(arr, start, start + (end - start) / 2);
        mergeSort(arr, start + (end - start) / 2 + 1, end);
        int startIndex = start;
        int midIndex = start + (end - start) / 2 + 1;
        Student[] result = new Student[end - start + 1];
        for (int i = 0; i < result.length; i++) {
            if (startIndex < start + (end - start) / 2 + 1) {
                if (midIndex <= end) {
                    if (compare(arr[startIndex], arr[midIndex]) > 0) {
                        result[i] = arr[midIndex++];
                        continue;
                    }
                }
                result[i] = arr[startIndex++];
            } else {
                result[i] = arr[midIndex++];
            }
        }
        for (int i = 0; i < result.length; i++) {
            arr[start + i] = result[i];
        }
    }
    public void array_reverse()
    {
        Student[] temp = iDNumber.clone();
        iDNumber = new Student[arraySize];
        int k = 0;
        for(int i = arraySize-1; i>=0; i--)
        {
            iDNumber[k] = temp[i];
            k++;
        }
    }
    public void outArray()
    {
       for(int i = 0; i< arraySize;i++)
       {
           System.out.println(iDNumber[i].toString());
       }
    }
    public static void main(String[] args) {
        Tester tester = new Tester();
        Scanner s = new Scanner(System.in);
        System.out.print("Input count of students: ");
        arraySize = s.nextInt();
        iDNumber = new Student[arraySize];
        tester.setArray(arraySize);
        tester.outArray();
        System.out.println("Quick sort with GPA: ");
        tester.quickSort(iDNumber, 0, iDNumber.length-1);
        tester.array_reverse();
        tester.outArray();
        System.out.println("Merge sort with GPA: ");
        tester.mergeSort(iDNumber,0,iDNumber.length-1);
        tester.outArray();
        System.out.println("Quick sort with course: ");
        tester.quickSortByCourse(iDNumber,0,iDNumber.length-1);
        tester.outArray();
    }
}
