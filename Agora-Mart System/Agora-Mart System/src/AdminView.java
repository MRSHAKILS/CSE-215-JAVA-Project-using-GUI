import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class AdminView extends JFrame {
    private JTextArea textAreaProducts;

    public AdminView() {
        setTitle("Admin View");
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

        JButton btnAddProduct = new JButton("Add Product");
        btnAddProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAddProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter product name:");
                double price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price:"));
                // For simplicity, adding as a generic product. Extend to include different product types.
                Product product = new Product(name, price) {
                    @Override
                    public void displayProductDetails() {
                        System.out.println("Product: " + name + ", Price: " + price);
                    }
                };
                List<Product> products = AgoraMart.loadProducts();
                products.add(product);
                AgoraMart.saveProducts(products);
                displayProducts();
            }
        });
        btnAddProduct.setBounds(10, 113, 182, 93);
        getContentPane().add(btnAddProduct);

        JButton btnEditProduct = new JButton("Edit Product");
        btnEditProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnEditProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter product name to edit:");
                List<Product> products = AgoraMart.loadProducts();
                for (Product product : products) {
                    if (product.getName().equalsIgnoreCase(name)) {
                        double newPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter new price:"));
                        product.setPrice(newPrice);
                        AgoraMart.saveProducts(products);
                        displayProducts();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Product not found.");
            }
        });
        btnEditProduct.setBounds(10, 216, 182, 93);
        getContentPane().add(btnEditProduct);

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add functionality to go back to the previous screen
            }
        });
        btnBack.setBounds(10, 339, 85, 21);
        getContentPane().add(btnBack);
    }

    public void displayProducts() {
        textAreaProducts.setText(null);
        for (Product product : AgoraMart.loadProducts()) {
            textAreaProducts.append(product.getName() + " - $" + product.getPrice() + "\n");
        }
    }
}
