package task2;

public class EmployeeController {
    private Employee employee;
    private  EmployeeView employeeView;
    public EmployeeController(Employee Employee, EmployeeView EmployeeView)
    {
        this.employee = Employee;
        this.employeeView = EmployeeView;
    }

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeView getEmployeeView() {
        return employeeView;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setEmployeeView(EmployeeView employeeView) {
        this.employeeView = employeeView;
    }
    public void updateView()
    {
        employeeView.printInfo(employee.getName(), employee.getPost(), employee.getSalary());
    }
    public void updateViewByGUI()
    {
        employeeView.printInfoByGUI(employee.getName(), employee.getPost(), employee.getSalary());
    }
}
