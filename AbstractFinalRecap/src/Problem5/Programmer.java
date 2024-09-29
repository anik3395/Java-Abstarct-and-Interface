package Problem5;

public class Programmer extends Employee{

    private int overtimeHours;
    private double hourlyRate;

    public Programmer(double baseSalary, String name, double hourlyRate, int overtimeHours) {
        super(baseSalary, name);
        this.hourlyRate = hourlyRate;
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * hourlyRate);
    }

    @Override
    public void displayInfo() {

        System.out.println("Programmer Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}
