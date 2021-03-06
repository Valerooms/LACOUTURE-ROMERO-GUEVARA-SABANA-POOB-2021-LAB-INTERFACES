package edu.sabana.poob.sabanapayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CompensarFund implements IFamilyCompensationFund{

    private static List<UUID> registeredEmployees = new ArrayList<>();

    public CompensarFund(){}

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
