package WindowBuilder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PersonInfo extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PersonInfo() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 524);
		add(panel);
		
		JLabel label = new JLabel("\u4e2a\u4eba\u4fe1\u606f\u8bbe\u7f6e");
		label.setFont(new Font("Dialog", Font.PLAIN, 18));
		label.setBounds(42, 46, 286, 23);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(42, 79, 633, 46);
		panel.add(separator);
		
		JLabel label_1 = new JLabel("\u59d3\u540d");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(42, 149, 75, 23);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u9ec4\u9882\u626c");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_2.setBounds(155, 150, 75, 21);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u5b66\u53f7");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_3.setBounds(42, 212, 75, 23);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("2016052387");
		label_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_4.setBounds(155, 212, 169, 23);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("\u5b66\u9662");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_5.setBounds(42, 277, 75, 23);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("\u667a\u80fd\u79d1\u5b66\u4e0e\u5de5\u7a0b\u5b66\u9662");
		label_6.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_6.setBounds(155, 277, 173, 23);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("\u4e13\u4e1a");
		label_7.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_7.setBounds(42, 342, 75, 23);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("\u8f6f\u4ef6\u5de5\u7a0b");
		label_8.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_8.setBounds(155, 342, 173, 23);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("\u5bbf\u820d");
		label_9.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_9.setBounds(42, 406, 75, 23);
		panel.add(label_9);
		
		textField = new JTextField();
		textField.setText("3315");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Dialog", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(155, 404, 106, 27);
		panel.add(textField);
		
		JButton button = new JButton("\u4fdd\u5b58");
		button.setBounds(437, 461, 97, 32);
		panel.add(button);

	}

}
