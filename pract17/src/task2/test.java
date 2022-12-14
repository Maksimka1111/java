package task2;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeView employeeView = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, employeeView);
        employee.setName("Pasha");
        employee.setPost("Programmer");
        employee.setSalary("1000$");
        //controller.updateView();
        controller.updateViewByGUI();
    }
}
