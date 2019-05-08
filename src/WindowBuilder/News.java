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
		if(NewsCrawer.NewsList.size()==0) {
			NewsCrawer workInfoCrawer = new NewsCrawer();
			workInfoCrawer.getNews();
		}
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 524);
		add(panel);
		
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

	}
}
