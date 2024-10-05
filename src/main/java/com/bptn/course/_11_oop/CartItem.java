package com.bptn.course._11_oop;

 class CartItem {
	private Product product;
    private int cartQuantity;

    // Constructor to initialize CartItem object
    public CartItem(Product product, int quantity) {
        if (quantity > product.getProductQuantity()) {
            throw new IllegalArgumentException("Insufficient Stock!");
        }
        this.product = product;
        this.cartQuantity = quantity;
    }

    // Getter for Product
    public Product getProduct() {
        return product;
    }

    // Getter for CartQuantity
    public int getCartQuantity() {
        return cartQuantity;
    }

    // Method to calculate total price for the cart item
    public double getTotalPrice() {
        return product.getProductPrice() * this.cartQuantity;
    }

    }
