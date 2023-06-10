package Service;

import Modal.Employee;

public class EmployeeService {

    private Employee[] listEmployee = new Employee[100];

    private int size = 0;

    public Employee[] getAllEmployees() {
        return listEmployee;
    }

    public boolean createEmployee(Employee employee) {
        if(size == 100) {
            System.err.println("Đã đủ nhận viên");
            return false;
        }
        for (int i = 0; i < listEmployee.length; i++) {
            if(listEmployee[i] == null) {
                listEmployee[i] = employee;
                size++;
                break;
            }
        }
        return true;
    }

    public Employee findEmployeeById(int id) {
        for (Employee e:listEmployee) {
            if(e != null && e.getEmployeeId() == id) {
                return e;
            }
        }
        return null;
    }

    public void updateEmployee(Employee employee) {
        for (int i = 0; i < listEmployee.length; i++) {
            if(listEmployee[i].getEmployeeId() == employee.getEmployeeId()) {
                listEmployee[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < listEmployee.length; i++) {
            if(listEmployee[i].getEmployeeId() == id) {
                listEmployee[i] = null;
                size--;
                break;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
