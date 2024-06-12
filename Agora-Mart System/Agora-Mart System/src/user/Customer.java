package user;

public class Customer extends User {

    public Customer(String username, String password) {
        super(username, password);
    }

    @Override
    public void displayUserDetails() {
        System.out.println("Customer Username: " + getUsername());
    }
}
