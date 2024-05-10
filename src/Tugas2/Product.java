package Tugas2;
import Tugas1.EntityBase;
public class Product extends EntityBase {
    private int price;

    public Product(int id, String name, int price) {
        super(id, name);
        this.price = price;
    }

    @Override
    public String getDescription(){
        return "ProductEntity[id=" + getId() + ", name=" + getName() + ", price=" + price + "]";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
