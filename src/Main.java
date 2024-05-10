import Tugas2.Product; // Importing from Tugas2
import Tugas2.Order;   // Importing from Tugas2

public class Main {
    public static void main(String[] args) {
        // Create a Product instance
        Product exampleProduct = new Product(1, "Bakso", 12000); // id, name, price

        // Create an Order instance with the product and a specific quantity
        Order myOrder = new Order(exampleProduct, 2); // Order for 5 units of the product

        // Display information about the order
        System.out.println("Order Description: " + myOrder.getOrderDescription());
        System.out.println("Total Price: " + myOrder.getTotalPrice());
    }
}
