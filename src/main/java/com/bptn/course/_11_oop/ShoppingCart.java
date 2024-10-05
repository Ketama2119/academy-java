package com.bptn.course._11_oop;

 class ShoppingCart {
	 private CartItem[] items; // Array to store CartItems
	    private int itemCount;    // Tracks the number of items in the cart

	    // Constructor to initialize the cart
	    public ShoppingCart() {
	        items = new CartItem[5]; // Initializes an array with space for 5 CartItems
	        itemCount = 0;
	    }

	    // Method to add a product to the cart
	    public void addProductToCart(Product product, int quantity) {
	        if (itemCount <= 4) { // Check if the cart has space for more items
	            CartItem newItem = new CartItem(product, quantity);
	            items[itemCount] = newItem;
	            itemCount++;
	            product.reduceStock(quantity); // Reduces stock from the product
	        } else {
	            throw new IllegalArgumentException("Cart full!");
	        }
	    }

	    // Method to show products in the cart
	    public CartItem[] showProductsInCart() {
	        CartItem[] currentItems = new CartItem[itemCount]; // Create an array with the size of itemCount
	        for (int i = 0; i < itemCount; i++) {
	            currentItems[i] = items[i]; // Copy each CartItem from the original items array
	        }
	        return currentItems; // Return the array of current items
	    }

		public void displayCart() {
			// TODO Auto-generated method stub
			
		}
 }

