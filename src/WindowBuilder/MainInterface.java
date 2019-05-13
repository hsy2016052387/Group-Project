package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Choice;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;

import ClassLibrary.*;
import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;

public class MainInterface {
	static JPanel panel = new JPanel();
	static logClass logClass = new logClass();
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		UIUtils.setPreferredLookAndFeel();
		NativeInterface.open();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface window = new MainInterface();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		NativeInterface.runEventPump();
	}

	/**
	 * Create the application.
	 */
	public MainInterface() {
		
		initialize();
		try {
			new NewsInfoCreate().start();
			new CollegeInfoCreate().start();
			new WorkInfoCreate().start();
		} catch (Exception e) {
			// TODO: handle exception
			new NewsInfoCreate().start();
			new CollegeInfoCreate().start();
			new WorkInfoCreate().start();
		}
		
		frame.setVisible(true);  
		//test
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel mainInterface = new JPanel();
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle("\u66A8\u5357\u5927\u5B66\u73E0\u6D77\u6821\u533A\u81EA\u52A9\u8F6F\u4EF6");
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 524);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		mainInterface.setBackground(Color.WHITE);
		mainInterface.setBounds(0, 0, 982, 524);
		panel.add(mainInterface);														
		mainInterface.setLayout(null);
		
		
		JLabel label = new JLabel("\u5C31\u4E1A\u4FE1\u606F");
		label.setForeground(Color.BLACK);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(162, 57, 113, 40);
		mainInterface.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(497, 88, 130, 367);
		mainInterface.add(separator);
		
		JLabel lblNewLabel = new JLabel("\u6821\u56ED\u65B0\u95FB");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(661, 57, 113, 40);
		mainInterface.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u519C\u884C\u5E7F\u4E1C\u7701\u5206\u884C2019\u6625\u5B63\u6821\u56ED\u62DB\u8058\u516C\u544A");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				panel.removeAll();
				panel.add(new WorkDetail());
				panel.updateUI();
			}
		});
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(29, 151, 424, 30);
		mainInterface.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("\u65F6\u4EE3\u4E2D\u56FD2019\u6625\u5B63\u6821\u56ED\u62DB\u8058\u516C\u544A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 17));
		label_1.setBounds(29, 221, 424, 30);
		mainInterface.add(label_1);
		
		JLabel lblyoung = new JLabel("\u5E7F\u53D1\u53612019\u6625\u5B63\u6821\u56ED\u2014\u2014\u4E0D\u4E00young\u7684\u7CBE\u5F69");
		lblyoung.setFont(new Font("宋体", Font.PLAIN, 17));
		lblyoung.setBounds(29, 302, 424, 30);
		mainInterface.add(lblyoung);
		
		JLabel label_3 = new JLabel("\u66F4\u591A");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				logClass.printlog("点击了更多就业信息");
				panel.removeAll();
				panel.add(new WorkInfo());
				panel.updateUI();
			}
		});
		label_3.setForeground(new Color(100, 149, 237));
		label_3.setBounds(329, 375, 72, 18);
		mainInterface.add(label_3);
		
		JLabel label_4 = new JLabel("\u6211\u6821\u83B7\u62795\u9879\u56FD\u5BB6\u865A\u62DF\u4EFF\u771F\u5B9E\u9A8C\u6559\u5B66\u9879\u76EE");
		label_4.setFont(new Font("宋体", Font.PLAIN, 17));
		label_4.setBounds(544, 151, 424, 30);
		mainInterface.add(label_4);
		
		JLabel label_5 = new JLabel("\u3010\u8FC8\u5411\u9AD8\u6C34\u5E73\u3011\u6211\u682111\u9879\u6210\u679C\u83B7\u5E7F\u4E1C\u7701\u79D1\u5B66\u6280\u672F\u5956");
		label_5.setFont(new Font("宋体", Font.PLAIN, 17));
		label_5.setBounds(544, 221, 424, 30);
		mainInterface.add(label_5);
		
		JLabel label_7 = new JLabel("\u66F4\u591A");
		label_7.setForeground(new Color(100, 149, 237));
		label_7.setBounds(856, 375, 72, 18);
		mainInterface.add(label_7);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u67E5\u8BE2");
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u5C31\u4E1A\u4FE1\u606F\r\n");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				
				logClass.printlog("点击了就业信息");
				
				panel.removeAll();
				panel.add(new WorkInfo());
				panel.updateUI();
			}
		});
		
		mntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u6821\u56ED\u65B0\u95FB");
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				logClass.printlog("点击了校园新闻");
				
				
				panel.removeAll();
				panel.add(new News());
				panel.updateUI();
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u5B66\u6821\u901A\u77E5");
		mntmNewMenuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				logClass.printlog("点击了学校通知");
				
				panel.removeAll();
				panel.add(new Notification());
				panel.updateUI();
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u7535\u8D39\u996D\u5361\u4F59\u989D");
		mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				logClass.printlog("点击了电费饭卡余额");
				
				panel.removeAll();
				panel.add(new Balance());
				panel.updateUI();
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("\u6587\u6863");
		mnNewMenu_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u4E0B\u8F7D\u6587\u6863\u6A21\u677F");
		mntmNewMenuItem_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				logClass.printlog("点击了下载文档模板");
				panel.removeAll();
				panel.add(new Template());
				panel.updateUI();
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\u586B\u5199\u8BF7\u5047\u6761");
		mntmNewMenuItem_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				logClass.printlog("点击了填写请假条");
				panel.removeAll();
				panel.add(new Request());
				panel.updateUI();
			}
		});
		mntmNewMenuItem_6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_2 = new JMenu("\u8BFE\u7A0B\r\n");
		mnNewMenu_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u67E5\u8BE2\u6210\u7EE9");
		mntmNewMenuItem_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				logClass.printlog("点击了查询成绩");
				panel.removeAll();
				panel.add(new SeekGrade());
				panel.updateUI();
			}
		});
		mntmNewMenuItem_5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem menuItem = new JMenuItem("\u67E5\u8BE2\u57F9\u517B\u65B9\u6848");
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				logClass.printlog("点击了查询培养方案");
				panel.removeAll();
				panel.add(new SeekTrainPlan());
				panel.updateUI();
			}
		});
		menuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu_2.add(menuItem);
		
		JMenu mnNewMenu_3 = new JMenu("\u8BBA\u575B");
		mnNewMenu_3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("\u5BF9\u63A5\u5B66\u6821\u8BBA\u575B");
		mntmNewMenuItem_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				logClass.printlog("点击了对接学校论坛");
				panel.removeAll();
				panel.add(new BrowserPanel("http://tieba.baidu.com/f?kw=%F4%DF%C4%CF%B4%F3%D1%A7&fr=ala0&tpl=5"));
				panel.updateUI();
			}
		});
		mntmNewMenuItem_8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		JPanel panel_3 = new JPanel();
		menuBar.add(panel_3);
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(null);
		
		JButton button_1 = new JButton("\u4E3B\u754C\u9762");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				logClass.printlog("点击了主页面按钮");
				
				panel.removeAll();
				panel.add(mainInterface);
				panel.updateUI();
			}
		});
		button_1.setBounds(219, 1, 113, 30);
		panel_3.add(button_1);
		
		JLabel label_2 = new JLabel("\u9EC4\u9882\u626C");
		label_2.setFont(new Font("宋体", Font.PLAIN, 17));
		label_2.setBounds(555, 0, 72, 27);
		panel_3.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i = comboBox.getSelectedIndex();
				switch (i) {
				case 0:
					break;
				case 1:
					logClass.printlog("点击了个人信息设置");
					panel.removeAll();
					panel.add(new PersonInfo());
					panel.updateUI();
					break;
				case 2:
					logClass.printlog("点击了账号密码管理");
					panel.removeAll();
					panel.add(new PassWord());
					panel.updateUI();
					break;
				case 3:
					logClass.printlog("点击了退出登录");
					panel.removeAll();
					frame.dispose();
					Login log_in = new Login();
					break;
				default:
					break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "\u4E2A\u4EBA\u4FE1\u606F\u8BBE\u7F6E", "\u8D26\u53F7\u5BC6\u7801\u7BA1\u7406", "\u9000\u51FA\u767B\u5F55"}));
		comboBox.setBounds(614, 1, 119, 24);
		panel_3.add(comboBox);
	}
}