package task2;

public class Student {
    String fio;
    double GPA;

    public Student(String FIO, double gpa) {
        this.fio = FIO;
        this.GPA = gpa;
    }

    public String getFio() {
        return fio;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
