package edu.sabana.poob.sabanapayroll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

public class SabanaNominaTest
{
    public static SabanaPayroll s1= new SabanaPayroll();
    public static Department d1= new Department("Ingenieria",UUID.randomUUID());
    public static Department d2= new Department("Medicina",UUID.randomUUID());
    public static Department d3= new Department("Psicologia",UUID.randomUUID());
    public static EmployeeByComission ec1=new EmployeeByComission("Juan","Valderrama",d1,1);;
    public static EmployeeByHours eh1 = new EmployeeByHours("Mia","Lacouture",d2,5);
    public static EmployeeBySalary es1= new EmployeeBySalary("Vale","Romero",d3,1);
    public  List<Department> departments = new ArrayList<>();
    public  List<Employee> employees = new ArrayList<>();

    @Test
    @DisplayName("GIVEN the ID of an employee by salary WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalaryBySalary()
    {
        assertTrue(Double.compare(0.92,es1.calculateSalary()) ==0);
    }
    @Test
    @DisplayName("GIVEN the ID of an employee by hours WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalaryByHours()
    {
        assertTrue(Double.compare(15,eh1.calculateSalary()) ==0);
    }
    @Test
    @DisplayName("GIVEN the ID of an employee by comission WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalaryByComission()

    {
        assertEquals(0, Double.compare(2, ec1.calculateSalary()));
    }
    @Test
    @DisplayName("GIVEN the ID of an employee WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalary()
    {
        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);

        List<Employee> employees = new ArrayList<>();
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        assertTrue(Double.compare(2,s1.calculateEmployeeSalary(ec1.getId())) ==0);
        assertTrue(Double.compare(15,s1.calculateEmployeeSalary(eh1.getId())) ==0);
        assertTrue(Double.compare(0.92,s1.calculateEmployeeSalary(es1.getId())) ==0);
    }

    @Test
    @DisplayName("GIVEN the ID of a department WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateDepartmentSalary()
    {
        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);

        assertTrue(Double.compare(2,s1.calculateDeparmentSalaries(d1.getId())) ==0);
        assertTrue(Double.compare(15,s1.calculateDeparmentSalaries(d2.getId())) ==0);
        assertTrue(Double.compare(0.92,s1.calculateDeparmentSalaries(d3.getId())) ==0);

    }
    @Test
    @DisplayName("GIVEN a university WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateUniversitytSalary()
    {

        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);
        assertTrue(Double.compare(17.92,s1.calculateUniversitySalaries()) ==0);

    }
    @Test
    @DisplayName("GIVEN the payrolls of each employee WHEN trying to print it THEN print it")
    public void shouldPrintPayroll() {
        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);
        s1.printPayroll();
    }
    @Test
    public void shouldCalculateEmployeeBalance()
    {
        SabanaPayroll sa1 = new SabanaPayroll();
        BankAccount b1;
        Checking c1 = new Checking();
        Savings s1 = new Savings();
        Department d1 = new Department("Surtifruver",UUID.randomUUID());
        EmployeeBySalary e1 = new EmployeeBySalary("AAAAAAAAAAAGUACATE","PA HOY",d1,10,c1=new Checking());
        EmployeeByHours e2 = new EmployeeByHours("PIÑA","MIA",d1,10,s1);
        departments.add(d1);
        employees.add(e1);
        employees.add(e2);
        d1.setEmployees(employees);
        sa1.setDepartments(departments);

        c1.deposit(10000);
        Assertions.assertEquals(5000,sa1.calculateEmployeeBalance(e1.getId()));

        s1.deposit(10000);
        Assertions.assertEquals(8000,sa1.calculateEmployeeBalance(e2.getId()));
    }
    @Test
    public void shouldDepositToEmployee()
    {
        SabanaPayroll sa1 = new SabanaPayroll();
        BankAccount b1;
        Checking c1 = new Checking();
        Savings s1 = new Savings();
        Department d1 = new Department("Surtifruver",UUID.randomUUID());
        EmployeeBySalary e1 = new EmployeeBySalary("AAAAAAAAAAAGUACATE","PA HOY",d1,10,c1=new Checking());
        EmployeeByHours e2 = new EmployeeByHours("PIÑA","MIA",d1,10,s1);
        departments.add(d1);
        employees.add(e1);
        employees.add(e2);
        d1.setEmployees(employees);
        sa1.setDepartments(departments);

        assertTrue(sa1.depositToEmployee(e1.getId(),6000));
        assertTrue(sa1.depositToEmployee(e2.getId(),3000));
    }
    @Test
    public void shouldNotDepositToEmployee()
    {
        SabanaPayroll sa1 = new SabanaPayroll();
        BankAccount b1;
        Checking c1 = new Checking();
        Savings s1 = new Savings();
        Department d1 = new Department("Surtifruver",UUID.randomUUID());
        EmployeeBySalary e1 = new EmployeeBySalary("AAAAAAAAAAAGUACATE","PA HOY",d1,10,c1=new Checking());
        EmployeeByHours e2 = new EmployeeByHours("PIÑA","MIA",d1,10,s1);
        departments.add(d1);
        employees.add(e1);
        employees.add(e2);
        d1.setEmployees(employees);
        sa1.setDepartments(departments);

        assertFalse(sa1.depositToEmployee(e1.getId(),5000));
        assertFalse(sa1.depositToEmployee(e2.getId(),2000));
    }
    @Test
    public void shouldCalculateAllEmployeesBalance()
    {
        SabanaPayroll sa1 = new SabanaPayroll();
        BankAccount b1;
        Checking c1 = new Checking();
        Savings s1 = new Savings();
        Department d1 = new Department("Surtifruver",UUID.randomUUID());
        EmployeeBySalary e1 = new EmployeeBySalary("AAAAAAAAAAAGUACATE","PA HOY",d1,10,c1=new Checking());
        EmployeeByHours e2 = new EmployeeByHours("PIÑA","MIA",d1,10,s1);
        departments.add(d1);
        employees.add(e1);
        employees.add(e2);
        d1.setEmployees(employees);
        sa1.setDepartments(departments);
        c1.deposit(10000);
        s1.deposit(10000);

        Assertions.assertEquals(13000,sa1.calculateAllEmployeeBalance());
    }
    @Test
    public void shouldAssigneFamilyCompensaiton()
    {
        SabanaPayroll sa1 = new SabanaPayroll();
        BankAccount b1;
        Checking c1 = new Checking();
        Savings s1 = new Savings();
        Department d1 = new Department("Surtifruver",UUID.randomUUID());
        EmployeeBySalary e1 = new EmployeeBySalary("AAAAAAAAAAAGUACATE","PA HOY",d1,10,c1=new Checking());
        EmployeeByHours e2 = new EmployeeByHours("PIÑA","MIA",d1,10,s1);
        EmployeeByHours e3 = new EmployeeByHours("MIA","KHALIFA",d1,10,s1);
        departments.add(d1);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        d1.setEmployees(employees);
        sa1.setDepartments(departments);
        c1.deposit(10000);
        s1.deposit(10000);
        assertTrue(sa1.assigneFamilyCompensation("Colsubsidio",e1.getId()));
        assertTrue(sa1.assigneFamilyCompensation("Compensar",e2.getId()));
        assertTrue(sa1.assigneFamilyCompensation("Cafam",e3.getId()));

    }








}
