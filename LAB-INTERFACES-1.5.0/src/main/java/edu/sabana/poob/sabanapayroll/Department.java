package edu.sabana.poob.sabanapayroll;

import java.util.UUID;

public class Department {

    private UUID id;
    private String name;

    public Department(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
