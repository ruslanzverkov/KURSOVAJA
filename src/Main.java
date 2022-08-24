public class Main {
    static  Employee [] employees= new Employee[10];



    public static void main(String[] args) {
        employees[0] = new Employee("Василий Васильевич Корнев", 2, 29350);
        employees[3] = new Employee("Сергей Сергевич Безруков", 4, 30555);
        employees[5] = new Employee("Андрей Андреевич Сусликов", 5, 25500);
        employees[6] = new Employee("Александр Александрович", 3, 23330);
        employees[9] = new Employee("Виктория Викторовна КОшкина", 1, 24000);
        takeEmployees();
        takeFullNameEmployees();
        fullSalary();
        minSalary();
        maxSalary();
        mediumSalary();

    }

    public static void takeEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void takeFullNameEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public static void fullSalary() {
        double salary=0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                salary=salary+employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц - "+salary);
    }
    public static void minSalary() {
        double salary=employees[0].getSalary();
        //Сделал допущение , что [0] ячейка не равна null
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary()<salary) {
                    salary=employees[i].getSalary();
                }
            }

        }
        System.out.println("Минимальная зарплата сотрудника - "+salary);
    }

    public static void maxSalary() {
        double salary=employees[0].getSalary();
// Сделал допущение , что [0] ячейка не равна null
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary()>salary) {
                    salary=employees[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата сотрудника - "+salary);
    }


    public static void mediumSalary() {
        double salary=0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                salary=salary+employees[i].getSalary();
            }
        }
        salary=salary/employees.length; //с логической точки зрения это не являеться ср.зп., т.к. у нас 5 сотрудников, а не 10
        // как сделать по другому не знаю
        // проверку на ноль нет смысла делать(как в разборе), потомучто при  emloyees.length==0, массив будет пустой ссоответсвенно и ср .зп.
        //будет 0
        System.out.println("Средняя зарплата сотрудников - "+salary);
    }

}