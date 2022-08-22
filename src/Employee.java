import java.util.Objects;

public class Employee {
    private int id;
    private String fullName;
    private int department;
    private double salary;
    private static int counter;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id=++counter;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }

    public static void takeEmployees() {
        for (Employee employee : Main.employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void takeFullNameEmployees() {
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                System.out.println(Main.employees[i].getFullName());
            }
        }
    }

    public static void fullSalary() {
        double salary=0;
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {
                salary=salary+Main.employees[i].getSalary();
            }
        }
        System.out.println(salary);
    }
    public static void minSalary() {
        double salary=Main.employees[0].getSalary();
// Сделал допущение , что [0] ячейка не равна null
        for (int i = 0; i < Main.employees.length&&Main.employees[i] != null; i++) {
                if (Main.employees[i].getSalary()<salary) {
                     salary=Main.employees[i].getSalary();
                }
        }
        System.out.println(salary);
    }

    public static void maxSalary() {
        double salary=Main.employees[0].getSalary();
// Сделал допущение , что [0] ячейка не равна null
        for (int i = 0; i < Main.employees.length&&Main.employees[i] != null; i++) {
            if (Main.employees[i].getSalary()>salary) {
                salary=Main.employees[i].getSalary();
            }
        }
        System.out.println(salary);
    }


    public static void mediumSalary() {
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null) {

            }
        }
    }


}
