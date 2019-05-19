package WindowBuilder;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import WindowBuilder.DownloadLeave;

public class LeaveRequest extends JPanel {
	   public static String leave_name;
	   public static String leave_number;
	   public static String leave_institute;
	   public static String leave_specialty;
	   public static String leave_reason;
//	   private  JFrame frame;
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
	public static void changeFrame(DownloadLeave windows) {
		//frame.setEnabled(false);
		windows.frame_1.setVisible(true);
		windows.frame_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		windows.frame_1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			//	frame.setEnabled(true);
			}
		});
	}
public  LeaveRequest() {
	
	setBackground(Color.LIGHT_GRAY);
	setBounds(0, 0, 982, 524);
	setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setLayout(null);
	panel.setBounds(0, 0, 982, 553);
	add(panel);
	
	JPanel panel_2 = new JPanel();
	panel_2.setLayout(null);
	panel_2.setBounds(0, 0, 982, 553);
	add(panel_2);
	
	JPanel panel_5 = new JPanel();
	panel_5.setLayout(null);
	panel_5.setBounds(0, 0, 982, 524);
	panel_2.add(panel_5);
	
	JButton button_3 = new JButton("\u63D0\u4EA4");
	
	button_3.setBounds(785, 438, 151, 53);
	panel_5.add(button_3);
	button_3.setVisible(true);
	
	JLabel label_1 = new JLabel("\u8BF7\u5047\u6761");
	label_1.setFont(new Font("宋体", Font.PLAIN, 28));
	label_1.setBounds(403, 56, 118, 53);
	panel_5.add(label_1);
	
	label_1 = new JLabel("\u8BF7\u5047\u6761");
	label_1.setFont(new Font("宋体", Font.PLAIN, 28));
	label_1.setBounds(403, 56, 118, 53);
	panel_5.add(label_1);
	
	textField_6 = new JTextField();
	textField_6.setText("\u59D3\u540D");
	textField_6.setFont(new Font("宋体", Font.PLAIN, 20));
	textField_6.setColumns(10);
	textField_6.setBounds(182, 143, 96, 43);
	panel_5.add(textField_6);
	
	textField_7 = new JTextField();
	textField_7.setText("\u5B66\u9662");
	textField_7.setFont(new Font("宋体", Font.PLAIN, 20));
	textField_7.setColumns(10);
	textField_7.setBounds(182, 186, 96, 36);
	panel_5.add(textField_7);
	
	textField_8 = new JTextField();
	textField_8.setText("\u8BF7\u5047\u539F\u56E0");
	textField_8.setFont(new Font("宋体", Font.PLAIN, 20));
	textField_8.setColumns(10);
	textField_8.setBounds(182, 223, 96, 53);
	panel_5.add(textField_8);
	
	textField_9 = new JTextField();
	textField_9.setText("\u5B66\u53F7");
	textField_9.setFont(new Font("宋体", Font.PLAIN, 20));
	textField_9.setColumns(10);
	textField_9.setBounds(450, 143, 101, 43);
	panel_5.add(textField_9);
	
	textField_10 = new JTextField();
	textField_10.setText("\u4E13\u4E1A");
	textField_10.setFont(new Font("宋体", Font.PLAIN, 20));
	textField_10.setColumns(10);
	textField_10.setBounds(450, 186, 101, 36);
	panel_5.add(textField_10);
	
	textField_name = new JTextField();
	textField_name.setColumns(10);
	textField_name.setBounds(279, 145, 170, 43);
	panel_5.add(textField_name);
	
	textField_number = new JTextField();
	textField_number.setColumns(10);
	textField_number.setBounds(550, 143, 151, 43);
	panel_5.add(textField_number);
	
	textField_institute = new JTextField();
	textField_institute.setColumns(10);
	textField_institute.setBounds(279, 186, 170, 36);
	panel_5.add(textField_institute);
	
	textField_specialty = new JTextField();
	textField_specialty.setColumns(10);
	textField_specialty.setBounds(550, 186, 151, 36);
	panel_5.add(textField_specialty);
	
	textField_reason = new JTextField();
	textField_reason.setColumns(10);
	textField_reason.setBounds(279, 223, 422, 53);
	panel_5.add(textField_reason);
	
	JTextPane textPane_leave = new JTextPane();
	textPane_leave.setBackground(SystemColor.control);
	textPane_leave.setFont(new Font("宋体", Font.PLAIN, 26));
	textPane_leave.setText("\u8BF7\u5047\u6761");
	textPane_leave.setBounds(360, 82, 117, 47);
	panel_5.add(textPane_leave);
	
	button_3.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent arg0) {

			 leave_name = textField_name.getText();

			 leave_number = textField_institute.getText();

			 leave_institute = textField_number.getText();

			 leave_specialty = textField_specialty.getText();

			 leave_reason = textField_reason.getText();
				LeaveOutput docl =new LeaveOutput();
				try {
					docl.createWord();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
				button_3.setVisible(false);
			panel.removeAll();
//            panel.setVisible(false);
			panel.add(new Request());
			panel.updateUI();
			    
			changeFrame(new DownloadLeave());
		}
	});
}
}
