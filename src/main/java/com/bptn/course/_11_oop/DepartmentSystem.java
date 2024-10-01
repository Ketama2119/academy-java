package com.bptn.course._11_oop;

public class DepartmentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Department hrDepartment = new Department("Human Resources", 20);
        Department techDepartment = new Department("Technology", 50);
        
        // Display department information for both departments
        System.out.println("HR Department Information:");
        hrDepartment.departmentInfo();
        
        System.out.println("Technology Department Information:");
        techDepartment.departmentInfo();
        // the 
    }

	}


