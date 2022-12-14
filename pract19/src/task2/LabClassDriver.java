package task2;

public class LabClassDriver {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        LabClassUI labClassUI = new LabClassUI();
        labClassUI.setArraySize(5);
        try {
            labClassUI.setArrayNull();
        } catch (EmptyStringException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            labClass.search(labClassUI.getStudents(), "fio1");
            labClass.search(labClassUI.getStudents(), "fio7");
        }catch (StudentNotFoundExeption e)
        {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println("Students array is null");
        }
        try {
            labClassUI.setArrayAuto();
        } catch (EmptyStringException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            labClass.search(labClassUI.getStudents(), "fio1");
            labClass.search(labClassUI.getStudents(), "QWE");
        }catch (StudentNotFoundExeption e)
        {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println("Students array is null");
        }
    }
}
