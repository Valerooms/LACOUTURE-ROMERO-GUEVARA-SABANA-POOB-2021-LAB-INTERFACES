package edu.sabana.poob.sabanapayroll;

import java.util.*;

public class SabanaPayroll {

    private Collection<Employee> employees;
    private Map<String, IFamilyCompensationFund> compensationFunds;

    public SabanaPayroll(Collection<Employee> employees) {
        this.employees = employees;
        this.compensationFunds = new HashMap<>();

        this.compensationFunds.put(ColsubsidioFund.class.getSimpleName(), new ColsubsidioFund());
    }

    public boolean assigneFamilyCompensation(String IFamilyCompensationFund, UUID employeeId) {
        return false;
    }
}
