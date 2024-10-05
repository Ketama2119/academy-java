package com.bptn.course._11_oop;

import java.util.Iterator;

//SavingsAccount.java
public class SavingAccount extends BankAccount {
 private double interestRate;

 // Constructor for SavingsAccount
 public SavingAccount(String accountNumber, double initialBalance, double interestRate) {
     super(accountNumber, initialBalance); // Call the constructor of BankAccount
     this.interestRate = interestRate;
 }

 // Method to apply interest to the balance
 public void applyInterest() {
     double interest = getBalance() * (interestRate / 100);
     deposit(interest);  // Deposit the calculated interest
     System.out.println("Interest applied: $" + interest);
 }

 // Method to display account information for SavingsAccount
 @Override
 public void displayAccountInfo() {
     super.displayAccountInfo(); // Call the display method from BankAccount
     System.out.println("Interest Rate: " + interestRate + "%");
	}
 }
