package product;

public class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Clothing Product: " + getName() + ", Price: " + getPrice() + ", Size: " + size);
    }
}
