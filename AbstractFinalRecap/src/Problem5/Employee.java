package Problem5;

public abstract class Employee {

    String name;
    double baseSalary;

    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public abstract double calculateSalary();

    public abstract void displayInfo();
}
