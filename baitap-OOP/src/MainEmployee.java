import Config.ConfigScanner;
import Controller.Controller;
import Modal.Employee;
import Service.EmployeeService;

public class MainEmployee {
    static Controller controller = new Controller();

    public static void main(String[] args) {
        int choose;
        while (true) {
            System.out.println(">>==================<< MENU >>==================<<");
            System.out.println("1. In toàn bộ nhân viên");
            System.out.println("2. Thêm thông tin nhân viên");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. Xóa thông tin nhân viên");
            System.out.println("5. In thông tin nhân viên ngẫu nhiên");
            System.out.println("6. Tính lương nhân viên");
            System.out.println("7. Thoát");
            System.out.println(">>==============================================<<");
            System.out.print("Mời bạn lựa chọn: ");
            choose = ConfigScanner.scanner().nextInt();
            switch (choose) {
                case 1:
//                    Hiển thị toàn bô nhân viên
                    showAllEmployyee();
                    break;
                case 2:
//                    Thêm thông tin nhân viên
                    addNewEmployee();
                    break;
                case 3:
//                    Sửa thông tin nhân viên
                    updateEmployee();
                    break;
                case 4:
//                    Xóa thông tin nhân viên
                    deleteEmployee();
                    break;
                case 5:
//                    In thông tin nhân viên ngẫu nhiên
                    showRandomEmplyee();
                    break;
                case 6:
//                    Tính lương nhân viên theo ID
                    showTotalSalary();
                    break;
                case 7:
                    System.out.println(" ~~ Cảm ơn bạn đã dùng chương trình");
                    System.exit(0);
                    break;
                default:
                    System.err.println(" ~~ Mời bạn chọn lại 1 -> 7 Cảm ơn ~~ ");
            }
        }
    }

    //    Phương thức làm việc

//    1. show all employees
    public static void showAllEmployyee() {
        if (controller.getSize() == 0) {
            System.err.println("Không có nhân viên trong danh sách");
            return;
        }
        Employee[] list = controller.getAllEmployees();
        for (Employee e : list) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

//    add new employee to list employees
    public static void addNewEmployee() {
        Employee newEmployee = new Employee();
        newEmployee.setEmployeeId(getNewId());
        System.out.print("Nhập tên: ");
        newEmployee.setEmployeeName(ConfigScanner.scanner().nextLine());
        System.out.print("Nhập vào tuổi: ");
        newEmployee.setAge(ConfigScanner.scanner().nextInt());
        System.out.print("Nhập vào giới tính: ");
        newEmployee.setGender(ConfigScanner.scanner().nextBoolean());
        System.out.print("Nhập vào rate: ");
        newEmployee.setRate(ConfigScanner.scanner().nextInt());
        boolean check = controller.createEmployee(newEmployee);
        if (check) {
            System.out.println(" ~~ Thêm thành công ~~ ");
        }
    }

//    show random employee
    public static void showRandomEmplyee() {
        int size = controller.getSize();
        int idRandom = (int) Math.ceil(Math.random() * size);
        Employee employee = controller.findEmployeeById(idRandom);
        System.out.println("Nhân viên: " + employee);
    }

//    show salary employee
    public static void showTotalSalary() {
        System.out.print("Bạn muốn tính lương nhân viên id nào: ");
        int id = ConfigScanner.scanner().nextInt();
        Employee employee = controller.findEmployeeById(id);
        if(employee == null) {
            System.err.println("Không có nhân viên bạn muốn tìm :((");
            return;
        }
        employee.setSalary(employee.getRate() * 1300000);
        System.out.println("Lương nhân viên là: " + employee.getSalary());
    }

//    update employee
    public static void updateEmployee() {
        System.out.print("Nhập vào id nhân viên bạn muốn sửa: ");
        int id = ConfigScanner.scanner().nextInt();
        Employee employee = controller.findEmployeeById(id);
        if(employee == null) {
            System.err.println("Không có nhân viên bạn muốn sửa :((");
            return;
        }
//        sửa thông tin nhân viên
        System.out.println("Sửa tên: ");
        boolean checkName =  checkUpdateItem();
        if(checkName) {
            System.out.print("Mời bạn nhập tên: ");
            employee.setEmployeeName(ConfigScanner.scanner().nextLine());
        }
        System.out.println("Sửa tuổi: ");
        boolean checkAge =  checkUpdateItem();
        if(checkAge) {
            System.out.print("Mời bạn nhập tuổi: ");
            employee.setAge(ConfigScanner.scanner().nextInt());
        }
        System.out.println("Sửa Gender: ");
        boolean checkGender = checkUpdateItem();
        if(checkGender) {
            System.out.print("Mời bạn nhập giới tính: ");
            employee.setGender(ConfigScanner.scanner().nextBoolean());
        }
        System.out.println("Sửa Rate: ");
        boolean checkRate = checkUpdateItem();
        if(checkRate) {
            System.out.print("Mời bạn nhập rate: ");
            employee.setRate(ConfigScanner.scanner().nextInt());
        }
        controller.updateEmployee(employee);
    }

    public static boolean checkUpdateItem() {
        System.out.print("YES OR NO : ");
        String choose = ConfigScanner.scanner().next();
        if(choose.equalsIgnoreCase("YES")) {
            return true;
        } else {
            return false;
        }
    }

//    delete emplyee by id
    public static void deleteEmployee() {
        System.out.print("Nhập vào id nhân viên bạn muốn xóa: ");
        int id = ConfigScanner.scanner().nextInt();
        Employee employee = controller.findEmployeeById(id);
        if(employee == null) {
            System.err.println("Không có nhân viên bạn muốn xóa :((");
            return;
        }
        controller.deleteEmployee(id);
    }
//    get new id for add new employee
    public static int getNewId() {
        Employee[] list = controller.getAllEmployees();
        int idMax = 0;
        for (Employee e : list) {
            if (e != null && idMax < e.getEmployeeId()) {
                idMax = e.getEmployeeId();
            }
        }
        return idMax + 1;
    }
}
