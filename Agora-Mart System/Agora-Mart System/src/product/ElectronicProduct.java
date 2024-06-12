package product;

public class ElectronicProduct extends Product {
    private int warrantyPeriod; // in months

    public ElectronicProduct(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Electronic Product: " + getName() + ", Price: " + getPrice() + ", Warranty: " + warrantyPeriod + " months");
    }

    // Overloaded constructor
    public double calculateDiscountedPrice(int quantity) {
        if (quantity > 1) {
            return getPrice() * quantity * 0.8; // 20% discount for more than one item
        } else {
            return getPrice() * quantity;
        }
    }
}
