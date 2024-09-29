package Problem5;

public class Main {
    public static void main(String[] args) {
        Employee employee;
        employee = new Manager(5000,"Milon",2000);
        employee.calculateSalary();
        employee.displayInfo();

        Programmer programmer;
        programmer=new Programmer(10000,"Anik",3000,5);
        programmer.calculateSalary();
        programmer.displayInfo();

    }
}
