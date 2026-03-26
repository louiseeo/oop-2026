package com.louiseeo.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import com.louiseeo.model.Employee;
import com.louiseeo.model.EmployeeType;
import com.louiseeo.model.HourlyEmployee;
import com.louiseeo.model.SalariedEmployee;

/**
 * Manages the loading and saving of Employee records to a JSON file.
 * 
 * @author louiseeo
 */
public class FileHandler {
    private List<Employee> employee = new ArrayList<>();
    private Gson gson;
    private static final String FILE_PATH = "data/employees.json";

    public FileHandler() {
        // adapter
        RuntimeTypeAdapterFactory<Employee> adapter = RuntimeTypeAdapterFactory
                .of(Employee.class, "type", true)
                .registerSubtype(SalariedEmployee.class, EmployeeType.SALARIED.name())
                .registerSubtype(HourlyEmployee.class, EmployeeType.HOURLY.name());

        this.gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapterFactory(adapter).create();
        loadFile();
    }

    // load to file method
    public void loadFile() {
        try (FileReader fr = new FileReader(FILE_PATH)) {
            Type empType = new TypeToken<ArrayList<Employee>>() {
            }.getType();
            employee = gson.fromJson(fr, empType);
            if (employee == null) {
                employee = new ArrayList<>();
            }
        } catch (IOException e) {
            System.out.println("Cannot load JSON file. \nError: " + e.getMessage());
        }
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    // save to file method
    public void saveToFile() {
        try (FileWriter fw = new FileWriter(FILE_PATH)) {
            gson.toJson(employee, fw);
            System.out.println("Employee records saved successfully!\n");
        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }
}
