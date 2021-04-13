package edu.sabana.poob.sabanapayroll;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class CompensarFundTest {

    private static Faker faker;

    private static List<Employee> employees;
    private static Department department;

    private static EmployeeBySalary employeeBySalary;
    private static EmployeeByHours employeeByHours;
    private static EmployeeByComission employeeByCommission;
    private static EmployeeByComission employeeByComission1;

    private static IFamilyCompensationFund compensarFund;

    @BeforeAll
    public static void setUp() {
        faker = new Faker(new Locale("en-US"));

        department = new Department("Engineering", UUID.randomUUID());

        employeeBySalary = new EmployeeBySalary(faker.name().firstName(), faker.name().lastName(), department, 1000000);
        employeeByHours = new EmployeeByHours(faker.name().firstName(), faker.name().lastName(), department, 40);
        employeeByCommission = new EmployeeByComission(faker.name().firstName(), faker.name().lastName(), department, 100);
        employeeByComission1 = new EmployeeByComission(faker.name().firstName(), faker.name().lastName(), department, 10);
        employees = new ArrayList<>();
        employees.add(employeeBySalary);
        employees.add(employeeByHours);
        employees.add(employeeByCommission);
        employees.add(employeeByComission1);

        compensarFund = new CompensarFund();
    }

    @Test
    @DisplayName("GIVEN a employee by salary WHEN try to register THEN success")
    public void shouldRegisterEmployee() {

        assertTrue(compensarFund.registerEmployee(employeeBySalary));
    }

    @Test
    @DisplayName("GIVEN a employee by commission WHEN try to register THEN fails")
    public void shouldNotRegisterEmployeeWhenByHours() {

        assertFalse(compensarFund.registerEmployee(employeeByHours));
    }

    @Test
    @DisplayName("GIVEN a employee by salary registered WHEN try to register again THEN fails")
    public void shouldNotRegisterEmployeeWhenDuplicated() {

        assertTrue(compensarFund.registerEmployee(employeeByCommission));
        assertFalse(compensarFund.registerEmployee(employeeByCommission));
    }

    @Test
    @DisplayName("GIVEN a employee by salary registered WHEN try to delete THEN success")
    public void shouldDeleteEmployee() {

        assertTrue(compensarFund.registerEmployee(employeeBySalary));
        assertTrue(compensarFund.deleteEmployee(employeeBySalary.getId()));
    }

    @Test
    @DisplayName("GIVEN a employee by salary not registered WHEN try to delete THEN fails")
    public void shouldNotDeleteEmployee() {

        assertFalse(compensarFund.deleteEmployee(employeeByCommission.getId()));
    }

    @Test
    @DisplayName("GIVEN a employee by salary registered WHEN try to validate is registered THEN success")
    public void shouldValidateEmployeeIsRegistered() {

        assertTrue(compensarFund.registerEmployee(employeeByComission1));
        assertTrue(compensarFund.isEmployeeRegistered(employeeByComission1.getId()));
    }

    @Test
    @DisplayName("GIVEN a employee by salary not registered WHEN try to validate is registered THEN fails")
    public void shouldNotValidateEmployeeIsRegistered() {

        assertFalse(compensarFund.isEmployeeRegistered(employeeBySalary.getId()));
    }

    @Test
    public void shouldPrintBenefits() {

        String benefits = compensarFund.printBenefits();
        assertNotNull(benefits);
    }

}
