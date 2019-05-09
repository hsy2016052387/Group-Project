package WindowBuilder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class PassWord extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public PassWord() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel user_password = new JPanel();
		user_password.setBackground(Color.WHITE);
		user_password.setBounds(0, 0, 982, 524);
		add(user_password);										
		user_password.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("\u7F51\u7AD9\u8D26\u53F7\u5BC6\u7801\u7BA1\u7406");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(88, 55, 378, 37);
		user_password.add(lblNewLabel_5);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(0, 105, 982, 375);
		user_password.add(scrollPane_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(982,600));
		scrollPane_2.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("网站：     Study平台(https://study.jnu.edu.cn)");
		lblNewLabel_6.setBounds(88, 32, 425, 33);
		lblNewLabel_6.setFont(new Font("����", Font.PLAIN, 18));
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("账号：");
		lblNewLabel_7.setBounds(88, 89, 77, 27);
		lblNewLabel_7.setFont(new Font("����", Font.PLAIN, 18));
		panel_1.add(lblNewLabel_7);
		
		JLabel label_24 = new JLabel("密码：");
		label_24.setBounds(88, 139, 77, 27);
		label_24.setFont(new Font("����", Font.PLAIN, 18));
		panel_1.add(label_24);
		
		textField_1 = new JTextField();
		textField_1.setBounds(191, 92, 308, 24);
		textField_1.setEditable(false);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(191, 142, 308, 24);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(88, 192, 532, 2);
		panel_1.add(separator_3);
		
		JLabel lblhttpsijnueducn = new JLabel("网站：     数字暨大(https://i.jnu.edu.cn)  ");
		lblhttpsijnueducn.setBounds(88, 220, 425, 33);
		lblhttpsijnueducn.setFont(new Font("����", Font.PLAIN, 18));
		panel_1.add(lblhttpsijnueducn);
		
		JLabel label_25 = new JLabel("账号：");
		label_25.setBounds(88, 266, 77, 27);
		label_25.setFont(new Font("����", Font.PLAIN, 18));
		panel_1.add(label_25);
		
		JLabel label_26 = new JLabel("密码：");
		label_26.setBounds(88, 314, 77, 27);
		label_26.setFont(new Font("����", Font.PLAIN, 18));
		panel_1.add(label_26);
		
		textField_3 = new JTextField();
		textField_3.setBounds(191, 269, 308, 24);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(191, 317, 308, 24);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		panel_1.add(textField_4);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(88, 365, 532, 2);
		panel_1.add(separator_4);
		
		JLabel label_27 = new JLabel("校园卡");
		label_27.setFont(new Font("����", Font.PLAIN, 18));
		label_27.setBounds(88, 396, 425, 33);
		panel_1.add(label_27);
		
		JLabel label_28 = new JLabel("账号：");
		label_28.setFont(new Font("����", Font.PLAIN, 18));
		label_28.setBounds(88, 445, 77, 27);
		panel_1.add(label_28);
		
		JLabel label_29 = new JLabel("密码：");
		label_29.setFont(new Font("����", Font.PLAIN, 18));
		label_29.setBounds(88, 491, 77, 27);
		panel_1.add(label_29);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(191, 448, 308, 24);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(191, 494, 308, 24);
		panel_1.add(textField_6);
		
		JButton btnNewButton_2 = new JButton("保存");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_1.setEditable(false);
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
			}
		});
		btnNewButton_2.setBounds(542, 484, 113, 27);
		user_password.add(btnNewButton_2);
		
		JButton button = new JButton("编辑");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(true);
				textField_5.setEditable(true);
				textField_6.setEditable(true);
			}
		});
		button.setBounds(315, 484, 113, 27);
		user_password.add(button);
	}

}
