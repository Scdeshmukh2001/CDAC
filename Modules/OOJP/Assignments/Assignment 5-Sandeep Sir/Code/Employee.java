package com.example.assignment5;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    // Static fields to keep track of total employees and total salary expense
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;

    // Instance fields for individual employee details
    private int id;
    private String name;
    private double salary;

    // Static initializer
    static {
        totalEmployees = 0;
        totalSalaryExpense = 0.0;
    }

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    // Getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        totalSalaryExpense -= this.salary;
        this.salary = salary;
        totalSalaryExpense += salary;
    }

    // Static method to get the total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Static method to apply a percentage raise to all employees
    public static void applyRaise(List<Employee> employees, double percentage) {
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() * (1 + percentage / 100);
            employee.setSalary(newSalary);
        }
    }

    // Static method to calculate the total salary expense
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // toString method to represent employee data
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 50000));
        employees.add(new Employee(2, "Bob", 60000));
        employees.add(new Employee(3, "Charlie", 70000));

        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());

        System.out.println("\nApplying a 10% raise to all employees...");
        Employee.applyRaise(employees, 10);

        System.out.println("Total Salary Expense after raise: " + Employee.calculateTotalSalaryExpense());

        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nUpdating salary of employee with ID 2 to 65000...");
        employees.get(1).setSalary(65000);

        System.out.println("Total Salary Expense after update: " + Employee.calculateTotalSalaryExpense());

        System.out.println("\nEmployee Details after update:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
