package WindowBuilder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import ClassLibrary.PasswordInfo;
import ClassLibrary.SchoolCardMoneyCrawer;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SchoolCard extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public SchoolCard(String status) {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 529);
		add(panel);
		
		JLabel label = new JLabel("\u6821\u56ed\u4e00\u5361\u901a");
		label.setFont(new Font("Dialog", Font.PLAIN, 24));
		label.setBounds(347, 86, 133, 26);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u4f59\u989d\uff1a");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(282, 174, 115, 18);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel();
		
		label_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_2.setBounds(378, 174, 471, 18);
		panel.add(label_2);
		
		
		
		if(status==null) {
			label_2.setText("\u6570\u5b57\u66a8\u5927\u8d26\u53f7\u5bc6\u7801\u672a\u4fdd\u5b58\u6216\u4e0d\u6b63\u786e\u0020\uff0c\u8bf7\u6b63\u786e\u586b\u5199");
			label_2.setForeground(Color.RED);
			JLabel label_3 = new JLabel("\u6570\u5b57\u66a8\u5927");
			label_3.setFont(new Font("Dialog", Font.PLAIN, 18));
			label_3.setBounds(358, 205, 115, 18);
			panel.add(label_3);
			
			JLabel label_4 = new JLabel("\u8d26\u53f7\uff1a");
			label_4.setFont(new Font("Dialog", Font.PLAIN, 18));
			label_4.setBounds(282, 240, 68, 18);
			panel.add(label_4);
			
			JLabel label_5 = new JLabel("\u5bc6\u7801\uff1a");
			label_5.setFont(new Font("Dialog", Font.PLAIN, 18));
			label_5.setBounds(282, 275, 68, 18);
			panel.add(label_5);
			
			textField = new JTextField();
			textField.setBounds(347, 236, 166, 24);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(347, 271, 166, 24);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JButton btnNewButton = new JButton("\u4fdd\u5b58\u5e76\u67e5\u8be2");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(MainInterface.passwordInfo==null)
						MainInterface.passwordInfo = new PasswordInfo();
					MainInterface.passwordInfo.setShuziJnuAccount(textField.getText());
					MainInterface.passwordInfo.setShuziJnuPassword(textField_1.getText());
					MainInterface.saveDataPasswor.save(MainInterface.passwordInfo);
					if(textField.getText().length()!=10 || textField_1.getText().length()==0) {
						label_2.setText("\u6570\u5b57\u66a8\u5927\u8d26\u53f7\u5bc6\u7801\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u586b\u5199");
						label_2.setForeground(Color.RED);
					}else {
						SchoolCardMoneyCrawer schoolCardMoneyCrawer =  new SchoolCardMoneyCrawer();
						String status  = schoolCardMoneyCrawer.getBalance(textField.getText(), textField_1.getText());
						label_2.setText(status);
						label_2.setForeground(Color.BLACK);
					}
				}
			});
			btnNewButton.setBounds(358, 318, 113, 27);
			panel.add(btnNewButton);
		}else {
			label_2.setText(status);
		}
	}
}
