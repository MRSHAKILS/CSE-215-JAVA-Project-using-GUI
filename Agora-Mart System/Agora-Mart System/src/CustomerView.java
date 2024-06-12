import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerView extends JFrame {
    private JTextArea textAreaProducts;

    public CustomerView() {
        setTitle("Customer View");
        setBounds(100, 100, 804, 515);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        textAreaProducts = new JTextArea();
        textAreaProducts.setBounds(202, 10, 578, 458);
        getContentPane().add(textAreaProducts);

        JButton btnViewProducts = new JButton("View Products");
        btnViewProducts.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnViewProducts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayProducts();
            }
        });
        btnViewProducts.setBounds(10, 10, 182, 93);
        getContentPane().add(btnViewProducts);

        JButton btnAddToCart = new JButton("Add to Cart");
        btnAddToCart.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAddToCart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String productName = JOptionPane.showInputDialog("Enter product name to add to cart:");
                addToCart(productName);
            }
        });
        btnAddToCart.setBounds(10, 113, 182, 93);
        getContentPane().add(btnAddToCart);

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CustomerLogin().setVisible(true);
                dispose();
            }
        });
        btnBack.setBounds(10, 339, 85, 21);
        getContentPane().add(btnBack);
    }

    public void displayProducts() {
        textAreaProducts.setText(null);
        for (Product product : AgoraMart.getProducts()) {
            textAreaProducts.append(product.getName() + " - $" + product.getPrice() + "\n");
        }
    }

    public void addToCart(String productName) {
        for (Product product : AgoraMart.getProducts()) {
            if (product.getName().equalsIgnoreCase(productName)) {
                JOptionPane.showMessageDialog(null, productName + " added to cart.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Product not found.");
    }
}
