package com.bptn.course._11_oop;

 class Customer {
	private String customerID;
    private String customerName;
    private String customerEmail;
    private ShoppingCart cart; // Assuming cart is of type ShoppingCart

    // Constructor to initialize Customer
    public Customer(String customerID, String customerName, String customerEmail) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.cart = new ShoppingCart(); // Each customer gets a new cart by default
    }

    // Getter for customerID
    public String getCustomerID() {
        return customerID;
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Getter for customerEmail
    public String getCustomerEmail() {
        return customerEmail;
    }

    // Getter for ShoppingCart
    public ShoppingCart getCart() {
        return cart;
    }

    // Method to add a product to the customer's cart
   // public void addProductToCart(Product product, int quantity) {
       // cart.addProductToCart(product, quantity);
   // }

    // Method to display the products in the customer's cart
    public void showCustomerCart() {
        System.out.println("Cart for Customer: " + customerName);
        cart.displayCart(); // Display the cart items
    }

	public void checkout() {
		// TODO Auto-generated method stub
		
	}

    // Method to display the total price of the cart
    //public void showCartTotal() {
       // System.out.println("Total Price for " + customerName + "'s Cart: ");
        //cart.showTotalPrice(); // Display the total price
    }




