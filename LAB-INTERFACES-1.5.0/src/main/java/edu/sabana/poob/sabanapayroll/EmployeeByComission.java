package edu.sabana.poob.sabanapayroll;

import java.util.UUID;

public class EmployeeByComission extends Employee {
    public static final double COMISSION = 2;
    private int productos;
    public EmployeeByComission(String name, String lastName, Department department, int productos) {
        super(name, lastName, department);
        this.productos=productos;
    }
    public EmployeeByComission(String name, String lastName, Department department, int productos, BankAccount account) {
        super(name, lastName, department,account);
        this.productos=productos;
    }
    @Override
    public double calculateSalary()
    {
        return this.productos*COMISSION;
    }

    @Override
    public String toString() {

        return String.format("%s %s, departamento %s, ", this.name, this.lastName, this.department.getName() )+String.format(" salario %s $, pago por comision", this.calculateSalary());
    }
}
