public class Main {
    static  Employee [] employees= new Employee[10];


    public static void main(String[] args) {
        employees[1]=new Employee("Василий Васильевич Корнев",2,20350);
        employees[3]=new Employee("Сергей Сергевич Безруков",4,30555);
        employees[5]=new Employee("Андрей Андреевич Сусликов",5,25500);
        employees[6]=new Employee("Александр Александрович", 3, 23330);
        employees[9]=new Employee("Виктория Викторовна КОшкина",1,24000);

        Employee.takeEmployees();
        Employee.takeFullNameEmployees();
        Employee.fullSalary();
        Employee.minSalary();
    }



}