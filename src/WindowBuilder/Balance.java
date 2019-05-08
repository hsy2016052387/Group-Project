package WindowBuilder;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class Balance extends JPanel {

	/**
	 * Create the panel.
	 */
	public Balance() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 982, 529);
		add(panel);
		
		JLabel label = new JLabel("\u5BBF\u820D\u7535\u8D39");
		label.setFont(new Font("����", Font.PLAIN, 24));
		label.setBounds(140, 90, 133, 26);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u5F53\u524D\u5269\u4F59\uFF1A");
		label_1.setFont(new Font("����", Font.PLAIN, 18));
		label_1.setBounds(75, 144, 116, 18);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("61.55");
		label_2.setFont(new Font("����", Font.PLAIN, 18));
		label_2.setBounds(201, 144, 72, 18);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\uFF08\u5EA6\uFF09");
		label_3.setFont(new Font("����", Font.PLAIN, 18));
		label_3.setBounds(243, 144, 72, 18);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("        \u8868\u53F7\uFF1A");
		label_4.setFont(new Font("����", Font.PLAIN, 18));
		label_4.setBounds(40, 175, 144, 18);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("000001214343");
		label_5.setFont(new Font("����", Font.PLAIN, 18));
		label_5.setBounds(201, 175, 167, 18);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("        \u63CF\u8FF0\uFF1A");
		label_6.setFont(new Font("����", Font.PLAIN, 18));
		label_6.setBounds(40, 206, 126, 18);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("3315");
		label_7.setFont(new Font("����", Font.PLAIN, 18));
		label_7.setBounds(201, 206, 72, 18);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("\u5355\u4EF7\u7C7B\u578B\uFF1A    \u5B66\u751F\u7528\u7535[0.63\u5143]");
		label_8.setFont(new Font("����", Font.PLAIN, 18));
		label_8.setBounds(75, 237, 343, 18);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("\u6700\u5927\u8D1F\u8377\uFF1A    5A");
		label_9.setFont(new Font("����", Font.PLAIN, 18));
		label_9.setBounds(75, 268, 273, 18);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("\uFF08\u5143\uFF09");
		label_10.setFont(new Font("����", Font.PLAIN, 18));
		label_10.setBounds(768, 175, 72, 18);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("\u62A5\u8B66\u4E0B\u9650\uFF1A    20\u5EA6");
		label_11.setFont(new Font("����", Font.PLAIN, 18));
		label_11.setBounds(75, 299, 252, 26);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("\u900F\u89C6\u4E0B\u9650\uFF1A    159\u5EA6");
		label_12.setFont(new Font("����", Font.PLAIN, 18));
		label_12.setBounds(74, 332, 222, 18);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("\u66F4\u65B0\u65F6\u95F4\uFF1A");
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setFont(new Font("����", Font.PLAIN, 18));
		label_13.setBounds(75, 363, 91, 18);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("2019-3-31 21:04:00 ");
		label_14.setFont(new Font("����", Font.PLAIN, 18));
		label_14.setBounds(201, 363, 197, 18);
		panel.add(label_14);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(498, 83, 16, 358);
		panel.add(separator);
		
		JLabel label_15 = new JLabel("\u6821\u56ED\u4E00\u5361\u901A");
		label_15.setFont(new Font("����", Font.PLAIN, 24));
		label_15.setBounds(658, 89, 126, 29);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("\u5361\u53F7\uFF1A");
		label_16.setFont(new Font("����", Font.PLAIN, 18));
		label_16.setBounds(635, 144, 72, 18);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("252242");
		label_17.setFont(new Font("����", Font.PLAIN, 18));
		label_17.setBounds(721, 144, 72, 18);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("\u4F59\u989D\uFF1A");
		label_18.setFont(new Font("����", Font.PLAIN, 18));
		label_18.setBounds(635, 175, 62, 18);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("45.90");
		label_19.setFont(new Font("����", Font.PLAIN, 18));
		label_19.setBounds(721, 175, 76, 18);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("\u5F85\u5708\u5B58\uFF1A");
		label_20.setFont(new Font("����", Font.PLAIN, 18));
		label_20.setBounds(635, 206, 72, 18);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("0.00");
		label_21.setFont(new Font("����", Font.PLAIN, 18));
		label_21.setBounds(721, 206, 72, 18);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("\uFF08\u5143\uFF09");
		label_22.setFont(new Font("����", Font.PLAIN, 18));
		label_22.setBounds(768, 206, 72, 18);
		panel.add(label_22);

	}

}
