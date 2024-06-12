import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AdminLogin {

    JFrame frame;
    private JTextField txtAdminUsername;
    private JPasswordField txtAdminPassword;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                AdminLogin window = new AdminLogin();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public AdminLogin() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 128));
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblAdminLogin = new JLabel("ADMIN LOGIN");
        lblAdminLogin.setFont(new Font("Stencil", Font.BOLD, 18));
        lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblAdminLogin.setHorizontalTextPosition(SwingConstants.CENTER);
        lblAdminLogin.setBounds(91, 11, 218, 38);
        frame.getContentPane().add(lblAdminLogin);

        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUsername.setBounds(54, 97, 83, 14);
        frame.getContentPane().add(lblUsername);

        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPassword.setBounds(54, 133, 83, 14);
        frame.getContentPane().add(lblPassword);

        txtAdminUsername = new JTextField();
        txtAdminUsername.setBounds(147, 94, 214, 20);
        frame.getContentPane().add(txtAdminUsername);
        txtAdminUsername.setColumns(10);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = txtAdminUsername.getText();
                String password = new String(txtAdminPassword.getPassword());

                User user = AgoraMart.login(username, password);
                if (user instanceof Admin) {
                    txtAdminUsername.setText(null);
                    txtAdminPassword.setText(null);
                    AdminView adminView = new AdminView();
                    adminView.setVisible(true);
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        btnLogin.setBounds(41, 198, 89, 23);
        frame.getContentPane().add(btnLogin);

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtAdminUsername.setText(null);
                txtAdminPassword.setText(null);
            }
        });
        btnReset.setBounds(182, 198, 89, 23);
        frame.getContentPane().add(btnReset);

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add functionality to go back to the previous screen
            }
        });
        btnBack.setBounds(313, 198, 89, 23);
        frame.getContentPane().add(btnBack);

        txtAdminPassword = new JPasswordField();
        txtAdminPassword.setBounds(147, 130, 214, 20);
        frame.getContentPane().add(txtAdminPassword);

        JSeparator separator1 = new JSeparator();
        separator1.setBounds(10, 166, 414, 2);
        frame.getContentPane().add(separator1);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 70, 414, 2);
        frame.getContentPane().add(separator);
    }
}
