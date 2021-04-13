package edu.sabana.poob.sabanapayroll;

import java.util.*;

public class CafamFund implements IFamilyCompensationFund{

    private static Set<UUID> registeredEmployees = new HashSet<>();

    public CafamFund(){}

    @Override
    public boolean registerEmployee(Employee employee) {
        boolean amigo= false;
        if(!(registeredEmployees.contains(employee.id))&& !(employee.getClass().getSimpleName().equals("EmployeeByHours"))){
            amigo = true;
            registeredEmployees.add(employee.id);}

        return amigo;
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        boolean amigo = false;
        if(registeredEmployees.contains(id)){
            registeredEmployees.remove(id);
            amigo = true;
        }return amigo;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        boolean amigo = false;
        if(registeredEmployees.contains(id)){
            amigo = true;
        }return amigo;
    }

    @Override
    public String printBenefits() {
        return "No nos dan ni para comer :)";
    }
}
