package com.bptn.course._12_exception_handling;

public class NestedTryDemo {

		// TODO Auto-generated method stub

		    public static void main(String[] args) {
		        String str = "abc"; // This string will cause a NumberFormatException
		        int num = 0;        // This will be used for division, leading to ArithmeticException

		        // Outer try block for string to integer conversion
		        try {
		            int input = Integer.parseInt(str); // Conversion of string to integer, will throw NumberFormatException

		            // Inner try block for division by zero
		            try {
		                int result = input / num; // This will cause ArithmeticException (division by zero)
		            } catch (ArithmeticException e) {
		                // Handle division by zero
		                System.out.println("Error: Cannot divide by zero");
		            }

		        } catch (NumberFormatException e) {
		            // Handle invalid string to integer conversion
		            System.out.println("Error: Invalid input!");
		        }
		    }
		
	}


