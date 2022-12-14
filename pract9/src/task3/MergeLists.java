package task3;

import task1.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
public class MergeLists implements Comparator<Student> {
    static List<Student> list1 = new ArrayList<>();
    static List<Student> list2 = new ArrayList<>();
    static int size;

    @Override
    public int compare(Student a, Student b) {
        return Double.compare(a.getGPA(), b.getGPA());
    }

    public static Student[] merge()
    {
        Student[] list = new Student[list1.size()+list2.size()];
        for(int i = 0; i<list1.size();i++)
            list[i] = list1.get(i);
        int k = list1.size();
        for(int i = 0;i<list2.size();i++)
            list[i+list1.size()] = list2.get(i);
        return list;
    }
    public static void setArray(int size, List list) {
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
            list.add(student);
        }
    }
    public static void outArray(Student[] list)
    {
        for(int i = 0; i< list.length;i++)
        {
            System.out.println(list[i].toString());
        }
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
    public static void main(String[] args) {

        setArray(3,list1);
        setArray(3,list2);
        Student[] mergeList = merge();
        MergeLists mergeLists = new MergeLists();
        mergeLists.mergeSort(mergeList,0, mergeList.length-1);
        System.out.println("Sorted: ");
        outArray(mergeList);
    }
}