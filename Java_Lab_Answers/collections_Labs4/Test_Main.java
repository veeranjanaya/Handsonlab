package collections_Labs4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Main {
	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(17873, "Meghna Tunga", 21, 150000));
        employees.add(new Employee(17875, "Swati Suman", 21, 160000));
        employees.add(new Employee(17882, "Subhasish", 21, 250000));
        employees.add(new Employee(17786, "Sanket Dixit", 23, 200000));
        employees.add(new Employee(17007, "Chandra", 19, 25000));

        // Sort employees by default (Employee ID)
        Collections.sort(employees);

        System.out.println("Employees sorted by ID:");
        displayEmployees(employees);

        // Sort employees by name and age if names are the same
        Collections.sort(employees, Employee.NameComparator);

        System.out.println("\nEmployees sorted by Name (with age tie-breaker):");
        displayEmployees(employees);

        // Sort employees by salary and name if salaries are the same
        Collections.sort(employees, Employee.SalaryComparator);

        System.out.println("\nEmployees sorted by Salary (with name tie-breaker):");
        displayEmployees(employees);
    }
	public static void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +
                    ", Age: " + employee.getAge() + ", Salary: " + employee.getSalary());
        }
	}

}
