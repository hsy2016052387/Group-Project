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
		
		
		button.setFont(new Font("ËÎÌו", Font.PLAIN, 28));
		button.setBounds(367, 170, 216, 100);
		panel_1.add(button);
		
		JButton button_1 = new JButton("\u8BFE\u5BA4\u7533\u8BF7");
		
		button_1.setFont(new Font("ËÎÌו", Font.PLAIN, 28));
		button_1.setBounds(367, 304, 216, 93);
		panel_1.add(button_1);
		

		
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
