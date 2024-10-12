package singleResponsibility;

//Code Violating the Single Responsibility Principle:
//Here’s an example where a change in one task affects others because everything 
//is handled in one class, violating the Single Responsibility Principle:
public class RestaurantManager {
	//// Modified to call serveCustomers after preparing food
	// Prepares food
	public void prepareFood() {
		System.out.println("Cooking food...");
		serveCustomers(); // Added serving customers here
	}

	// Serves customers
	public void serveCustomers() {
		System.out.println("Serving customers...");
	}

	// Manages business operations
	public void manageRestaurant() {
		System.out.println("Managing the restaurant...");
	}

	public static void main(String[] args) {
		RestaurantManager manager = new RestaurantManager();

		// The manager does everything
		manager.prepareFood();
		manager.serveCustomers();
		manager.manageRestaurant();
	}
}