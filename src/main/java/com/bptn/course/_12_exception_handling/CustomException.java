package com.bptn.course._12_exception_handling;

//Custom exception class for handling insufficient balance
 class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//Main class where account balance operations are handled
public class CustomException {

 private double accountBalance;

 // Constructor to initialize the account balance
 public CustomException(double accountBalance) {
     this.accountBalance = accountBalance;
 }

 // Withdraw method which throws InsufficientBalanceException if balance is insufficient
 public void withdraw(double amountToWithdraw) throws InsufficientBalanceException {
     if (accountBalance >= amountToWithdraw) {
         this.accountBalance -= amountToWithdraw;
         System.out.println("Withdrawal Successful!");
     } else {
         // Throw custom exception if balance is insufficient
         throw new InsufficientBalanceException("Insufficient funds!");
     }
 }

 // Main method to test the withdraw functionality
 public static void main(String[] args) {
     CustomException myDemo = new CustomException(1000.00); // Set initial account balance

     try {
         myDemo.withdraw(1500); // Test insufficient balance
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage()); // Print custom exception message
     }
 }

//public class CustomException {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub

	}


