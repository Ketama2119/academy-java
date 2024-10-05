package com.bptn.course._11_oop;

public class ShoppingCartApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("P001", "Laptop", 1500, 10);
        Product p2 = new Product("P002", "Smartphone", 500, 20);

        // Create a customer
        Customer customer = new Customer("C001", "TestCustomer", "testcustomer@example.com");

        // Add products to the customer's cart
        customer.getCart().addProductToCart(p1, 2);  // Adds 2 laptops
        customer.getCart().addProductToCart(p2, 5);  // Adds 5 smartphones

        // Display the products in the cart
        customer.showCustomerCart();

        // Checkout the customer
        customer.checkout();

        // Create an order for the customer
       // Order order = new Order(customer);

        // Place the order
       // order.placeOrder();
    }
	}


