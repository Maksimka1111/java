package task1;

public class Student {
    private String first_name, second_name, speciality, group;
    private int course;
    private double GPA;

    public Student(String First_name, String Second_name, String Speciality, String Group, int Course, double gpa)
    {
        first_name = First_name;
        second_name = Second_name;
        speciality = Speciality;
        group = Group;
        course = Course;
        GPA = gpa;
    }
    public int getCourse() {
        return course;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getGroup() {
        return group;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public String toString()
    {
        return "First name: " +getFirst_name() + "; " + "Second name: " + getSecond_name() + "; " + "Group: " +getGroup() + "; "
                + "Speciality: " +getSpeciality() + "; " + "Course: " +getCourse() + "; " + "GPA: " + Double.toString(getGPA()).substring(0,3);
    }
}
