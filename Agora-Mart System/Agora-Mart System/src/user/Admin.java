package user;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void displayUserDetails() {
        System.out.println("Admin Username: " + getUsername());
    }
}
