package WindowBuilder;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.SearchContext;

import com.sun.glass.ui.Menu;
import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;

import ClassLibrary.CollegeNotiCrawer;
import ClassLibrary.DeptNotiCrawer;
import ClassLibrary.MoreCollegeNotiCrawer;
import ClassLibrary.NewsCrawer;
import ClassLibrary.SchoolNotiCrawer;
import ClassLibrary.TextFieldHintListener;
import ClassLibrary.CollegeNotiCrawer;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.Choice;
import javax.swing.JComboBox;
import java.awt.Canvas;
import java.util.*;

public class Notification extends JPanel {

	/**
	 * Create the panel.
	 */
	private int page = 0;
	private static ArrayList<String> title = new ArrayList<String>();
	private static ArrayList<String> date = new ArrayList<String>();
	private static ArrayList<String> noticontent = new ArrayList<String>();
	private JTextField textField;
	
	private void change(ArrayList<String> List1, ArrayList<String> List2, ArrayList<String> List3) {
		title = List1;
		date = List2;
		noticontent = List3;
	}
	
	
	
	public Notification() {
		
		change(SchoolNotiCrawer.SchoolNotiList, SchoolNotiCrawer.dateList,SchoolNotiCrawer.contentlist);
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel All = new JPanel();
		All.setLayout(null);
		All.setBackground(Color.WHITE);
		All.setBounds(0, 0, 982, 530);
		add(All);
		
		JPanel changebutton = new JPanel();
		changebutton.setLayout(null);
		changebutton.setBackground(Color.WHITE);
		changebutton.setBounds(26, 153, 239, 311);
		All.add(changebutton);
		
		JButton schoolbutton = new JButton("\u5B66\u6821\u901A\u77E5");
		schoolbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		schoolbutton.setFont(new Font("����", Font.PLAIN, 18));
		schoolbutton.setBounds(38, 52, 163, 60);
		changebutton.add(schoolbutton);
		
		JButton collegebutton = new JButton("\u5B66\u9662\u901A\u77E5");
		collegebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		collegebutton.setFont(new Font("����", Font.PLAIN, 18));
		
		collegebutton.setBounds(38, 112, 163, 60);
		collegebutton.setToolTipText("\u5355\u51fb\u67e5\u770b\u672c\u5b66\u9662\u901a\u77e5\uff0c\u53f3\u952e\u53ef\u67e5\u770b\u5176\u4ed6\u5b66\u9662");
		changebutton.add(collegebutton);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(collegebutton, popupMenu);
		
		JMenuItem TranMenuItem = new JMenuItem("\u7ffb\u8bd1\u5b66\u9662");
		popupMenu.add(TranMenuItem);
		
		JMenuItem BusiMenuItem = new JMenuItem("\u56fd\u9645\u5546\u5b66\u9662");
		popupMenu.add(BusiMenuItem);
		
		JMenuItem PackMenuItem = new JMenuItem("\u5305\u88c5\u5de5\u7a0b\u5b66\u9662");
		popupMenu.add(PackMenuItem);
		
		JMenuItem rwMenuItem = new JMenuItem("\u4eba\u6587\u5b66\u9662");
		popupMenu.add(rwMenuItem);
		
		if(MainInterface.userInfo.getCollege().equals("\u7ffb\u8bd1\u5b66\u9662")) 
			popupMenu.remove(0);
		else if(MainInterface.userInfo.getCollege().equals("\u56fd\u9645\u5546\u5b66\u9662"))
			popupMenu.remove(1); 
		else if(MainInterface.userInfo.getCollege().equals("\u7535\u6c14\u4fe1\u606f\u5b66\u9662")) 
			popupMenu.remove(2);
		else if(MainInterface.userInfo.getCollege().equals("\u4eba\u6587\u5b66\u9662"))
			popupMenu.remove(3);
		
		JButton deptbutton = new JButton("\u6559\u52A1\u5904\u901A\u77E5");
		
		
		deptbutton.setFont(new Font("����", Font.PLAIN, 18));
		deptbutton.setBounds(38, 172, 163, 60);
		changebutton.add(deptbutton);
		
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(null);
		searchPanel.setBackground(Color.WHITE);
		searchPanel.setBounds(0, 0, 968, 92);
		All.add(searchPanel);
		
		textField = new JTextField();
		textField.setBounds(33, 13, 220, 24);
		textField.addFocusListener(new TextFieldHintListener(textField, "\u8bf7\u8f93\u5165\u641c\u7d22\u5185\u5bb9"));
		textField.setColumns(10);
		searchPanel.add(textField);
		
		
		JLabel label_11 = new JLabel("\u5e74");
		label_11.setBounds(398, 15, 20, 29);
		searchPanel.add(label_11);
		
				
		JLabel label_12 = new JLabel("\u6708");
		label_12.setBounds(544, 13, 20, 29);
		searchPanel.add(label_12);
		
		JLabel label_13 = new JLabel("\u65e5");
		label_13.setBounds(688, 13, 20, 29);
		searchPanel.add(label_13);
		
		JButton button_1 = new JButton("\u641c\u7d22");
		button_1.setBounds(759, 12, 74, 27);
		searchPanel.add(button_1);
		
		JComboBox<String> comboBox_year = new JComboBox<String>();
		comboBox_year.setBounds(275, 13, 120, 24);
		searchPanel.add(comboBox_year);
		comboBox_year.setBackground(Color.WHITE);
		Calendar calendar = Calendar.getInstance();
		comboBox_year.addItem("\u8bf7\u9009\u62e9\u5e74\u4efd");
		for(int i =2003;i<=calendar.get(Calendar.YEAR);i++) {
			comboBox_year.addItem(i+"");
		}
		
		JComboBox<String> comboBox_month = new JComboBox<String>();
		comboBox_month.setBounds(421, 13, 120, 24);
		searchPanel.add(comboBox_month);
		comboBox_month.setBackground(Color.WHITE);
		comboBox_month.addItem("\u8bf7\u9009\u62e9\u6708\u4efd");
		for(int i = 1; i < 10; i++) {
			comboBox_month.addItem("0"+i+"");
		}
		comboBox_month.addItem("10");
		comboBox_month.addItem("11");
		comboBox_month.addItem("12");
		
		JComboBox<String> comboBox_day = new JComboBox<String>();
		comboBox_day.setBounds(566, 13, 120, 24);
		searchPanel.add(comboBox_day);
		comboBox_day.setBackground(Color.WHITE);
		
		JButton reset = new JButton("\u91cd\u7f6e");
		reset.setBounds(858, 12, 74, 27);
		searchPanel.add(reset);
		
		JCheckBox CheckBox_school = new JCheckBox("\u5b66\u6821");
		CheckBox_school.setBounds(186, 56, 68, 27);
		searchPanel.add(CheckBox_school);
		
		JCheckBox checkBox_dept = new JCheckBox("\u6559\u52a1\u5904");
		checkBox_dept.setBounds(672, 56, 80, 27);
		searchPanel.add(checkBox_dept);
		
		JCheckBox checkBox_rw = new JCheckBox("\u4eba\u6587\u5b66\u9662");
		checkBox_rw.setBounds(254, 56, 94, 27);
		searchPanel.add(checkBox_rw);
		
		JCheckBox checkBox_fy = new JCheckBox("\u7ffb\u8bd1\u5b66\u9662");
		checkBox_fy.setBounds(348, 56, 94, 27);
		searchPanel.add(checkBox_fy);
		
		JCheckBox checkBox_gjs = new JCheckBox("\u56fd\u9645\u5546\u5b66\u9662");
		checkBox_gjs.setBounds(442, 56, 103, 27);
		searchPanel.add(checkBox_gjs);
		
		JCheckBox checkBox_bz = new JCheckBox("\u5305\u88c5\u5de5\u7a0b\u5b66\u9662");
		checkBox_bz.setBounds(545, 56, 127, 27);
		searchPanel.add(checkBox_bz);
		
		JLabel label_14 = new JLabel("\u8bf7\u9009\u62e9\u60f3\u67e5\u8be2\u8303\u56f4\uff1a");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setBounds(33, 60, 144, 18);
		searchPanel.add(label_14);
		
		JButton button_2 = new JButton("\u5168\u9009");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CheckBox_school.setSelected(true);
				checkBox_rw.setSelected(true);
				checkBox_fy.setSelected(true);
				checkBox_gjs.setSelected(true);
				checkBox_bz.setSelected(true);
				checkBox_dept.setSelected(true);
			}
		});
		button_2.setBounds(759, 56, 74, 27);
		searchPanel.add(button_2);
		
		JButton button_3 = new JButton("\u53cd\u9009");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckBox_school.setSelected(CheckBox_school.isSelected()?false:true);
				checkBox_rw.setSelected(checkBox_rw.isSelected()?false:true);
				checkBox_fy.setSelected(checkBox_fy.isSelected()?false:true);
				checkBox_gjs.setSelected(checkBox_gjs.isSelected()?false:true);
				checkBox_bz.setSelected(checkBox_bz.isSelected()?false:true);
				checkBox_dept.setSelected(checkBox_dept.isSelected()?false:true);
			}
		});
		button_3.setBounds(858, 56, 74, 27);
		searchPanel.add(button_3);
		
		reset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("\u8bf7\u8f93\u5165\u641c\u7d22\u5185\u5bb9");
				comboBox_year.setSelectedIndex(0);
				comboBox_month.setSelectedIndex(0);
				comboBox_day.setSelectedIndex(0);
			}
		});
		comboBox_day.addItem("\u8bf7\u9009\u62e9\u65e5\u671f");
		for(int i = 1; i < 10; i++) {
			comboBox_day.addItem("0"+i+"");
		}
		for(int i = 10; i < 32; i++) {
			comboBox_day.addItem(i+"");
		}
				
						
			
		JPanel panel = new JPanel();
		panel.setBounds(299, 118, 645, 399);
		All.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\u5b66\u6821\u901a\u77e5");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.BOLD, 24));
		label.setBounds(36, 13, 213, 37);
		panel.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(36, 76, 376, 37);
		label_1.setText(title.get(0));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setForeground(new Color(100, 149, 237));
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(487, 76, 144, 37);
		label_2.setText(date.get(0));
		panel.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(36, 126, 376, 37);
		label_3.setText(title.get(1));
		panel.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setForeground(new Color(100, 149, 237));
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(487, 126, 144, 37);
		label_4.setText(date.get(1));
		panel.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(36, 176, 376, 37);
		label_5.setText(title.get(2));
		panel.add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setForeground(new Color(100, 149, 237));
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(487, 176, 144, 37);
		label_6.setText(date.get(2));
		panel.add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		label_7.setBounds(36, 226, 376, 37);
		label_7.setText(title.get(3));
		panel.add(label_7);
		
		JLabel label_8 = new JLabel();
		label_8.setFont(new Font("宋体", Font.PLAIN, 18));
		label_8.setBounds(36, 276, 376, 37);
		label_8.setText(title.get(4));
		panel.add(label_8);
		
		JLabel label_9 = new JLabel();
		label_9.setForeground(new Color(100, 149, 237));
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		label_9.setBounds(487, 226, 144, 37);
		label_9.setText(date.get(3));
		panel.add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setForeground(new Color(100, 149, 237));
		label_10.setFont(new Font("宋体", Font.PLAIN, 18));
		label_10.setBounds(487, 276, 144, 37);
		label_10.setText(date.get(4));
		panel.add(label_10);
		
		JButton btnNewButton = new JButton("\u4e0a\u4e00\u9875");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(page>0) {
					page--;
					label_1.setText(title.get(page*5+0));
					label_3.setText(title.get(page*5+1));
					label_5.setText(title.get(page*5+2));
					label_7.setText(title.get(page*5+3));
					label_8.setText(title.get(page*5+4));
					label_2.setText(date.get(page*5+0));
					label_4.setText(date.get(page*5+1));
					label_6.setText(date.get(page*5+2));
					label_9.setText(date.get(page*5+3));
					label_10.setText(date.get(page*5+4));
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		btnNewButton.setBounds(121, 362, 113, 27);
		panel.add(btnNewButton);
		
		JButton button = new JButton("\u4e0b\u4e00\u9875");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int curr = (page+2)*5;
				if(title.size()>curr){
					page++;
					label_1.setText(title.get(page*5+0));
					label_3.setText(title.get(page*5+1));
					label_5.setText(title.get(page*5+2));
					label_7.setText(title.get(page*5+3));
					label_8.setText(title.get(page*5+4));
					label_2.setText(date.get(page*5+0));
					label_4.setText(date.get(page*5+1));
					label_6.setText(date.get(page*5+2));
					label_9.setText(date.get(page*5+3));
					label_10.setText(date.get(page*5+4));
				}
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setBounds(363, 362, 113, 27);
		panel.add(button);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 982, 530);
		//add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JTextArea content = new JTextArea();
		content.setLineWrap(true);
		content.setEditable(false);
		content.setText("");
		scrollPane.setViewportView(content);
		content.setFont(new Font("宋体", Font.PLAIN, 18));
		
		JPanel panel_6 = new JPanel();
		scrollPane.setColumnHeaderView(panel_6);
		
		JLabel label_26 = new JLabel("\u5173\u4E8E\u5347\u7EA7\u7535\u5B50\u90AE\u7BB1\u7CFB\u7EDF\u7684\u901A\u77E5     ");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("宋体", Font.PLAIN, 18));
		label_26.setBackground(Color.WHITE);
		panel_6.add(label_26);
		
		JLabel label_27 = new JLabel("\u8FD4\u56DE");
		
		
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(label_27);
		
		label_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				All.removeAll();
				All.add(changebutton);
				All.add(searchPanel);
				All.add(panel);
				All.updateUI();
			}
		});
		
		
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(noticontent.get(page*5+0));
				content.setCaretPosition(0);
				label_26.setText(title.get(page*5+0));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(noticontent.get(page*5+1));
				content.setCaretPosition(0);
				label_26.setText(title.get(page*5+1));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(noticontent.get(page*5+2));
				content.setCaretPosition(0);
				label_26.setText(title.get(page*5+2));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(noticontent.get(page*5+3));
				content.setCaretPosition(0);
				label_26.setText(title.get(page*5+3));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(noticontent.get(page*5+4));
				content.setCaretPosition(0);
				label_26.setText(title.get(page*5+4));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		schoolbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				label.setText("\u5b66\u6821\u901a\u77e5");
				change(SchoolNotiCrawer.SchoolNotiList, SchoolNotiCrawer.dateList,SchoolNotiCrawer.contentlist);
				page = 0;
				label_1.setText(title.get(page*5+0));
				label_3.setText(title.get(page*5+1));
				label_5.setText(title.get(page*5+2));
				label_7.setText(title.get(page*5+3));
				label_8.setText(title.get(page*5+4));
				label_2.setText(date.get(page*5+0));
				label_4.setText(date.get(page*5+1));
				label_6.setText(date.get(page*5+2));
				label_9.setText(date.get(page*5+3));
				label_10.setText(date.get(page*5+4));
			}
		});
		
		collegebutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<String> NList = new ArrayList<>();
	        	ArrayList<String> DList = new ArrayList<>();
	        	ArrayList<String> CList = new ArrayList<>();
				label.setText("\u5b66\u9662\u901a\u77e5");
				if(MainInterface.userInfo.getCollege().equals("\u7ffb\u8bd1\u5b66\u9662")) {
					for(int i = 0;i<MoreCollegeNotiCrawer.fnum;i++) {
						NList.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
						DList.add(MoreCollegeNotiCrawer.dateList.get(i));
						CList.add(MoreCollegeNotiCrawer.contentlist.get(i));
					}
							
					change(NList,DList,CList);
					page = 0;
					label_1.setText(title.get(page*5+0));
					label_3.setText(title.get(page*5+1));
					label_5.setText(title.get(page*5+2));
					label_7.setText(title.get(page*5+3));
					label_8.setText(title.get(page*5+4));
					label_2.setText(date.get(page*5+0));
					label_4.setText(date.get(page*5+1));
					label_6.setText(date.get(page*5+2));
					label_9.setText(date.get(page*5+3));
					label_10.setText(date.get(page*5+4));
					
				}
				else if(MainInterface.userInfo.getCollege().equals("\u56fd\u9645\u5546\u5b66\u9662")) {
					for(int i = MoreCollegeNotiCrawer.fnum;i<MoreCollegeNotiCrawer.snum;i++) {
						NList.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
						DList.add(MoreCollegeNotiCrawer.dateList.get(i));
						CList.add(MoreCollegeNotiCrawer.contentlist.get(i));
					}
					change(NList,DList,CList);
					page = 0;
					label_1.setText(title.get(page*5+0));
					label_3.setText(title.get(page*5+1));
					label_5.setText(title.get(page*5+2));
					label_7.setText(title.get(page*5+3));
					label_8.setText(title.get(page*5+4));
					label_2.setText(date.get(page*5+0));
					label_4.setText(date.get(page*5+1));
					label_6.setText(date.get(page*5+2));
					label_9.setText(date.get(page*5+3));
					label_10.setText(date.get(page*5+4));
				}
				else if(MainInterface.userInfo.getCollege().equals("\u7535\u6c14\u4fe1\u606f\u5b66\u9662")) {
					for(int i = MoreCollegeNotiCrawer.snum;i<MoreCollegeNotiCrawer.dateList.size();i++) {
						NList.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
						DList.add(MoreCollegeNotiCrawer.dateList.get(i));
						CList.add(MoreCollegeNotiCrawer.contentlist.get(i));
					}
					change(NList,DList,CList);
					page = 0;
					label_1.setText(title.get(page*5+0));
					label_3.setText(title.get(page*5+1));
					label_5.setText(title.get(page*5+2));
					label_7.setText(title.get(page*5+3));
					label_8.setText(title.get(page*5+4));
					label_2.setText(date.get(page*5+0));
					label_4.setText(date.get(page*5+1));
					label_6.setText(date.get(page*5+2));
					label_9.setText(date.get(page*5+3));
					label_10.setText(date.get(page*5+4));
				}
				else if(MainInterface.userInfo.getCollege().equals("\u4eba\u6587\u5b66\u9662")){
            		change(CollegeNotiCrawer.CollegeNotiList, CollegeNotiCrawer.dateList,CollegeNotiCrawer.contentlist);
            		page = 0;
            		label_1.setText(title.get(page*5+0));
            		label_3.setText(title.get(page*5+1));
            		label_5.setText(title.get(page*5+2));
            		label_7.setText(title.get(page*5+3));
            		label_8.setText(title.get(page*5+4));
            		label_2.setText(date.get(page*5+0));
            		label_4.setText(date.get(page*5+1));
            		label_6.setText(date.get(page*5+2));
            		label_9.setText(date.get(page*5+3));
            		label_10.setText(date.get(page*5+4));
				}
				
			}
		});
		
		
		deptbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setText("\u6559\u52a1\u5904\u901a\u77e5");
				change(DeptNotiCrawer.DeptNotiList, DeptNotiCrawer.dateList, DeptNotiCrawer.contentlist);
				page = 0;
				label_1.setText(title.get(page*5+0));
				label_3.setText(title.get(page*5+1));
				label_5.setText(title.get(page*5+2));
				label_7.setText(title.get(page*5+3));
				label_8.setText(title.get(page*5+4));
				label_2.setText(date.get(page*5+0));
				label_4.setText(date.get(page*5+1));
				label_6.setText(date.get(page*5+2));
				label_9.setText(date.get(page*5+3));
				label_10.setText(date.get(page*5+4));
				
			}
		});
		
		
		ActionListener actionListener = new ActionListener() {
			 
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            // TODO Auto-generated method stub
	        	ArrayList<String> NList = new ArrayList<>();
	        	ArrayList<String> DList = new ArrayList<>();
	        	ArrayList<String> CList = new ArrayList<>();
	        	if (e.getSource() == TranMenuItem) {
					label.setText("\u7ffb\u8bd1\u5b66\u9662\u901a\u77e5");
					for(int i = 0;i<MoreCollegeNotiCrawer.fnum;i++) {
						NList.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
						DList.add(MoreCollegeNotiCrawer.dateList.get(i));
						CList.add(MoreCollegeNotiCrawer.contentlist.get(i));
					}
							
					change(NList,DList,CList);
					page = 0;
					label_1.setText(title.get(page*5+0));
					label_3.setText(title.get(page*5+1));
					label_5.setText(title.get(page*5+2));
					label_7.setText(title.get(page*5+3));
					label_8.setText(title.get(page*5+4));
					label_2.setText(date.get(page*5+0));
					label_4.setText(date.get(page*5+1));
					label_6.setText(date.get(page*5+2));
					label_9.setText(date.get(page*5+3));
					label_10.setText(date.get(page*5+4));
	            }
	        	if (e.getSource() == BusiMenuItem) {
					label.setText("\u56fd\u9645\u5546\u5b66\u9662\u901a\u77e5");
					for(int i = MoreCollegeNotiCrawer.fnum;i<MoreCollegeNotiCrawer.snum;i++) {
						NList.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
						DList.add(MoreCollegeNotiCrawer.dateList.get(i));
						CList.add(MoreCollegeNotiCrawer.contentlist.get(i));
					}
					change(NList,DList,CList);
					page = 0;
					label_1.setText(title.get(page*5+0));
					label_3.setText(title.get(page*5+1));
					label_5.setText(title.get(page*5+2));
					label_7.setText(title.get(page*5+3));
					label_8.setText(title.get(page*5+4));
					label_2.setText(date.get(page*5+0));
					label_4.setText(date.get(page*5+1));
					label_6.setText(date.get(page*5+2));
					label_9.setText(date.get(page*5+3));
					label_10.setText(date.get(page*5+4));
	            }
	            if (e.getSource() == PackMenuItem) {
					label.setText("\u5305\u88c5\u5de5\u7a0b\u5b66\u9662\u901a\u77e5");
					for(int i = MoreCollegeNotiCrawer.snum;i<MoreCollegeNotiCrawer.dateList.size();i++) {
						NList.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
						DList.add(MoreCollegeNotiCrawer.dateList.get(i));
						CList.add(MoreCollegeNotiCrawer.contentlist.get(i));
					}
					change(NList,DList,CList);
					page = 0;
					label_1.setText(title.get(page*5+0));
					label_3.setText(title.get(page*5+1));
					label_5.setText(title.get(page*5+2));
					label_7.setText(title.get(page*5+3));
					label_8.setText(title.get(page*5+4));
					label_2.setText(date.get(page*5+0));
					label_4.setText(date.get(page*5+1));
					label_6.setText(date.get(page*5+2));
					label_9.setText(date.get(page*5+3));
					label_10.setText(date.get(page*5+4));
	            }
	            if(e.getSource() == rwMenuItem) {
	            	System.out.println("123");
	            	label.setText("\u4eba\u6587\u5b66\u9662\u901a\u77e5");
            		change(CollegeNotiCrawer.CollegeNotiList, CollegeNotiCrawer.dateList,CollegeNotiCrawer.contentlist);
            		page = 0;
            		label_1.setText(title.get(page*5+0));
            		label_3.setText(title.get(page*5+1));
            		label_5.setText(title.get(page*5+2));
            		label_7.setText(title.get(page*5+3));
            		label_8.setText(title.get(page*5+4));
            		label_2.setText(date.get(page*5+0));
            		label_4.setText(date.get(page*5+1));
            		label_6.setText(date.get(page*5+2));
            		label_9.setText(date.get(page*5+3));
            		label_10.setText(date.get(page*5+4));
	            }
	        }
	    };
		
	    
	    TranMenuItem.addActionListener(actionListener);
	    BusiMenuItem.addActionListener(actionListener);
		PackMenuItem.addActionListener(actionListener);
		rwMenuItem.addActionListener(actionListener);
		

		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ArrayList<String> searchtitle = new ArrayList<String>();
				ArrayList<String> searchdate = new ArrayList<String>();
				ArrayList<String> searchnoticontent = new ArrayList<String>();
				ArrayList<String> searchtitle_sch = new ArrayList<String>();
				ArrayList<String> searchnoticontent_sch = new ArrayList<String>();
				ArrayList<String> searchtitle_rw = new ArrayList<String>();
				ArrayList<String> searchnoticontent_rw = new ArrayList<String>();
				ArrayList<String> searchtitle_dept = new ArrayList<String>();
				ArrayList<String> searchnoticontent_dept = new ArrayList<String>();
				ArrayList<String> searchtitle_fy = new ArrayList<String>();
				ArrayList<String> searchnoticontent_fy = new ArrayList<String>();
				ArrayList<String> searchtitle_gjs = new ArrayList<String>();
				ArrayList<String> searchnoticontent_gjs = new ArrayList<String>();
				ArrayList<String> searchtitle_bz = new ArrayList<String>();
				ArrayList<String> searchnoticontent_bz = new ArrayList<String>();
				String searchtext = textField.getText();
				String year = new String("");
				String month = new String("");
				String day = new String("");
				StringBuilder datesb = new StringBuilder();
				if(!comboBox_year.getSelectedItem().equals("\u8bf7\u9009\u62e9\u5e74\u4efd")) {
					year = (String) comboBox_year.getSelectedItem();
					datesb.append(year);
				}
				if(!comboBox_month.getSelectedItem().equals("\u8bf7\u9009\u62e9\u6708\u4efd")) {;
					month = (String) comboBox_month.getSelectedItem();
					datesb.append("-");
					datesb.append(month);
				}
				if(!comboBox_day.getSelectedItem().equals("\u8bf7\u9009\u62e9\u65e5\u671f")) {
					day = (String) comboBox_day.getSelectedItem();
					datesb.append("-");
					datesb.append(day);
				}
				if(datesb.length()!=0 && !searchtext.equals("\u8bf7\u8f93\u5165\u641c\u7d22\u5185\u5bb9")) {
					if(CheckBox_school.isSelected()) {
						for(int i = 0;i<SchoolNotiCrawer.contentlist.size();i++) {
							if(SchoolNotiCrawer.dateList.get(i).contains(datesb)) {
								if(SchoolNotiCrawer.SchoolNotiList.get(i).contains(searchtext)||SchoolNotiCrawer.linkList.get(i).contains(searchtext)) {
									searchtitle_sch.add(SchoolNotiCrawer.SchoolNotiList.get(i));
									searchdate.add(SchoolNotiCrawer.dateList.get(i)+"1");
									searchnoticontent_sch.add(SchoolNotiCrawer.contentlist.get(i));
								}
							}
						}
					}
					if(checkBox_rw.isSelected()) {
						for(int i = 0;i<CollegeNotiCrawer.contentlist.size();i++) {
							if(CollegeNotiCrawer.dateList.get(i).contains(datesb)) {
								if(CollegeNotiCrawer.CollegeNotiList.get(i).contains(searchtext)||CollegeNotiCrawer.linkList.get(i).contains(searchtext)) {
									searchtitle_rw.add(CollegeNotiCrawer.CollegeNotiList.get(i));
									searchdate.add(CollegeNotiCrawer.dateList.get(i)+"2");
									searchnoticontent_rw.add(CollegeNotiCrawer.contentlist.get(i));
								}
							}
						}
					}
					if(checkBox_dept.isSelected()) {
						for(int i = 0;i<DeptNotiCrawer.contentlist.size();i++) {
							if(DeptNotiCrawer.dateList.get(i).contains(datesb)) {
								if(DeptNotiCrawer.DeptNotiList.get(i).contains(searchtext)||DeptNotiCrawer.linkList.get(i).contains(searchtext)) {
									searchtitle_dept.add(DeptNotiCrawer.DeptNotiList.get(i));
									searchdate.add(DeptNotiCrawer.dateList.get(i)+"3");
									searchnoticontent_dept.add(DeptNotiCrawer.contentlist.get(i));
								}
							}
						}
					}
					if(checkBox_fy.isSelected()) {
						for(int i = 0;i<MoreCollegeNotiCrawer.fnum;i++) {
							if(MoreCollegeNotiCrawer.dateList.get(i).contains(datesb)) {
								if(MoreCollegeNotiCrawer.CollegeNotiList.get(i).contains(searchtext)||MoreCollegeNotiCrawer.linkList.get(i).contains(searchtext)) {
									searchtitle_fy.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
									searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"4");
									searchnoticontent_fy.add(MoreCollegeNotiCrawer.contentlist.get(i));
								}
							}
						}
					}
					if(checkBox_gjs.isSelected()) {
						for(int i = MoreCollegeNotiCrawer.fnum;i<MoreCollegeNotiCrawer.snum;i++) {
							if(MoreCollegeNotiCrawer.dateList.get(i).contains(datesb)) {
								if(MoreCollegeNotiCrawer.CollegeNotiList.get(i).contains(searchtext)||MoreCollegeNotiCrawer.linkList.get(i).contains(searchtext)) {
									searchtitle_gjs.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
									searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"5");
									searchnoticontent_gjs.add(MoreCollegeNotiCrawer.contentlist.get(i));
								}
							}
						}
					}
					if(checkBox_bz.isSelected()) {
						for(int i = MoreCollegeNotiCrawer.snum;i<MoreCollegeNotiCrawer.contentlist.size();i++) {
							if(MoreCollegeNotiCrawer.dateList.get(i).contains(datesb)) {
								if(MoreCollegeNotiCrawer.CollegeNotiList.get(i).contains(searchtext)||MoreCollegeNotiCrawer.linkList.get(i).contains(searchtext)) {
									searchtitle_bz.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
									searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"6");
									searchnoticontent_bz.add(MoreCollegeNotiCrawer.contentlist.get(i));
								}
							}
						}
					}
				}
				else if(datesb.length()!=0 && searchtext.equals("\u8bf7\u8f93\u5165\u641c\u7d22\u5185\u5bb9")) {
					if(CheckBox_school.isSelected()) {
						for(int i = 0;i<SchoolNotiCrawer.contentlist.size();i++) {
							if(SchoolNotiCrawer.dateList.get(i).contains(datesb)) {
								searchtitle_sch.add(SchoolNotiCrawer.SchoolNotiList.get(i));
								searchdate.add(SchoolNotiCrawer.dateList.get(i)+"1");
								searchnoticontent_sch.add(SchoolNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_rw.isSelected()) {
						for(int i = 0;i<CollegeNotiCrawer.contentlist.size();i++) {
							if(CollegeNotiCrawer.dateList.get(i).contains(datesb)) {
									searchtitle_rw.add(CollegeNotiCrawer.CollegeNotiList.get(i));
									searchdate.add(CollegeNotiCrawer.dateList.get(i)+"2");
									searchnoticontent_rw.add(CollegeNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_dept.isSelected()) {
						for(int i = 0;i<DeptNotiCrawer.contentlist.size();i++) {
							if(DeptNotiCrawer.dateList.get(i).contains(datesb)) {
								searchtitle_dept.add(DeptNotiCrawer.DeptNotiList.get(i));
								searchdate.add(DeptNotiCrawer.dateList.get(i)+"3");
								searchnoticontent_dept.add(DeptNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_fy.isSelected()) {
						for(int i = 0;i<MoreCollegeNotiCrawer.fnum;i++) {
							if(MoreCollegeNotiCrawer.dateList.get(i).contains(datesb)) {	
								searchtitle_fy.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
								searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"4");
								searchnoticontent_fy.add(MoreCollegeNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_gjs.isSelected()) {
						for(int i = MoreCollegeNotiCrawer.fnum;i<MoreCollegeNotiCrawer.snum;i++) {
							if(MoreCollegeNotiCrawer.dateList.get(i).contains(datesb)) {
								searchtitle_gjs.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
								searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"5");
								searchnoticontent_gjs.add(MoreCollegeNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_bz.isSelected()) {
						for(int i = MoreCollegeNotiCrawer.snum;i<MoreCollegeNotiCrawer.contentlist.size();i++) {
							if(MoreCollegeNotiCrawer.dateList.get(i).contains(datesb)) {
								searchtitle_bz.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
								searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"6");
								searchnoticontent_bz.add(MoreCollegeNotiCrawer.contentlist.get(i));
							}
						}
					}
				}
				else if(datesb.length()==0 && !searchtext.equals("\u8bf7\u8f93\u5165\u641c\u7d22\u5185\u5bb9")) {
					if(CheckBox_school.isSelected()) {
						for(int i = 0;i<SchoolNotiCrawer.contentlist.size();i++) {
							if(SchoolNotiCrawer.SchoolNotiList.get(i).contains(searchtext)||SchoolNotiCrawer.linkList.get(i).contains(searchtext)) {
								searchtitle_sch.add(SchoolNotiCrawer.SchoolNotiList.get(i));
								searchdate.add(SchoolNotiCrawer.dateList.get(i)+"1");
								searchnoticontent_sch.add(SchoolNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_rw.isSelected()) {
						for(int i = 0;i<CollegeNotiCrawer.contentlist.size();i++) {
							if(CollegeNotiCrawer.CollegeNotiList.get(i).contains(searchtext)||CollegeNotiCrawer.linkList.get(i).contains(searchtext)) {
								searchtitle_rw.add(CollegeNotiCrawer.CollegeNotiList.get(i));
								searchdate.add(CollegeNotiCrawer.dateList.get(i)+"2");
								searchnoticontent_rw.add(CollegeNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_dept.isSelected()) {
						for(int i = 0;i<DeptNotiCrawer.contentlist.size();i++) {
							if(DeptNotiCrawer.DeptNotiList.get(i).contains(searchtext)||DeptNotiCrawer.linkList.get(i).contains(searchtext)) {
								searchtitle_dept.add(DeptNotiCrawer.DeptNotiList.get(i));
								searchdate.add(DeptNotiCrawer.dateList.get(i)+"3");
								searchnoticontent_dept.add(DeptNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_fy.isSelected()) {
						for(int i = 0;i<MoreCollegeNotiCrawer.fnum;i++) {
							if(MoreCollegeNotiCrawer.CollegeNotiList.get(i).contains(searchtext)||MoreCollegeNotiCrawer.linkList.get(i).contains(searchtext)) {
								searchtitle_fy.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
								searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"4");
								searchnoticontent_fy.add(MoreCollegeNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_gjs.isSelected()) {
						for(int i = MoreCollegeNotiCrawer.fnum;i<MoreCollegeNotiCrawer.snum;i++) {
							if(MoreCollegeNotiCrawer.CollegeNotiList.get(i).contains(searchtext)||MoreCollegeNotiCrawer.linkList.get(i).contains(searchtext)) {
								searchtitle_gjs.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
								searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"5");
								searchnoticontent_gjs.add(MoreCollegeNotiCrawer.contentlist.get(i));
							}
						}
					}
					if(checkBox_bz.isSelected()) {
						for(int i = MoreCollegeNotiCrawer.snum;i<MoreCollegeNotiCrawer.contentlist.size();i++) {
							if(MoreCollegeNotiCrawer.CollegeNotiList.get(i).contains(searchtext)||MoreCollegeNotiCrawer.linkList.get(i).contains(searchtext)) {
								searchtitle_bz.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
								searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"6");
								searchnoticontent_bz.add(MoreCollegeNotiCrawer.contentlist.get(i));
							}
						}
					}
				}
				else {
					if(CheckBox_school.isSelected()) {
						for(int i = 0;i<SchoolNotiCrawer.contentlist.size();i++) {
								searchtitle_sch.add(SchoolNotiCrawer.SchoolNotiList.get(i));
								searchdate.add(SchoolNotiCrawer.dateList.get(i)+"1");
								searchnoticontent_sch.add(SchoolNotiCrawer.contentlist.get(i));
						}
					}
					if(checkBox_rw.isSelected()) {
						for(int i = 0;i<CollegeNotiCrawer.contentlist.size();i++) {
								searchtitle_rw.add(CollegeNotiCrawer.CollegeNotiList.get(i));
								searchdate.add(CollegeNotiCrawer.dateList.get(i)+"2");
								searchnoticontent_rw.add(CollegeNotiCrawer.contentlist.get(i));
						}
					}
					if(checkBox_dept.isSelected()) {
						for(int i = 0;i<DeptNotiCrawer.contentlist.size();i++) {
							searchtitle_dept.add(DeptNotiCrawer.DeptNotiList.get(i));
							searchdate.add(DeptNotiCrawer.dateList.get(i)+"3");
							searchnoticontent_dept.add(DeptNotiCrawer.contentlist.get(i));
						}
					}
					if(checkBox_fy.isSelected()) {
						for(int i = 0;i<MoreCollegeNotiCrawer.fnum;i++) {
							searchtitle_fy.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
							searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"4");
							searchnoticontent_fy.add(MoreCollegeNotiCrawer.contentlist.get(i));
						}
					}
					if(checkBox_gjs.isSelected()) {
						for(int i = MoreCollegeNotiCrawer.fnum;i<MoreCollegeNotiCrawer.snum;i++) {
							searchtitle_gjs.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
							searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"5");
							searchnoticontent_gjs.add(MoreCollegeNotiCrawer.contentlist.get(i));
						}
					}
					if(checkBox_bz.isSelected()) {
						for(int i = MoreCollegeNotiCrawer.snum;i<MoreCollegeNotiCrawer.contentlist.size();i++) {
							searchtitle_bz.add(MoreCollegeNotiCrawer.CollegeNotiList.get(i));
							searchdate.add(MoreCollegeNotiCrawer.dateList.get(i)+"6");
							searchnoticontent_bz.add(MoreCollegeNotiCrawer.contentlist.get(i));
						}
					}
				}
					
				Collections.sort(searchdate, new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						// TODO 自动生成的方法存根
						return o2.compareTo(o1);
					}
					
				});
				
				
				label.setText("\u641c\u7d22\u7ed3\u679c");
				label_1.setText("");
				label_3.setText("");
				label_5.setText("");
				label_7.setText("");
				label_8.setText("");
				label_2.setText("");
				label_4.setText("");
				label_6.setText("");
				label_9.setText("");
				label_10.setText("");
				page = 0;
				if(searchdate.size() == 0) {
					label_1.setText("\u6ca1\u6709\u627e\u5230\u76f8\u5173\u5185\u5bb9\uff01");
				}
				else {
					int psch=0,prw=0,pdept=0,pfy=0,pgjs=0,pbz=0;
					for(String ss : searchdate) {
						if(ss.charAt(ss.length()-1) == '1') {
							searchtitle.add(searchtitle_sch.get(psch));
							searchnoticontent.add(searchnoticontent_sch.get(psch));
							psch++;
						}
						else if(ss.charAt(ss.length()-1) == '2') {
							searchtitle.add(searchtitle_rw.get(prw));
							searchnoticontent.add(searchnoticontent_rw.get(prw));
							prw++;
						}
						else if(ss.charAt(ss.length()-1) == '3') {
							searchtitle.add(searchtitle_dept.get(pdept));
							searchnoticontent.add(searchnoticontent_dept.get(pdept));
							pdept++;
						}
						else if(ss.charAt(ss.length()-1) == '4') {
							searchtitle.add(searchtitle_fy.get(pfy));
							searchnoticontent.add(searchnoticontent_fy.get(pfy));
							pfy++;
						}
						else if(ss.charAt(ss.length()-1) == '5') {
							searchtitle.add(searchtitle_gjs.get(pgjs));
							searchnoticontent.add(searchnoticontent_gjs.get(pgjs));
							pgjs++;
						}
						else if(ss.charAt(ss.length()-1) == '6') {
							searchtitle.add(searchtitle_bz.get(pbz));
							searchnoticontent.add(searchnoticontent_bz.get(pbz));
							pbz++;
						}
					}
					ArrayList<String> searchdate2 = new ArrayList<>();
					for(String ss:searchdate) {
						searchdate2.add(ss.substring(0,ss.length()-1));
					}
					change(searchtitle, searchdate2, searchnoticontent);
					if(searchtitle.size() == 1) {
						label_1.setText(title.get(page*5+0));
						label_2.setText(date.get(page*5+0));
					}
					else if(searchtitle.size() == 2) {
						label_1.setText(title.get(page*5+0));
						label_2.setText(date.get(page*5+0));
						label_3.setText(title.get(page*5+1));
						label_4.setText(date.get(page*5+1));
					}
					else if(searchtitle.size() == 3) {
						label_1.setText(title.get(page*5+0));
						label_2.setText(date.get(page*5+0));
						label_3.setText(title.get(page*5+1));
						label_4.setText(date.get(page*5+1));
						label_5.setText(title.get(page*5+2));
						label_6.setText(date.get(page*5+2));
					}
					else if(searchtitle.size() == 4) {
						label_1.setText(title.get(page*5+0));
						label_2.setText(date.get(page*5+0));
						label_3.setText(title.get(page*5+1));
						label_4.setText(date.get(page*5+1));
						label_5.setText(title.get(page*5+2));
						label_6.setText(date.get(page*5+2));
						label_7.setText(title.get(page*5+3));
						label_9.setText(date.get(page*5+3));
					}
					else {
						label_1.setText(title.get(page*5+0));
						label_3.setText(title.get(page*5+1));
						label_5.setText(title.get(page*5+2));
						label_7.setText(title.get(page*5+3));
						label_8.setText(title.get(page*5+4));
						label_2.setText(date.get(page*5+0));
						label_4.setText(date.get(page*5+1));
						label_6.setText(date.get(page*5+2));
						label_9.setText(date.get(page*5+3));
						label_10.setText(date.get(page*5+4));
					}	
				}
			    
			}		
		});
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
			
		});
	}
	
	
}