package WindowBuilder;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import ClassLibrary.CollegeNotiCrawer;
import ClassLibrary.CollegeNotiCrawer;

import javax.swing.JButton;

public class Notification extends JPanel {

	/**
	 * Create the panel.
	 */
	private int page = 0;
	public Notification() {
		if(CollegeNotiCrawer.CollegeNotiList.size()==0) {
			CollegeNotiCrawer workInfoCrawer = new CollegeNotiCrawer();
			workInfoCrawer.getCollegeNoti();
		}
		
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
		
		schoolbutton.setFont(new Font("����", Font.PLAIN, 18));
		schoolbutton.setBounds(38, 49, 163, 60);
		changebutton.add(schoolbutton);
		
		JButton collegebutton = new JButton("\u5B66\u9662\u901A\u77E5");
		collegebutton.setFont(new Font("����", Font.PLAIN, 18));
		
		collegebutton.setBounds(38, 104, 163, 60);
		changebutton.add(collegebutton);
		
		JButton deptbutton = new JButton("\u6559\u52A1\u5904\u901A\u77E5");
		
		deptbutton.setFont(new Font("����", Font.PLAIN, 18));
		deptbutton.setBounds(38, 163, 163, 60);
		changebutton.add(deptbutton);
		
		JPanel panel = new JPanel();
		panel.setBounds(297, 37, 645, 480);
		All.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("学院通知");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.BOLD, 24));
		label.setBounds(36, 13, 213, 37);
		panel.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(36, 76, 376, 37);
		label_1.setText(CollegeNotiCrawer.CollegeNotiList.get(0));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setForeground(new Color(100, 149, 237));
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(487, 76, 144, 37);
		label_2.setText(CollegeNotiCrawer.dateList.get(0));
		panel.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(36, 126, 376, 37);
		label_3.setText(CollegeNotiCrawer.CollegeNotiList.get(1));
		panel.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setForeground(new Color(100, 149, 237));
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(487, 126, 144, 37);
		label_4.setText(CollegeNotiCrawer.dateList.get(1));
		panel.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(36, 176, 376, 37);
		label_5.setText(CollegeNotiCrawer.CollegeNotiList.get(2));
		panel.add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setForeground(new Color(100, 149, 237));
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(487, 176, 144, 37);
		label_6.setText(CollegeNotiCrawer.dateList.get(2));
		panel.add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		label_7.setBounds(36, 226, 376, 37);
		label_7.setText(CollegeNotiCrawer.CollegeNotiList.get(3));
		panel.add(label_7);
		
		JLabel label_8 = new JLabel();
		label_8.setFont(new Font("宋体", Font.PLAIN, 18));
		label_8.setBounds(36, 276, 376, 37);
		label_8.setText(CollegeNotiCrawer.CollegeNotiList.get(4));
		panel.add(label_8);
		
		JLabel label_9 = new JLabel();
		label_9.setForeground(new Color(100, 149, 237));
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		label_9.setBounds(487, 226, 144, 37);
		label_9.setText(CollegeNotiCrawer.dateList.get(3));
		panel.add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setForeground(new Color(100, 149, 237));
		label_10.setFont(new Font("宋体", Font.PLAIN, 18));
		label_10.setBounds(487, 276, 144, 37);
		label_10.setText(CollegeNotiCrawer.dateList.get(4));
		panel.add(label_10);
		
		JButton btnNewButton = new JButton("上一页");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(page>0) {
					page--;
					label_1.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+0));
					label_3.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+1));
					label_5.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+2));
					label_7.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+3));
					label_8.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+4));
					label_2.setText(CollegeNotiCrawer.dateList.get(page*5+0));
					label_4.setText(CollegeNotiCrawer.dateList.get(page*5+1));
					label_6.setText(CollegeNotiCrawer.dateList.get(page*5+2));
					label_9.setText(CollegeNotiCrawer.dateList.get(page*5+3));
					label_10.setText(CollegeNotiCrawer.dateList.get(page*5+4));
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
				if(CollegeNotiCrawer.CollegeNotiList.size()>curr){
					page++;
					label_1.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+0));
					label_3.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+1));
					label_5.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+2));
					label_7.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+3));
					label_8.setText(CollegeNotiCrawer.CollegeNotiList.get(page*5+4));
					label_2.setText(CollegeNotiCrawer.dateList.get(page*5+0));
					label_4.setText(CollegeNotiCrawer.dateList.get(page*5+1));
					label_6.setText(CollegeNotiCrawer.dateList.get(page*5+2));
					label_9.setText(CollegeNotiCrawer.dateList.get(page*5+3));
					label_10.setText(CollegeNotiCrawer.dateList.get(page*5+4));
				}
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setBounds(363, 362, 113, 27);
		panel.add(button);
		
		
	}
}
