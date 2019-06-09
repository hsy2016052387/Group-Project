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
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.sun.glass.ui.Menu;

import ClassLibrary.CollegeNotiCrawer;
import ClassLibrary.DeptNotiCrawer;
import ClassLibrary.MoreCollegeNotiCrawer;
import ClassLibrary.NewsCrawer;
import ClassLibrary.SchoolNotiCrawer;
import ClassLibrary.CollegeNotiCrawer;

import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Scrollbar;
import java.awt.Choice;
import javax.swing.JComboBox;

public class Notification extends JPanel {

	/**
	 * Create the panel.
	 */
	private int page = 0;
	private static ArrayList<String> title = new ArrayList<String>();
	private static ArrayList<String> date = new ArrayList<String>();
	private static ArrayList<String> noticontent = new ArrayList<String>();
	
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
		changebutton.setBounds(55, 92, 239, 311);
		All.add(changebutton);
		
		JButton schoolbutton = new JButton("\u5B66\u6821\u901A\u77E5");
		schoolbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		schoolbutton.setFont(new Font("����", Font.PLAIN, 18));
		schoolbutton.setBounds(38, 40, 163, 60);
		changebutton.add(schoolbutton);
		
		JButton collegebutton = new JButton("\u5B66\u9662\u901A\u77E5");
		collegebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		collegebutton.setFont(new Font("����", Font.PLAIN, 18));
		
		collegebutton.setBounds(38, 100, 163, 60);
		collegebutton.setToolTipText("单击查看本学院通知，右键可查看其他学院");
		changebutton.add(collegebutton);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(collegebutton, popupMenu);
		
		JMenuItem TranMenuItem = new JMenuItem("翻译学院");
		popupMenu.add(TranMenuItem);
		
		JMenuItem BusiMenuItem = new JMenuItem("国际商学院");
		popupMenu.add(BusiMenuItem);
		
		JMenuItem PackMenuItem = new JMenuItem("包装工程学院");
		popupMenu.add(PackMenuItem);
		
		JButton deptbutton = new JButton("\u6559\u52A1\u5904\u901A\u77E5");
		
		
		deptbutton.setFont(new Font("����", Font.PLAIN, 18));
		deptbutton.setBounds(38, 160, 163, 60);
		changebutton.add(deptbutton);
			
		JPanel panel = new JPanel();
		panel.setBounds(297, 37, 645, 480);
		All.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("学校通知");
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
		
		JButton btnNewButton = new JButton("上一页");
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
		
		JButton button = new JButton("下一页");
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
				label.setText("学校通知");
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
				label.setText("学院通知");
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
		});
		
		
		deptbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setText("教务处通知");
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
	        	MoreCollegeNotiCrawer.CollegeNotiList = new ArrayList<String>();
				MoreCollegeNotiCrawer.linkList = new ArrayList<String>();
				MoreCollegeNotiCrawer.dateList = new ArrayList<String>();
				MoreCollegeNotiCrawer.contentlist = new ArrayList<String>();
				
	        	if (e.getSource() == TranMenuItem) {
					label.setText("翻译学院通知");
					MoreCollegeNotiCrawer newone = new MoreCollegeNotiCrawer(1);
					newone.getCollegeNoti();
					change(newone.CollegeNotiList, newone.dateList, newone.contentlist);
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
					label.setText("国际商学院通知");
					MoreCollegeNotiCrawer newone = new MoreCollegeNotiCrawer(2);
		
					newone.getCollegeNoti();
					change(newone.CollegeNotiList, newone.dateList, newone.contentlist);
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
					label.setText("包装工程学院通知");
					MoreCollegeNotiCrawer newone = new MoreCollegeNotiCrawer(3);
					newone.getCollegeNoti();
					change(newone.CollegeNotiList, newone.dateList, newone.contentlist);
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