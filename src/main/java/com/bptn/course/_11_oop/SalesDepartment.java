package com.bptn.course._11_oop;


	 class SalesDepartment extends Department {
	    // New private data member
	    private double totalSalesAmount; // Stores the total sales amount for the department
	    private double salesTarget;

	    // Constructor for SalesDepartment including the new TotalSalesAmount
	    public SalesDepartment(String departmentName, int numberOfEmployees, double salesTarget, double totalSalesAmount) {
	        // Call the constructor of the parent class (Department)
	        super(departmentName, numberOfEmployees);
	        this.salesTarget = salesTarget;
	        this.totalSalesAmount = totalSalesAmount; // Initialize the new data member
	    }

	    // Getter method for TotalSalesAmount
	    public double getTotalSalesAmount() {
	        return totalSalesAmount;
	    }

	    // Setter method for TotalSalesAmount
	    public void setTotalSalesAmount(double totalSalesAmount) {
	        this.totalSalesAmount = totalSalesAmount;
	    }

	    // Getter and Setter methods for sales target
	    public double getSalesTarget() {
	        return salesTarget;
	    }

	    public void setSalesTarget(double salesTarget) {
	        this.salesTarget = salesTarget;
	    }

	    // Override displayDepartmentInfo to include TotalSalesAmount
	    @Override
	    public void displayDepartmentInfo() {
	        // Call the parent class method to display basic department info
	        super.displayDepartmentInfo();
	        System.out.println("Sales Target: $" + salesTarget);
	        System.out.println("Total Sales Amount: $" + totalSalesAmount);
	    }
	}

