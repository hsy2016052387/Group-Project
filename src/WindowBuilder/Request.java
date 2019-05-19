package WindowBuilder;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;



import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Request extends JPanel {
	   public static String leave_name;
	   public static String leave_number;
	   public static String leave_institute;
	   public static String leave_specialty;
	   public static String leave_reason;
	    public static String class_num1;
	    public static String class_num2;
	    public static String class_num3;
	    public static String class_intended;
	    public static String class_name;
	    public static String class_phone;
	    public static String class_purpose;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_name;
	private JTextField textField_number;
	private JTextField textField_institute;
	private JTextField textField_specialty;
	private JTextField textField_reason;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_num1;
	private JTextField textField_num2;
	private JTextField textField_num3;
	private JTextField textField_intended;
	private JTextField textField_name_class;
	private JTextField textField_phone;
	private JTextField textField_purpose;

	/**
	 * Create the panel.
	 */
	public Request() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 982, 553);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 982, 524);
		panel.add(panel_1);
		
		JButton button = new JButton("\u8BF7\u5047\u6761");
		
		
		button.setFont(new Font("宋体", Font.PLAIN, 28));
		button.setBounds(367, 170, 216, 100);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u8BFE\u5BA4\u7533\u8BF7");
		
		button_1.setFont(new Font("宋体", Font.PLAIN, 28));
		button_1.setBounds(367, 304, 216, 93);
		panel_1.add(button_1);
		
//		JPanel panel_2 = new JPanel();
//		panel_2.setLayout(null);
//		panel_2.setBounds(0, 0, 982, 553);
//		add(panel_2);
//		
//		JPanel panel_5 = new JPanel();
//		panel_5.setLayout(null);
//		panel_5.setBounds(0, 0, 982, 524);
//		panel_2.add(panel_5);
//		
//		JButton button_3 = new JButton("\u63D0\u4EA4");
//		
//		button_3.setBounds(785, 438, 151, 53);
//		panel_5.add(button_3);
//		
//		JLabel label_1 = new JLabel("\u8BF7\u5047\u6761");
//		label_1.setFont(new Font("宋体", Font.PLAIN, 28));
//		label_1.setBounds(403, 56, 118, 53);
//		panel_5.add(label_1);
//		
//		textField_6 = new JTextField();
//		textField_6.setText("\u59D3\u540D");
//		textField_6.setFont(new Font("宋体", Font.PLAIN, 20));
//		textField_6.setColumns(10);
//		textField_6.setBounds(182, 143, 96, 43);
//		panel_5.add(textField_6);
//		
//		textField_7 = new JTextField();
//		textField_7.setText("\u5B66\u9662");
//		textField_7.setFont(new Font("宋体", Font.PLAIN, 20));
//		textField_7.setColumns(10);
//		textField_7.setBounds(182, 186, 96, 36);
//		panel_5.add(textField_7);
//		
//		textField_8 = new JTextField();
//		textField_8.setText("\u8BF7\u5047\u539F\u56E0");
//		textField_8.setFont(new Font("宋体", Font.PLAIN, 20));
//		textField_8.setColumns(10);
//		textField_8.setBounds(182, 223, 96, 53);
//		panel_5.add(textField_8);
//		
//		textField_9 = new JTextField();
//		textField_9.setText("\u5B66\u53F7");
//		textField_9.setFont(new Font("宋体", Font.PLAIN, 20));
//		textField_9.setColumns(10);
//		textField_9.setBounds(450, 143, 101, 43);
//		panel_5.add(textField_9);
//		
//		textField_10 = new JTextField();
//		textField_10.setText("\u4E13\u4E1A");
//		textField_10.setFont(new Font("宋体", Font.PLAIN, 20));
//		textField_10.setColumns(10);
//		textField_10.setBounds(450, 186, 101, 36);
//		panel_5.add(textField_10);
//		
//		textField_name = new JTextField();
//		textField_name.setColumns(10);
//		textField_name.setBounds(279, 145, 170, 43);
//		panel_5.add(textField_name);
//		
//		textField_number = new JTextField();
//		textField_number.setColumns(10);
//		textField_number.setBounds(550, 143, 151, 43);
//		panel_5.add(textField_number);
//		
//		textField_institute = new JTextField();
//		textField_institute.setColumns(10);
//		textField_institute.setBounds(279, 186, 170, 36);
//		panel_5.add(textField_institute);
//		
//		textField_specialty = new JTextField();
//		textField_specialty.setColumns(10);
//		textField_specialty.setBounds(550, 186, 151, 36);
//		panel_5.add(textField_specialty);
//		
//		textField_reason = new JTextField();
//		textField_reason.setColumns(10);
//		textField_reason.setBounds(279, 223, 422, 53);
//		panel_5.add(textField_reason);
//		
//		JPanel panel_3 = new JPanel();
//		panel_3.setLayout(null);
//		panel_3.setBounds(0, 0, 982, 553);
//		add(panel_3);
//		
//		JPanel panel_4 = new JPanel();
//		panel_4.setLayout(null);
//		panel_4.setBounds(0, 0, 982, 524);
//		panel_3.add(panel_4);
//		
//		textField = new JTextField();
//		textField.setText("\u7528\u9014");
//		textField.setFont(new Font("宋体", Font.PLAIN, 20));
//		textField.setColumns(10);
//		textField.setBounds(183, 233, 122, 39);
//		panel_4.add(textField);
//		
//		textField_1 = new JTextField();
//		textField_1.setText("\u8054\u7CFB\u7535\u8BDD");
//		textField_1.setFont(new Font("宋体", Font.PLAIN, 20));
//		textField_1.setColumns(10);
//		textField_1.setBounds(445, 193, 106, 39);
//		panel_4.add(textField_1);
//		
//		textField_2 = new JTextField();
//		textField_2.setText("\u62DF\u7528\u5355\u4F4D");
//		textField_2.setFont(new Font("宋体", Font.PLAIN, 20));
//		textField_2.setColumns(10);
//		textField_2.setBounds(183, 157, 122, 36);
//		panel_4.add(textField_2);
//		
//		textField_3 = new JTextField();
//		textField_3.setText("\u7533\u8BF7\u4EBA");
//		textField_3.setFont(new Font("宋体", Font.PLAIN, 20));
//		textField_3.setColumns(10);
//		textField_3.setBounds(183, 193, 122, 39);
//		panel_4.add(textField_3);
//		
//		JButton button_2 = new JButton("\u63D0\u4EA4");
//		
//		button_2.setBounds(737, 415, 143, 47);
//		panel_4.add(button_2);
//		
//		JLabel label = new JLabel("\u8BFE\u5BA4\u7533\u8BF7");
//		label.setFont(new Font("宋体", Font.PLAIN, 30));
//		label.setBounds(405, 50, 156, 47);
//		panel_4.add(label);
//		
//		textField_num1 = new JTextField();
//		textField_num1.setColumns(10);
//		textField_num1.setBackground(SystemColor.menu);
//		textField_num1.setBounds(272, 103, 75, 36);
//		panel_4.add(textField_num1);
//		
//		JLabel label_2 = new JLabel("~");
//		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 36));
//		label_2.setBounds(347, 100, 27, 39);
//		panel_4.add(label_2);
//		
//		textField_num2 = new JTextField();
//		textField_num2.setColumns(10);
//		textField_num2.setBackground(SystemColor.menu);
//		textField_num2.setBounds(371, 103, 75, 36);
//		panel_4.add(textField_num2);
//		
//		JLabel label_3 = new JLabel("\u5B66\u5E74\u7B2C");
//		label_3.setFont(new Font("宋体", Font.PLAIN, 26));
//		label_3.setBounds(445, 103, 84, 34);
//		panel_4.add(label_3);
//		
//		textField_num3 = new JTextField();
//		textField_num3.setColumns(10);
//		textField_num3.setBackground(SystemColor.menu);
//		textField_num3.setBounds(525, 103, 75, 36);
//		panel_4.add(textField_num3);
//		
//		JLabel label_4 = new JLabel("\u5B66\u671F");
//		label_4.setFont(new Font("宋体", Font.PLAIN, 26));
//		label_4.setBounds(601, 103, 61, 34);
//		panel_4.add(label_4);
//		
//		textField_intended = new JTextField();
//		textField_intended.setColumns(10);
//		textField_intended.setBounds(304, 157, 405, 36);
//		panel_4.add(textField_intended);
//		
//		textField_name_class = new JTextField();
//		textField_name_class.setColumns(10);
//		textField_name_class.setBounds(304, 193, 142, 39);
//		panel_4.add(textField_name_class);
//		
//		textField_phone = new JTextField();
//		textField_phone.setColumns(10);
//		textField_phone.setBounds(551, 193, 158, 39);
//		panel_4.add(textField_phone);
//		
//		textField_purpose = new JTextField();
//		textField_purpose.setColumns(10);
//		textField_purpose.setBounds(304, 233, 405, 39);
//		panel_4.add(textField_purpose);
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.removeAll();
				panel.add(new ClassRequest());
				panel.updateUI();
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				panel.removeAll();
				panel.add(new LeaveRequest());
				panel.updateUI();
				
			}
		});
		
	}

	

}
