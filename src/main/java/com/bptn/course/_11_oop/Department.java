package com.bptn.course._11_oop;

public class Department {
	private String departmentName;
    private int numberOfEmployees;

    // Constructor to initialize departmentName and numberOfEmployees
    public Department(String departmentName, int numberOfEmployees) {
        this.departmentName = departmentName;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Getter method for departmentName
    public String getDepartmentName() {
        return departmentName;
    }

    // Setter method for departmentName
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    // Getter method for numberOfEmployees
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    // Setter method for numberOfEmployees
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    // New method to print department info (name and number of employees)
    public void departmentInfo() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Number of Employees: " + numberOfEmployees);
    }

    // Method to display department details (this is optional, if you need more details)
    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Number of Employees: " + numberOfEmployees);
    }

		
	}

