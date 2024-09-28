package com.bptn.com._08_Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display Calculator Menu
            System.out.println("Calculator Menu");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");
            System.out.print("Enter your choice: ");
            
            // Get user input
            choice = scanner.nextInt();

            switch (choice) {
                case 1:  // Addition
                    System.out.print("Enter the first number: ");
                    double addNum1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double addNum2 = scanner.nextDouble();
                    System.out.println("The sum of " + addNum1 + " and " + addNum2 + " is = " + (addNum1 + addNum2));
                    break;
                    
                case 2:  // Subtraction
                    System.out.print("Enter the first number: ");
                    double subNum1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double subNum2 = scanner.nextDouble();
                    System.out.println("The difference between " + subNum1 + " and " + subNum2 + " is = " + (subNum1 - subNum2));
                    break;
                    
                case 3:  // Multiplication
                    System.out.print("Enter the first number: ");
                    double mulNum1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double mulNum2 = scanner.nextDouble();
                    System.out.println("The product of " + mulNum1 + " and " + mulNum2 + " is = " + (mulNum1 * mulNum2));
                    break;
                    
                case 4:  // Division
                    System.out.print("Enter the first number: ");
                    double divNum1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double divNum2 = scanner.nextDouble();
                    if (divNum2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.println("The division of " + divNum1 + " by " + divNum2 + " is = " + (divNum1 / divNum2));
                    }
                    break;
                    
                case 5:  // Square
                    System.out.print("Enter the number to square: ");
                    double sqNum = scanner.nextDouble();
                    System.out.println("The square of " + sqNum + " is = " + (sqNum * sqNum));
                    break;
                    
                case 6:  // Square Root
                    System.out.print("Enter the number to find the square root: ");
                    double sqrtNum = scanner.nextDouble();
                    if (sqrtNum < 0) {
                        System.out.println("Cannot find the square root of a negative number!");
                    } else {
                        System.out.println("The square root of " + sqrtNum + " is = " + Math.sqrt(sqrtNum));
                    }
                    break;
                    
                case 7:  // Reciprocal
                    System.out.print("Enter the number to find the reciprocal: ");
                    double recNum = scanner.nextDouble();
                    if (recNum == 0) {
                        System.out.println("Cannot find the reciprocal of zero!");
                    } else {
                        System.out.println("The reciprocal of " + recNum + " is = " + (1 / recNum));
                    }
                    break;
                    
                default:  // Invalid Choice
                    System.out.println("Invalid choice! Please make a valid choice.");
            }

            // Prompt for continuation
            System.out.println("To continue calculation press 1, else press any other number to exit.");
            choice = scanner.nextInt();
            
        } while (choice == 1);  // Repeat if user presses 1 to continue

        scanner.close(); 

	}

}
