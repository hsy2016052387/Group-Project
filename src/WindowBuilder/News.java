package WindowBuilder;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import ClassLibrary.CollegeNotiCrawer;
import ClassLibrary.DeptNotiCrawer;
import ClassLibrary.NewsCrawer;
import ClassLibrary.SchoolNotiCrawer;
import ClassLibrary.TextFieldHintListener;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuBar;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class News extends JPanel {

	/**
	 * Create the panel.
	 */
	private int page = 0;
	private static ArrayList<String> title = new ArrayList<String>();
	private static ArrayList<String> date = new ArrayList<String>();
	private static ArrayList<String> newscontent = new ArrayList<String>();
	private JTextField textField;
	
	private void change(ArrayList<String> List1, ArrayList<String> List2, ArrayList<String> List3) {
		title = List1;
		date = List2;
		newscontent = List3;
	}
	
	public News() {
		
		change(NewsCrawer.NewsList, NewsCrawer.dateList,NewsCrawer.contentlist);
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel All = new JPanel();
		All.setBounds(0, 0, 982, 524);
		add(All);
		All.setLayout(null);
		
		JPanel searchPanel = new JPanel();
		searchPanel.setBounds(0, 0, 968, 37);
		All.add(searchPanel);
		searchPanel.setLayout(null);
		searchPanel.setBackground(Color.WHITE);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(33, 13, 220, 24);
		textField.addFocusListener(new TextFieldHintListener(textField, "请输入搜索内容"));
		searchPanel.add(textField);
		
		JLabel label_11 = new JLabel("年");
		label_11.setBounds(442, 13, 20, 29);
		searchPanel.add(label_11);
		
		JLabel label_12 = new JLabel("月");
		label_12.setBounds(630, 11, 20, 29);
		searchPanel.add(label_12);
		
		JLabel label_13 = new JLabel("日");
		label_13.setBounds(818, 11, 20, 29);
		searchPanel.add(label_13);
		
		JButton button_1 = new JButton("搜索");
		
		button_1.setBounds(852, 12, 74, 27);
		searchPanel.add(button_1);
		
		JComboBox<String> comboBox_year = new JComboBox<String>();
		comboBox_year.setBackground(Color.WHITE);
		comboBox_year.setBounds(275, 13, 160, 24);
		searchPanel.add(comboBox_year);
		Calendar calendar = Calendar.getInstance();
		comboBox_year.addItem("请选择年份");
		for(int i =2003;i<=calendar.get(Calendar.YEAR);i++) {
			comboBox_year.addItem(i+"");
		}
		
		JComboBox<String> comboBox_month = new JComboBox<String>();
		comboBox_month.setBackground(Color.WHITE);
		comboBox_month.setBounds(463, 13, 160, 24);
		searchPanel.add(comboBox_month);
		comboBox_month.addItem("请选择月份");
		for(int i = 1; i < 10; i++) {
			comboBox_month.addItem("0"+i+"");
		}
		comboBox_month.addItem("10");
		comboBox_month.addItem("11");
		comboBox_month.addItem("12");
		
		JComboBox<String> comboBox_day = new JComboBox<String>();
		comboBox_day.setBackground(Color.WHITE);
		comboBox_day.setBounds(652, 13, 160, 24);
		searchPanel.add(comboBox_day);
		comboBox_day.addItem("请选择日期");
		for(int i = 1; i < 10; i++) {
			comboBox_day.addItem("0"+i+"");
		}
		for(int i = 10; i < 32; i++) {
			comboBox_day.addItem(i+"");
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 982, 524);
		All.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\u66a8\u5927\u5934\u6761");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.BOLD, 24));
		label.setBounds(364, 74, 213, 37);
		panel.add(label);
		
		JLabel label_1 = new JLabel();
		
//		label_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent arg0) {
//				MainInterface.panel.removeAll();
//				MainInterface.panel.add(new workDetail());
//				MainInterface.panel.updateUI();
//			}
//		});
		label_1.setText(NewsCrawer.NewsList.get(0));
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(133, 141, 558, 37);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setForeground(new Color(100, 149, 237));
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(744, 141, 144, 37);
		label_2.setText(NewsCrawer.dateList.get(0));
		panel.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(133, 191, 558, 37);
		label_3.setText(NewsCrawer.NewsList.get(1));
		panel.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setForeground(new Color(100, 149, 237));
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(744, 191, 144, 37);
		label_4.setText(NewsCrawer.dateList.get(1));
		panel.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(133, 241, 558, 37);
		label_5.setText(NewsCrawer.NewsList.get(2));
		panel.add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setForeground(new Color(100, 149, 237));
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(744, 241, 144, 37);
		label_6.setText(NewsCrawer.dateList.get(2));
		panel.add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		label_7.setBounds(133, 291, 558, 37);
		label_7.setText(NewsCrawer.NewsList.get(3));
		panel.add(label_7);
		
		JLabel label_8 = new JLabel();
		label_8.setFont(new Font("宋体", Font.PLAIN, 18));
		label_8.setBounds(133, 341, 558, 37);
		label_8.setText(NewsCrawer.NewsList.get(4));
		panel.add(label_8);
		
		JLabel label_9 = new JLabel();
		label_9.setForeground(new Color(100, 149, 237));
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		label_9.setBounds(744, 291, 144, 37);
		label_9.setText(NewsCrawer.dateList.get(3));
		panel.add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setForeground(new Color(100, 149, 237));
		label_10.setFont(new Font("宋体", Font.PLAIN, 18));
		label_10.setBounds(744, 341, 144, 37);
		label_10.setText(NewsCrawer.dateList.get(4));
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
		btnNewButton.setBounds(327, 391, 113, 27);
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
		button.setBounds(509, 391, 113, 27);
		panel.add(button);
		
		JButton reset = new JButton("重置");
		
		reset.setBounds(855, 64, 72, 27);
		panel.add(reset);
		
		

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
				All.add(searchPanel);
				All.add(panel);
				All.updateUI();
			}
		});
		
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(newscontent.get(page*5+0));
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
				content.setText(newscontent.get(page*5+1));
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
				content.setText(newscontent.get(page*5+2));
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
				content.setText(newscontent.get(page*5+3));
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
				content.setText(newscontent.get(page*5+4));
				content.setCaretPosition(0);
				label_26.setText(title.get(page*5+4));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ArrayList<String> searchtitle = new ArrayList<String>();
				ArrayList<String> searchdate = new ArrayList<String>();
				ArrayList<String> searchnoticontent = new ArrayList<String>();
				String searchtext = textField.getText();
				String year = new String("");
				String month = new String("");
				String day = new String("");
				StringBuilder datesb = new StringBuilder();
				if(!comboBox_year.getSelectedItem().equals("请选择年份")) {
					year = (String) comboBox_year.getSelectedItem();
					datesb.append(year);
				}
				if(!comboBox_month.getSelectedItem().equals("请选择月份")) {;
					month = (String) comboBox_month.getSelectedItem();
					datesb.append("-");
					datesb.append(month);
				}
				if(!comboBox_day.getSelectedItem().equals("请选择日期")) {
					day = (String) comboBox_day.getSelectedItem();
					datesb.append("-");
					datesb.append(day);
				}
				if(datesb.length()!=0 && !searchtext.equals("请输入搜索内容")) {
					for(int i = 0;i<NewsCrawer.dateList.size();i++) {
						if(NewsCrawer.dateList.get(i).contains(datesb)) {
							if(NewsCrawer.NewsList.get(i).contains(searchtext)||NewsCrawer.linkList.get(i).contains(searchtext)) {
								searchtitle.add(NewsCrawer.NewsList.get(i));
								searchdate.add(NewsCrawer.dateList.get(i));
								searchnoticontent.add(NewsCrawer.contentlist.get(i));
							}
						}
					}
				}
				else if(datesb.length()!=0 && searchtext.equals("请输入搜索内容")) {
					for(int i = 0;i<NewsCrawer.dateList.size();i++) {
						if(NewsCrawer.dateList.get(i).contains(datesb)) {
							searchtitle.add(NewsCrawer.NewsList.get(i));
							searchdate.add(NewsCrawer.dateList.get(i));
							searchnoticontent.add(NewsCrawer.contentlist.get(i));
						}
					}
				}
				else if(datesb.length()==0 && !searchtext.equals("请输入搜索内容")) {
					for(int i = 0;i<NewsCrawer.dateList.size();i++) {
						if(NewsCrawer.NewsList.get(i).contains(searchtext)||NewsCrawer.linkList.get(i).contains(searchtext)) {
							searchtitle.add(NewsCrawer.NewsList.get(i));
							searchdate.add(NewsCrawer.dateList.get(i));
							searchnoticontent.add(NewsCrawer.contentlist.get(i));
						}
					}
				}
				else
					return;
				
				
				label.setText("搜索结果");
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
				change(searchtitle, searchdate, searchnoticontent);
				page = 0;
				if(searchtitle.size() == 0) {
					label_1.setText("没有找到相关内容！");
				}
				else if(searchtitle.size() == 1) {
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
		});
		
		reset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("请输入搜索内容");
				comboBox_year.setSelectedIndex(0);
				comboBox_month.setSelectedIndex(0);
				comboBox_day.setSelectedIndex(0);
				label.setText("暨大头条");
				change(NewsCrawer.NewsList, NewsCrawer.dateList,NewsCrawer.contentlist);
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
	}
}
