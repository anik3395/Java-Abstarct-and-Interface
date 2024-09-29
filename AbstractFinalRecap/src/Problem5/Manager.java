package Problem5;

public class Manager extends Employee{

    private double bonus;

    public Manager(double baseSalary, String name, double bonus) {
        super(baseSalary, name);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return  baseSalary + bonus;
    }

    @Override
    public void displayInfo() {

        System.out.println("Manager Name: " + name);

        System.out.println("Base Salary: $" + baseSalary);

        System.out.println("Bonus: $" + bonus);

        System.out.println("Total Salary: $" + calculateSalary());
    }
}
