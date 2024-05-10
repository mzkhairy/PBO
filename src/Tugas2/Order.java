package Tugas2;
public class Order {
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters and Setters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to get the total price of the order
    public int getTotalPrice() {
        return product.getPrice() * quantity;
    }

    // Method to describe the order
    public String getOrderDescription() {
        return "Order of " + quantity + " units of product: " + product.getDescription() + ". Total price: " + getTotalPrice();
    }
}
