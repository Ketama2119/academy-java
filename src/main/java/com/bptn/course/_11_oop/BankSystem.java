package com.bptn.course._11_oop;

public class BankSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        // Create a new BankAccount object
	        BankAccount account = new BankAccount("123456", 500.0);
	        
	        // Display initial account info
	        account.displayAccountInfo();

	        // Deposit money
	        account.deposit(200);
	        System.out.println("After depositing $200:");
	        account.displayAccountInfo();

	        // Withdraw money
	        account.withdraw(100);
	        System.out.println("After withdrawing $100:");
	        account.displayAccountInfo();

	        // Attempt an invalid withdrawal
	        account.withdraw(1000);  // Should show an error message
	        BankAccount NewTest = new BankAccount("987654", 1000.0);

	        // Display NewTest account info
	        System.out.println("NewTest Account Information:");
	        NewTest.displayAccountInfo();

	        // Deposit money into the NewTest account
	        NewTest.deposit(500);
	        System.out.println("After depositing $500 into NewTest account:");
	        NewTest.displayAccountInfo();

	        // Withdraw money from the NewTest account
	        NewTest.withdraw(200);
	        System.out.println("After withdrawing $200 from NewTest account:");
	        NewTest.displayAccountInfo();
	        // Create a ChequingAccount object
	        ChequingAccount chequingAccount = new ChequingAccount("555555", 2000.0, 2.5);
	        System.out.println("\nChequing Account Information:");
	        chequingAccount.displayAccountInfo();

	        // Perform withdrawal with transaction fee
	        chequingAccount.withdraw(100);
	        chequingAccount.displayAccountInfo();
	    }

	}


