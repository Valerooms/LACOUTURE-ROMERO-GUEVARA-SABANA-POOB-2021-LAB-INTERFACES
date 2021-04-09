package edu.sabana.poob.sabanapayroll;

public class EmployeeByCommission extends Employee {

    private static final double COMMISSION = 80000;

    private int soldProducts;

    public EmployeeByCommission(String name, String lastName, Department department, int soldProducts) {
        super(name, lastName, department);
        this.soldProducts = soldProducts;
    }

    @Override
    public double calculateSalary() {
        return this.soldProducts * EmployeeByCommission.COMMISSION;
    }

    @Override
    public String toString() {
        return super.toString() + " payment by commission.";
    }

}

