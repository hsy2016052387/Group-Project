package WindowBuilder;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import ClassLibrary.*;
public class ClassRequest extends JPanel {
    public static String class_num1;
    public static String class_num2;
    public static String class_num3;
    public static String class_intended;
    public static String class_name;
    public static String class_phone;
    public static String class_purpose;
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
	
	public static void changeFrame(DownloadClass windows) {
		//frame.setEnabled(false);
		windows.frame_1.setVisible(true);
		windows.frame_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		windows.frame_1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			//	frame.setEnabled(true);
			}
		});
	}
	
	public ClassRequest(){
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 982, 553);
		add(panel);
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 982, 553);
		add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 982, 524);
		panel_3.add(panel_4);
		
		textField = new JTextField();
		textField.setText("\u7528\u9014");
		textField.setFont(new Font("宋体", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(183, 233, 122, 39);
		panel_4.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("\u8054\u7CFB\u7535\u8BDD");
		textField_1.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(445, 193, 106, 39);
		panel_4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("\u62DF\u7528\u5355\u4F4D");
		textField_2.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(183, 157, 122, 36);
		panel_4.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("\u7533\u8BF7\u4EBA");
		textField_3.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(183, 193, 122, 39);
		panel_4.add(textField_3);
		
		JButton button_2 = new JButton("\u63D0\u4EA4");
		
		button_2.setBounds(737, 415, 143, 47);
		panel_4.add(button_2);
		button_2.setVisible(true);
		
		JLabel label = new JLabel("\u8BFE\u5BA4\u7533\u8BF7");
		label.setFont(new Font("宋体", Font.PLAIN, 30));
		label.setBounds(405, 50, 156, 47);
		panel_4.add(label);
		
		textField_num1 = new JTextField();
		textField_num1.setColumns(10);
		textField_num1.setBackground(SystemColor.menu);
		textField_num1.setBounds(272, 103, 75, 36);
		panel_4.add(textField_num1);
		
		JLabel label_2 = new JLabel("~");
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 36));
		label_2.setBounds(347, 100, 27, 39);
		panel_4.add(label_2);
		
		textField_num2 = new JTextField();
		textField_num2.setColumns(10);
		textField_num2.setBackground(SystemColor.menu);
		textField_num2.setBounds(371, 103, 75, 36);
		panel_4.add(textField_num2);
		
		JLabel label_3 = new JLabel("\u5B66\u5E74\u7B2C");
		label_3.setFont(new Font("宋体", Font.PLAIN, 26));
		label_3.setBounds(445, 103, 84, 34);
		panel_4.add(label_3);
		
		textField_num3 = new JTextField();
		textField_num3.setColumns(10);
		textField_num3.setBackground(SystemColor.menu);
		textField_num3.setBounds(525, 103, 75, 36);
		panel_4.add(textField_num3);
		
		JLabel label_4 = new JLabel("\u5B66\u671F");
		label_4.setFont(new Font("宋体", Font.PLAIN, 26));
		label_4.setBounds(601, 103, 61, 34);
		panel_4.add(label_4);
		
		textField_intended = new JTextField();
		textField_intended.setColumns(10);
		textField_intended.setBounds(304, 157, 405, 36);
		panel_4.add(textField_intended);
		
		textField_name_class = new JTextField();
		textField_name_class.setColumns(10);
		textField_name_class.setBounds(304, 193, 142, 39);
		panel_4.add(textField_name_class);
		
		textField_phone = new JTextField();
		textField_phone.setColumns(10);
		textField_phone.setBounds(551, 193, 158, 39);
		panel_4.add(textField_phone);
		
		textField_purpose = new JTextField();
		textField_purpose.setColumns(10);
		textField_purpose.setBounds(304, 233, 405, 39);
		panel_4.add(textField_purpose);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("宋体", Font.PLAIN, 29));
		textPane.setText("\u8BFE\u5BA4\u7533\u8BF7");
		textPane.setBackground(SystemColor.control);
		textPane.setBounds(371, 56, 122, 39);
		panel_4.add(textPane);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBackground(SystemColor.control);
		textPane_2.setFont(new Font("宋体", Font.PLAIN, 20));
		textPane_2.setText("\u2014");
		textPane_2.setBounds(350, 103, 20, 30);
		panel_4.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBackground(SystemColor.control);
		textPane_3.setFont(new Font("宋体", Font.PLAIN, 23));
		textPane_3.setText("\u5B66\u5E74\u7B2C");
		textPane_3.setBounds(446, 103, 75, 36);
		panel_4.add(textPane_3);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(SystemColor.control);
		textPane_1.setFont(new Font("宋体", Font.PLAIN, 23));
		textPane_1.setText("\u5B66\u671F");
		textPane_1.setBounds(603, 103, 63, 36);
		panel_4.add(textPane_1);
		
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				   class_num1 =textField_num1.getText();
				   class_num2 =textField_num2.getText();
				  class_num3 =textField_num3.getText();
				   class_intended =textField_intended.getText();
				   class_name =textField_name_class.getText();
				   class_phone =textField_phone.getText();
				  class_purpose =textField_purpose.getText();
				   ClassOutput docc =new ClassOutput();
	                try {
						docc.createWord();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					changeFrame(new DownloadClass());
				panel.removeAll();
				button_2.setVisible(false);
				panel.add(new Request());
				panel.updateUI();

			}
		
		});
	}
}
