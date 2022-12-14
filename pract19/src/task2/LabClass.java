package task2;

import java.util.Comparator;

public class LabClass implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Double.compare(a.getGPA(), b.getGPA());
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
    public void search(Student[] students, String fio) throws StudentNotFoundExeption {
        boolean b = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFio().equals(fio)) {
                System.out.println("Student was found");
                b = true;
                break;
            } else b = false;
        }
        if (!b)
            throw new StudentNotFoundExeption("Student wasn't found");
    }
}
