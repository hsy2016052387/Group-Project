package WindowBuilder;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import ClassLibrary.*;
//import chrriis.common.UIUtils;
//import chrriis.dj.nativeswing.swtimpl.NativeInterface;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import ClassLibrary.*;

public class WorkInfo extends JPanel {

	/**
	 * Create the panel.
	 */
	private int page = 0;
	public WorkInfo() {
		
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 524);
		add(panel);
		
		JLabel label = new JLabel("查询就业信息");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.BOLD, 24));
		label.setBounds(364, 74, 213, 37);
		panel.add(label);
		
		JLabel label_1 = new JLabel();
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				MainInterface.panel.removeAll();
				MainInterface.panel.add(new WorkDetail());
				//new WorkDetailWeb("www.baidu.com", MainInterface.panel);
				MainInterface.panel.updateUI();
			}
		});
		label_1.setText(WorkInfoCrawer.workInfoList.get(0));
		label_1.setFont(new Font("宋体", Font.PLAIN, 18));
		label_1.setBounds(133, 141, 558, 37);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel();
		label_2.setForeground(new Color(100, 149, 237));
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(744, 141, 110, 37);
		label_2.setText(WorkInfoCrawer.dateList.get(0));
		panel.add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(133, 191, 558, 37);
		label_3.setText(WorkInfoCrawer.workInfoList.get(1));
		panel.add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setForeground(new Color(100, 149, 237));
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(744, 191, 110, 37);
		label_4.setText(WorkInfoCrawer.dateList.get(1));
		panel.add(label_4);
		
		JLabel label_5 = new JLabel();
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(133, 241, 558, 37);
		label_5.setText(WorkInfoCrawer.workInfoList.get(2));
		panel.add(label_5);
		
		JLabel label_6 = new JLabel();
		label_6.setForeground(new Color(100, 149, 237));
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(744, 241, 110, 37);
		label_6.setText(WorkInfoCrawer.dateList.get(2));
		panel.add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		label_7.setBounds(133, 291, 558, 37);
		label_7.setText(WorkInfoCrawer.workInfoList.get(3));
		panel.add(label_7);
		
		JLabel label_8 = new JLabel();
		label_8.setFont(new Font("宋体", Font.PLAIN, 18));
		label_8.setBounds(133, 341, 558, 37);
		label_8.setText(WorkInfoCrawer.workInfoList.get(4));
		panel.add(label_8);
		
		JLabel label_9 = new JLabel();
		label_9.setForeground(new Color(100, 149, 237));
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		label_9.setBounds(744, 291, 110, 37);
		label_9.setText(WorkInfoCrawer.dateList.get(3));
		panel.add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setForeground(new Color(100, 149, 237));
		label_10.setFont(new Font("宋体", Font.PLAIN, 18));
		label_10.setBounds(744, 341, 110, 37);
		label_10.setText(WorkInfoCrawer.dateList.get(4));
		panel.add(label_10);
		
		JButton btnNewButton = new JButton("上一页");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainInterface.logClass.printlog("点击了上一页");
				if(page>0) {
					page--;
					label_1.setText(WorkInfoCrawer.workInfoList.get(page*5+0));
					label_3.setText(WorkInfoCrawer.workInfoList.get(page*5+1));
					label_5.setText(WorkInfoCrawer.workInfoList.get(page*5+2));
					label_7.setText(WorkInfoCrawer.workInfoList.get(page*5+3));
					label_8.setText(WorkInfoCrawer.workInfoList.get(page*5+4));
					label_2.setText(WorkInfoCrawer.dateList.get(page*5+0));
					label_4.setText(WorkInfoCrawer.dateList.get(page*5+1));
					label_6.setText(WorkInfoCrawer.dateList.get(page*5+2));
					label_9.setText(WorkInfoCrawer.dateList.get(page*5+3));
					label_10.setText(WorkInfoCrawer.dateList.get(page*5+4));
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 15));
		btnNewButton.setBounds(327, 391, 113, 27);
		panel.add(btnNewButton);
		
		JButton button = new JButton("下一页");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainInterface.logClass.printlog("点击了下一页");
				if(page<9){
					page++;
					label_1.setText(WorkInfoCrawer.workInfoList.get(page*5+0));
					label_3.setText(WorkInfoCrawer.workInfoList.get(page*5+1));
					label_5.setText(WorkInfoCrawer.workInfoList.get(page*5+2));
					label_7.setText(WorkInfoCrawer.workInfoList.get(page*5+3));
					label_8.setText(WorkInfoCrawer.workInfoList.get(page*5+4));
					label_2.setText(WorkInfoCrawer.dateList.get(page*5+0));
					label_4.setText(WorkInfoCrawer.dateList.get(page*5+1));
					label_6.setText(WorkInfoCrawer.dateList.get(page*5+2));
					label_9.setText(WorkInfoCrawer.dateList.get(page*5+3));
					label_10.setText(WorkInfoCrawer.dateList.get(page*5+4));
				}
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		button.setBounds(509, 391, 113, 27);
		panel.add(button);

	}
}
