package product;

public class FoodProduct extends Product {
    private String expiryDate;

    public FoodProduct(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Food Product: " + getName() + ", Price: " + getPrice() + ", Expiry Date: " + expiryDate);
    }
}
