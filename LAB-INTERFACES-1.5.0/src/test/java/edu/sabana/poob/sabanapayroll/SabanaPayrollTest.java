package edu.sabana.poob.sabanapayroll;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SabanaPayrollTest {

    private static Faker faker;

    private static List<Employee> employees;
    private static Department department;
    private static List<Department> departments;

    private static EmployeeBySalary employeeBySalary;
    private static EmployeeByHours employeeByHours;
    private static EmployeeByComission employeeByCommission;

    private static SabanaPayroll sabanaPayroll;

    @BeforeAll
    public static void setUp() {
        faker = new Faker(new Locale("en-US"));

        department = new Department("Engineering", UUID.randomUUID());

        employeeBySalary = new EmployeeBySalary(faker.name().firstName(), faker.name().lastName(), department, 1000000);
        employeeByHours = new EmployeeByHours(faker.name().firstName(), faker.name().lastName(), department, 40);
        employeeByCommission = new EmployeeByComission(faker.name().firstName(), faker.name().lastName(), department, 100);

        employees = new ArrayList<>();
        employees.add(employeeBySalary);
        employees.add(employeeByHours);
        employees.add(employeeByCommission);

        departments= new ArrayList<>();
        departments.add(department);

        sabanaPayroll = new SabanaPayroll(employees);

        sabanaPayroll.setDepartments(departments);

        department.setEmployees(employees);
    }

    @Test
    public void assigneColsubsidioFamilyCompensation() {

        boolean result = sabanaPayroll.assigneFamilyCompensation(ColsubsidioFund.class.getSimpleName(), employeeBySalary.getId());
        assertTrue(result);
    }

    @Test
    public void assigneCompensarFamilyCompensation() {

        boolean result = sabanaPayroll.assigneFamilyCompensation(CompensarFund.class.getSimpleName(), employeeBySalary.getId());
        assertTrue(result);
    }
}
