package WindowBuilder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.util.Scanner;

import ClassLibrary.LogOffice;
import ClassLibrary.User;
import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	public static LogOffice l;
	JPanel panel;
	public static User user;
	public static JLabel lblNewLabel;
	public static JTextField textField;
	public static JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		UIUtils.setPreferredLookAndFeel();
		NativeInterface.open();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//NativeInterface.runEventPump();
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		frame.setVisible(true);
		//String VC="";	
		l=new LogOffice();
		l.SetVCImage();
		//System.out.println("请输入验证码: ");
		//VC=new Scanner(System.in).nextLine();
		//l.setVC(VC);
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
		
		panel = new JPanel();
		panel.setBounds(281, 97, 444, 314);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u8BF7\u4F7F\u7528\u6559\u52A1\u5904\u8D26\u53F7\u5BC6\u7801\u767B\u9646");
		label.setForeground(Color.RED);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(97, 27, 265, 18);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u5B66\u53F7\uFF1A");
		label_1.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		label_1.setBounds(53, 66, 60, 18);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801\uFF1A");
		label_2.setFont(new Font("ËÎÌå", Font.PLAIN, 20));
		label_2.setBounds(51, 117, 60, 18);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(143, 65, 173, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 116, 173, 24);
		panel.add(passwordField);
		
		JCheckBox checkBox = new JCheckBox("\u8BB0\u4F4F\u5BC6\u7801");
		checkBox.setBounds(171, 204, 133, 27);
		panel.add(checkBox);
		
		JButton btnNewButton = new JButton("\u767B\u9646");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//创建用户对象
				user=new User();
				if (l.Login(user.GetAccount(),user.GetPassward(),textField_1.getText())) {
					MainInterface l = new MainInterface();
					frame.dispose();
					/*
					//擦看成绩
					try {
						HtmlPage page=LogOffice.client.getPage("https://jwxt.jnu.edu.cn/Secure/Cjgl/Cjgl_Cjcx_WdCj.aspx");
						String pageXml = page.asXml();
						System.out.println(pageXml);
						HtmlElement cx_btn=(HtmlElement)page.getFirstByXPath("//*[@id=\"lbtnQuery\"]");
						HtmlPage page2=cx_btn.click();
						System.out.println(page2.asXml());
					} catch (FailingHttpStatusCodeException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					} catch (MalformedURLException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					*/
				}else {
					//System.out.println("登录失败");
					//登录失败显示一个弹窗表示登录失败，并刷新验证码图片。
					JOptionPane.showMessageDialog(panel, "\u4fe1\u606f\u586b\u5199\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u586b\u5199\uff01", "提示",JOptionPane.WARNING_MESSAGE);  
					//frame.add(dialog);
					l.SetVCImage();
					panel.updateUI();
				}
			}
		});
		btnNewButton.setBounds(161, 240, 113, 27);
		panel.add(btnNewButton);
		
		JLabel label_3 = new JLabel("\u9a8c\u8bc1\u7801\uff1a");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_3.setBounds(51, 163, 80, 18);
		panel.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 162, 173, 24);
		panel.add(textField_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(323, 165, 72, 18);
		panel.add(lblNewLabel);
	}
}
