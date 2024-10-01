package com.bptn.course._11_oop;

//
	// ChequingAccount.java
 class ChequingAccount extends BankAccount {
	    private double transactionFee; // Fee charged for each transaction

	    // Constructor for ChequingAccount
	    public ChequingAccount(String accountNumber, double initialBalance, double transactionFee) {
	        super(accountNumber, initialBalance); // Call the constructor of BankAccount
	        this.transactionFee = transactionFee;
	    }

	    // Override the withdraw method to include the transaction fee
	    @Override
	    public void withdraw(double amount) {
	        double totalAmount = amount + transactionFee; // Include the transaction fee
	        if (totalAmount > 0 && totalAmount <= getBalance()) {
	            super.withdraw(totalAmount); // Call the withdraw method of BankAccount
	            System.out.println("Withdrawal of $" + amount + " with a fee of $" + transactionFee + " processed.");
	        } else {
	            System.out.println("Insufficient balance for withdrawal and fee.");
	        }
	    }

	    // Method to display account information for ChequingAccount
	    @Override
	    public void displayAccountInfo() {
	        super.displayAccountInfo(); // Call the display method from BankAccount
	        System.out.println("Transaction Fee: $" + transactionFee);
	    }
	
}
