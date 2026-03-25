package com.louiseeo.service;

import java.util.ArrayList;
import com.louiseeo.model.Employee;
import com.louiseeo.model.HourlyEmployee;
import com.louiseeo.model.SalariedEmployee;

public class FileHandler {
    ArrayList<Employee> employee = new ArrayList<>();

    RuntimeTypeAdapterFactory<Employee> adapter = RuntimeTypeAdapterFactory
            .of(Employee.class, "type") // "type" is the field name in JSON
            .registerSubtype(SalariedEmployee.class, EmployeeType.SALARIED.name())
            .registerSubtype(HourlyEmployee.class, EmployeeType.HOURLY.name());

    Gson gson = new GsonBuilder().registerTypeAdapterFactory(adapter).create();
}
