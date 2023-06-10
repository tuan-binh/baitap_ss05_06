package Controller;

import Modal.Employee;
import Service.CircleService;
import Service.EmployeeService;
import Service.PhuongtrinhService;

public class Controller {

    private CircleService circleService = new CircleService();
    private EmployeeService employeeService = new EmployeeService();

    private PhuongtrinhService phuongtrinhService = new PhuongtrinhService();

    public double getAria(double radius) {
        return circleService.getAria(radius);
    }

    public double getPerimeter(double radius) {
        return circleService.getPerimeter(radius);
    }

    public Employee[] getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    public boolean createEmployee(Employee employee) {
        return employeeService.createEmployee(employee);
    }

    public Employee findEmployeeById(int id) {
        return employeeService.findEmployeeById(id);
    }

    public void updateEmployee(Employee employee) {
        employeeService.updateEmployee(employee);
    }

    public void deleteEmployee(int id) {
        employeeService.deleteEmployee(id);
    }

    public int getSize() {
        return employeeService.getSize();
    }

    public double getDelta(int a, int b, int c) {
        return phuongtrinhService.getDelta(a, b, c);
    }

    public double getR1(int a, int b, int c) {
        return phuongtrinhService.getR1(a, b, c);
    }

    public double getR2(int a, int b, int c) {
        return phuongtrinhService.getR2(a, b, c);
    }
}
