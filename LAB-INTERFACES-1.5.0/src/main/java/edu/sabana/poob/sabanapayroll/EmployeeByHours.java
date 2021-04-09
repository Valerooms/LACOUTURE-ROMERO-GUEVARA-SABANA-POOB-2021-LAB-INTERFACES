package edu.sabana.poob.sabanapayroll;

public class EmployeeByHours extends Employee {

    private static final double SALARY_BY_HOUR = 60000;

    private int workingHours;

    public EmployeeByHours(String name, String lastName, Department department, int workingHours) {
        super(name, lastName, department);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return this.workingHours * EmployeeByHours.SALARY_BY_HOUR;
    }

    @Override
    public String toString() {
        return super.toString() + " payment by hours.";
    }
}
