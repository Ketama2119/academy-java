package com.bptn.course._11_oop;

public class BankAccount {
	
	    // Private instance variables (attributes)
	    private String accountNumber;
	    private double balance;

	    // Constructor to initialize the account number and balance
	    public BankAccount(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	    }

	    // Getter method for balance
	    public double getBalance() {
	        return balance;
	    }

	    // Method to display account information
	    public void displayAccountInfo() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: $" + getBalance());
	    }
	}


