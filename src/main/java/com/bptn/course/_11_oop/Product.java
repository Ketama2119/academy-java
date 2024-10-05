package com.bptn.course._11_oop;

 class Product {
	private String productId;
    private String productName;
    private double productPrice;
    private int productQuantity;

    // Constructor to initialize the Product object
    public Product(String productId, String productName, double productPrice, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    // Getter and Setter methods for productName
    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter and Setter methods for productPrice
    public double getProductPrice() {
        return this.productPrice;
    }

   // public void setProductPrice(double productPrice) {
      //  this.productPrice = productPrice;
   // }

    // Getter and Setter methods for productQuantity
    public int getProductQuantity() {
        return this.productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public void reduceStock(int quantity) {
        if (quantity <= this.productQuantity) {
            this.productQuantity -= quantity;
        } else {
            throw new IllegalArgumentException("Insufficient Stock!");
        }
    }


}
