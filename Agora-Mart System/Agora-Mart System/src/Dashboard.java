

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Dashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	//add code for electronic
		ElectronicDetails electronicDetails = new ElectronicDetails();
        electronicDetails.showDetails();
		//add code for 3rd sub class you will add
        ClothingDetails clothingDetails = new ClothingDetails();
        clothingDetails.showDetails();
		
		JButton btnFood = new JButton("Food");
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Food.main(null);
				frame.dispose();
			}
		});
		btnFood.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFood.setBounds(273, 152, 100, 39);
		frame.getContentPane().add(btnFood);
		
		JLabel lblNewLabel = new JLabel("SHOP NOW !!");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(32, 11, 373, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnDBack = new JButton("Back");
		btnDBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Login.main(null);
				frame.dispose();
			}
		});
		btnDBack.setBounds(358, 233, 66, 17);
		frame.getContentPane().add(btnDBack);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 79, 414, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 213, 414, 3);
		frame.getContentPane().add(separator_1);
	}

}
class ClothingDetails {
    // Implementation for ClothingDetails
    public void showDetails() {
        System.out.println("Clothing details are displayed here.");
    }
}
