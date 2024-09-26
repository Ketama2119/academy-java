package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		        
		        Scanner scanner = new Scanner(System.in);
		        double totalPrice = 0; 
		        boolean ordering = true; 
		        
		        System.out.println("Welcome to the menu!");

		        while (ordering) {
		            System.out.println("\nPlease choose an item from the list (or press 5 to exit): ");
		            System.out.println("1. Pizza - $12.99");
		            System.out.println("2. Burger - $8.99");
		            System.out.println("3. Pasta - $9.99");
		            System.out.println("4. Salad - $6.99");
		            System.out.println("5. Exit");
		            
		            int choice = scanner.nextInt();
		            
		            switch(choice) {
		                case 1: 
		                    System.out.println("You ordered Pizza!");
		                    totalPrice += 12.99; 
		                    break;
		                case 2: 
		                    System.out.println("You ordered Burger!");
		                    totalPrice += 8.99; 
		                    break;
		                case 3: 
		                    System.out.println("You ordered Pasta!");
		                    totalPrice += 9.99; 
		                    break;
		                case 4: 
		                    System.out.println("You ordered Salad!");
		                    totalPrice += 6.99; 
		                    break;
		                case 5: 
		                    System.out.println("Thank you for your order!");
		                    ordering = false; 
		                    break;
		                default:
		                    System.out.println("Invalid Choice! Please choose a valid menu item.");
		            }
		        }

		
		        System.out.println(totalPrice);

		     
		        scanner.close();

	}
}
