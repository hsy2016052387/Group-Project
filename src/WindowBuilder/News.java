package WindowBuilder;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import ClassLibrary.NewsCrawer;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class News extends JPanel {

	/**
	 * Create the panel.
	 */
	private int page = 0;
	public News() {
		
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel All = new JPanel();
		All.setBounds(0, 0, 982, 524);
		add(All);
		All.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 982, 524);
		All.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("暨大头条");
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
		
		JButton btnNewButton = new JButton("上一页");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(page>0) {
					page--;
					label_1.setText(NewsCrawer.NewsList.get(page*5+0));
					label_3.setText(NewsCrawer.NewsList.get(page*5+1));
					label_5.setText(NewsCrawer.NewsList.get(page*5+2));
					label_7.setText(NewsCrawer.NewsList.get(page*5+3));
					label_8.setText(NewsCrawer.NewsList.get(page*5+4));
					label_2.setText(NewsCrawer.dateList.get(page*5+0));
					label_4.setText(NewsCrawer.dateList.get(page*5+1));
					label_6.setText(NewsCrawer.dateList.get(page*5+2));
					label_9.setText(NewsCrawer.dateList.get(page*5+3));
					label_10.setText(NewsCrawer.dateList.get(page*5+4));
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		btnNewButton.setBounds(327, 391, 113, 27);
		panel.add(btnNewButton);
		
		JButton button = new JButton("下一页");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int curr = (page+2)*5;
				if(NewsCrawer.NewsList.size()>curr){
					page++;
					label_1.setText(NewsCrawer.NewsList.get(page*5+0));
					label_3.setText(NewsCrawer.NewsList.get(page*5+1));
					label_5.setText(NewsCrawer.NewsList.get(page*5+2));
					label_7.setText(NewsCrawer.NewsList.get(page*5+3));
					label_8.setText(NewsCrawer.NewsList.get(page*5+4));
					label_2.setText(NewsCrawer.dateList.get(page*5+0));
					label_4.setText(NewsCrawer.dateList.get(page*5+1));
					label_6.setText(NewsCrawer.dateList.get(page*5+2));
					label_9.setText(NewsCrawer.dateList.get(page*5+3));
					label_10.setText(NewsCrawer.dateList.get(page*5+4));
				}
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setBounds(509, 391, 113, 27);
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
				All.add(panel);
				All.updateUI();
			}
		});
		
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(NewsCrawer.contentlist.get(page*5+0));
				content.setCaretPosition(0);
				label_26.setText(NewsCrawer.NewsList.get(page*5+0));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(NewsCrawer.contentlist.get(page*5+1));
				content.setCaretPosition(0);
				label_26.setText(NewsCrawer.NewsList.get(page*5+1));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(NewsCrawer.contentlist.get(page*5+2));
				content.setCaretPosition(0);
				label_26.setText(NewsCrawer.NewsList.get(page*5+2));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(NewsCrawer.contentlist.get(page*5+3));
				content.setCaretPosition(0);
				label_26.setText(NewsCrawer.NewsList.get(page*5+3));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
		
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				content.setText(NewsCrawer.contentlist.get(page*5+4));
				content.setCaretPosition(0);
				label_26.setText(NewsCrawer.NewsList.get(page*5+4));
				All.removeAll();
				All.add(scrollPane);
				All.updateUI();
			}
		});
	}
}
