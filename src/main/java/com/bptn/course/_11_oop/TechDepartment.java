package com.bptn.course._11_oop;

	class TechDepartment extends Department {
	    // New private data member for total purchase amount
	    private double totalPurchaseAmount;
	    private int numberOfProjects;

	    // Constructor for TechDepartment including the new totalPurchaseAmount
	    public TechDepartment(String departmentName, int numberOfEmployees, int numberOfProjects, double totalPurchaseAmount) {
	        // Call the constructor of the parent class (Department)
	        super(departmentName, numberOfEmployees);
	        this.numberOfProjects = numberOfProjects;
	        this.totalPurchaseAmount = totalPurchaseAmount; // Initialize the new data member
	    }

}
