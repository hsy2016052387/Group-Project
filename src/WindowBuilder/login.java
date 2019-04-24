package WindowBuilder;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	static JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
		frame.setVisible(true);
	}

	
	public boolean true_Account(String name,char[] password){
		String a = new String("");
		char[] b = {};
		if(name.equals(a) || password.equals(b)) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u73E0\u6D77\u6821\u533A\u81EA\u52A9\u8F6F\u4EF6");
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(281, 156, 382, 254);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u4F7F\u7528\u6559\u52A1\u5904\u8D26\u53F7\u5BC6\u7801\u767B\u9646");
		label.setForeground(Color.RED);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(51, 13, 265, 18);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u5B66\u53F7\uFF1A");
		label_1.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		label_1.setBounds(53, 66, 60, 18);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801\uFF1A");
		label_2.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		label_2.setBounds(51, 126, 60, 18);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(127, 65, 173, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 125, 173, 24);
		panel.add(passwordField);
		
		JCheckBox checkBox = new JCheckBox("\u8BB0\u4F4F\u5BC6\u7801");
		checkBox.setBounds(155, 168, 133, 27);
		panel.add(checkBox);
		
		JButton btnNewButton = new JButton("\u767B\u9646");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (true_Account(textField.getText(),passwordField.getPassword())) {
					frame.dispose();
					MainInterface l = new MainInterface();
				}
			}
		});
		btnNewButton.setBounds(145, 205, 113, 27);
		panel.add(btnNewButton);
	}
}
