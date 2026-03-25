package com.louiseeo.model;

public abstract class Employee {
    private String name;
    private String employeeId;
    protected EmployeeType type;

    public Employee(String name, String employeeId, EmployeeType type) {
        this.name = name;
        this.employeeId = employeeId;
        this.type = type;
    }

    public abstract double calculateEarnings();

    @Override
    public String toString() {
        return String.format("""
                Name: %s
                ID: %s
                Type: %s
                """, name, employeeId, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Employee)) {
            return false;
        }

        Employee other = (Employee) o;

        return this.employeeId.equals(other.employeeId);
    }
}

enum EmployeeType {
    SALARIED,
    HOURLY
}
