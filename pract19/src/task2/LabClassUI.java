package task2;

import java.util.Random;
import java.util.Scanner;

public class LabClassUI {
    Student[] students;
    public void setArrayNull() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);
        String fio;
        double gpa;
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            fio = "";
            if (fio.equals("") || fio == null)
            {
                throw new EmptyStringException("String is empty");
            }
            gpa = random.nextDouble(1, 5);
            Student student = new Student(fio, gpa);
            students[i] = student;
        }
    }
    public void setArrayAuto() throws EmptyStringException {
        String fio;
        double gpa;
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            fio = "fio1";
            if (fio.equals("") || fio == null)
            {
                throw new EmptyStringException("String is empty");
            }
            gpa = random.nextDouble(1, 5);
            Student student = new Student(fio, gpa);
            students[i] = student;
        }
    }
    public void setArraySize(int size)
    {
        students = new Student[size];
    }

    public Student[] getStudents() {
        return students;
    }
}
