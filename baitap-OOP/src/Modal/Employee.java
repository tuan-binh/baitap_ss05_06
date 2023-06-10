package Modal;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gender;
    private int rate;
    private long salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, boolean gender, int rate, long salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[ ID: " + employeeId + " | Name: " + employeeName + " | Age: " + age + " | Gender: " + (gender ? "Nam":"Nũ") + " | Rate: " + rate + " ]";
    }
}
