package WindowBuilder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class SchoolCard extends JPanel {

	/**
	 * Create the panel.
	 */
	public SchoolCard(String status) {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 529);
		add(panel);
		
		JLabel label = new JLabel("\u6821\u56ed\u4e00\u5361\u901a");
		label.setFont(new Font("Dialog", Font.PLAIN, 24));
		label.setBounds(347, 86, 133, 26);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u4f59\u989d\uff1a");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(282, 174, 115, 18);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel();
		
		label_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_2.setBounds(378, 174, 471, 18);
		panel.add(label_2);
		
		if(status==null) {
			label_2.setText("\u8bf7\u5728\u5bc6\u7801\u7ba1\u7406\u4e2d\u586b\u5199\u6570\u5b57\u66a8\u5927\u7684\u8d26\u53f7\u548c\u5bc6\u7801");
			label_2.setForeground(Color.RED);
		}else {
			label_2.setText(status);
		}
	}
}
