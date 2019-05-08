package WindowBuilder;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Request extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Create the panel.
	 */
	public Request() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 982, 524);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 982, 524);
		panel.add(panel_1);
		
		JButton button = new JButton("\u8BF7\u5047\u6761");
		
		
		button.setFont(new Font("����", Font.PLAIN, 28));
		button.setBounds(335, 168, 216, 100);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u8BFE\u5BA4\u7533\u8BF7");
		
		button_1.setFont(new Font("����", Font.PLAIN, 28));
		button_1.setBounds(335, 297, 216, 93);
		panel_1.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 982, 524);
		add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 982, 524);
		panel_3.add(panel_4);
		
		textField = new JTextField();
		textField.setText("\u59D3\u540D");
		textField.setFont(new Font("����", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(183, 116, 122, 39);
		panel_4.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("\u5B66\u53F7");
		textField_1.setFont(new Font("����", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(471, 116, 106, 39);
		panel_4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\u7533\u8BF7\u8BFE\u5BA4");
		textField_2.setFont(new Font("����", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(183, 157, 122, 36);
		panel_4.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("\u8BFE\u5BA4\u7C7B\u522B");
		textField_3.setFont(new Font("����", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(471, 157, 106, 36);
		panel_4.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("\u7528\u9014");
		textField_4.setFont(new Font("����", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(183, 233, 122, 54);
		panel_4.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("\u7533\u8BF7\u65F6\u95F4");
		textField_5.setFont(new Font("����", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(183, 193, 122, 39);
		panel_4.add(textField_5);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(305, 116, 165, 39);
		panel_4.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(576, 116, 176, 39);
		panel_4.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBounds(305, 155, 165, 38);
		panel_4.add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBounds(576, 158, 176, 35);
		panel_4.add(editorPane_3);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBounds(305, 233, 447, 54);
		panel_4.add(editorPane_4);
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setBounds(305, 193, 447, 39);
		panel_4.add(editorPane_5);
		
		JButton button_2 = new JButton("\u63D0\u4EA4");
		
		button_2.setBounds(752, 443, 143, 47);
		panel_4.add(button_2);
		
		JLabel label = new JLabel("\u8BFE\u5BA4\u7533\u8BF7");
		label.setFont(new Font("����", Font.PLAIN, 28));
		label.setBounds(401, 61, 143, 40);
		panel_4.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 982, 524);
		add(panel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 982, 524);
		panel_2.add(panel_5);
		
		JButton button_3 = new JButton("\u63D0\u4EA4");

		button_3.setBounds(769, 433, 151, 53);
		panel_5.add(button_3);
		
		JLabel label_1 = new JLabel("\u8BF7\u5047\u6761");
		label_1.setFont(new Font("����", Font.PLAIN, 28));
		label_1.setBounds(403, 56, 118, 53);
		panel_5.add(label_1);
		
		textField_6 = new JTextField();
		textField_6.setText("\u59D3\u540D");
		textField_6.setFont(new Font("����", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(182, 143, 96, 43);
		panel_5.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("\u5B66\u9662");
		textField_7.setFont(new Font("����", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(182, 186, 96, 36);
		panel_5.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("\u8BF7\u5047\u539F\u56E0");
		textField_8.setFont(new Font("����", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(182, 223, 96, 53);
		panel_5.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("\u8BF7\u5047\u65F6\u95F4");
		textField_9.setFont(new Font("����", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(182, 276, 96, 36);
		panel_5.add(textField_9);
		
		JEditorPane editorPane_6 = new JEditorPane();
		editorPane_6.setBounds(277, 143, 171, 43);
		panel_5.add(editorPane_6);
		
		textField_10 = new JTextField();
		textField_10.setText("\u5B66\u53F7");
		textField_10.setFont(new Font("����", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(450, 143, 101, 43);
		panel_5.add(textField_10);
		
		JEditorPane editorPane_7 = new JEditorPane();
		editorPane_7.setBounds(277, 186, 171, 36);
		panel_5.add(editorPane_7);
		
		textField_11 = new JTextField();
		textField_11.setText("\u4E13\u4E1A");
		textField_11.setFont(new Font("����", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(450, 186, 101, 36);
		panel_5.add(textField_11);
		
		JEditorPane editorPane_8 = new JEditorPane();
		editorPane_8.setBounds(554, 186, 189, 36);
		panel_5.add(editorPane_8);
		
		JEditorPane editorPane_9 = new JEditorPane();
		editorPane_9.setBounds(275, 223, 468, 53);
		panel_5.add(editorPane_9);
		
		JEditorPane editorPane_10 = new JEditorPane();
		editorPane_10.setBounds(277, 276, 466, 36);
		panel_5.add(editorPane_10);
		
		JEditorPane editorPane_11 = new JEditorPane();
		editorPane_11.setBounds(552, 143, 191, 42);
		panel_5.add(editorPane_11);
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.removeAll();
				panel.add(panel_3);
				panel.updateUI();
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				panel.removeAll();
				panel.add(panel_2);
				panel.updateUI();
				
			}
		});
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.removeAll();
				panel.add(panel);
				panel.updateUI();
			}
		});
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.removeAll();
				panel.add(panel);
				panel.updateUI();
			}
		});
	}

}
