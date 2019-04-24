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
import javax.swing.JButton;

public class notification extends JPanel {

	/**
	 * Create the panel.
	 */
	public notification() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 530);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(55, 92, 239, 311);
		panel.add(panel_1);
		
		JButton button_3 = new JButton("\u5B66\u6821\u901A\u77E5");
		
		button_3.setFont(new Font("宋体", Font.PLAIN, 18));
		button_3.setBounds(38, 49, 163, 60);
		panel_1.add(button_3);
		
		JButton btnNewButton = new JButton("\u5B66\u9662\u901A\u77E5");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		
		btnNewButton.setBounds(38, 104, 163, 60);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u6559\u52A1\u5904\u901A\u77E5");
		
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_1.setBounds(38, 163, 163, 60);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(308, 92, 627, 311);
		panel.add(panel_2);
		
		JLabel label = new JLabel("\u5B66\u6821\u901A\u77E5");
		label.setFont(new Font("宋体", Font.PLAIN, 30));
		label.setBounds(36, 26, 192, 68);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("\u53D1\u5E03\u65F6\u95F4");
		label_1.setFont(new Font("宋体", Font.PLAIN, 24));
		label_1.setBounds(480, 44, 116, 37);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("2019-3-29");
		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
		label_2.setBounds(490, 103, 116, 25);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("\u66A8\u5357\u5927\u5B66\u653F\u515A\u529E\u516C\u5BA4\u5173\u4E8E2019\u5E74\u6E05\u660E\u8282\u653E\u5047\u7684\u901A\u77E5");
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(36, 146, 404, 41);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("2019-3-15");
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(489, 157, 117, 18);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("\u5173\u4E8E\u7535\u5B50\u90AE\u7BB1\u7CFB\u7EDF\u5347\u7EA7\u53CA\u6838\u5BF9\u90AE\u7BB1\u8D26\u53F7\u4FE1\u606F\u7684\u901A\u77E5");
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(35, 200, 405, 36);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("2019-3-12");
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(490, 206, 116, 25);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("\u5173\u4E8E\u5347\u7EA7\u7535\u5B50\u90AE\u7BB1\u7CFB\u7EDF\u7684\u901A\u77E5");
		
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		label_7.setBounds(36, 97, 404, 36);
		panel_2.add(label_7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(308, 92, 627, 311);
		add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		
		JLabel label_16 = new JLabel("\u5B66\u9662\u901A\u77E5");
		label_16.setFont(new Font("宋体", Font.PLAIN, 30));
		label_16.setBounds(38, 28, 192, 68);
		panel_4.add(label_16);
		
		JLabel label_17 = new JLabel("\u4EBA\u6587\u5B66\u9662\u5173\u4E8E\u7B26\u54082019\u5E74\u65B0\u589E\u7814\u7A76\u751F\u5BFC\u5E08\u7533\u8BF7\u8D44\u683C\u4EBA\u5458\u7684\u516C\u793A");
		label_17.setFont(new Font("宋体", Font.PLAIN, 18));
		label_17.setBounds(38, 109, 278, 26);
		panel_4.add(label_17);
		
		JLabel label_18 = new JLabel("\u53D1\u5E03\u65F6\u95F4");
		label_18.setFont(new Font("宋体", Font.PLAIN, 24));
		label_18.setBounds(480, 38, 115, 40);
		panel_4.add(label_18);
		
		JLabel label_19 = new JLabel("2019-3-11");
		label_19.setFont(new Font("宋体", Font.PLAIN, 18));
		label_19.setBounds(490, 109, 94, 18);
		panel_4.add(label_19);
		
		JLabel label_20 = new JLabel("\u4EBA\u6587\u5B66\u96622017-2018\u5B66\u5E74\u5E74\u5EA6\u8003\u6838\u7ED3\u679C\u4F18\u79C0\u4EBA\u5458\u516C\u793A");
		label_20.setFont(new Font("宋体", Font.PLAIN, 18));
		label_20.setBounds(38, 157, 404, 26);
		panel_4.add(label_20);
		
		JLabel label_21 = new JLabel("2018-9-30");
		label_21.setFont(new Font("宋体", Font.PLAIN, 18));
		label_21.setBounds(490, 155, 120, 18);
		panel_4.add(label_21);
		
		JLabel label_22 = new JLabel("2018\u5E74\u4EBA\u6587\u5B66\u9662\u7533\u62A5\u4E13\u4E1A\u6280\u672F\u8D44\u683C\u60C5\u51B5\u516C\u793A");
		label_22.setFont(new Font("宋体", Font.PLAIN, 18));
		label_22.setBounds(38, 212, 404, 18);
		panel_4.add(label_22);
		
		JLabel label_23 = new JLabel("2018-9-20");
		label_23.setFont(new Font("宋体", Font.PLAIN, 18));
		label_23.setBounds(490, 210, 115, 18);
		panel_4.add(label_23);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(308, 92, 627, 311);
		add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		
		JLabel label_8 = new JLabel("\u6559\u52A1\u5904\u901A\u77E5");
		label_8.setFont(new Font("宋体", Font.PLAIN, 30));
		label_8.setBounds(48, 30, 192, 68);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("\u5173\u4E8E\u300A\u4FE1\u606F\u5B89\u5168\u7B80\u53F2\u300B\u7B49\u901A\u8BC6\u6559\u80B2\u9009\u4FEE\u8BFE\u64A4\u73ED\u7684\u901A\u77E5");
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		label_9.setBounds(48, 111, 374, 29);
		panel_3.add(label_9);
		
		JLabel label_10 = new JLabel("\u53D1\u5E03\u65F6\u95F4");
		label_10.setFont(new Font("宋体", Font.PLAIN, 24));
		label_10.setBounds(479, 46, 134, 41);
		panel_3.add(label_10);
		
		JLabel label_11 = new JLabel("2019-1-10");
		label_11.setFont(new Font("宋体", Font.PLAIN, 18));
		label_11.setBounds(479, 116, 86, 18);
		panel_3.add(label_11);
		
		JLabel label_12 = new JLabel("2018-2019\u5B66\u5E74\u7B2C\u4E8C\u5B66\u671F\u5168\u65E5\u5236\u672C\u79D1\u5B66\u751F\u9009\u8BFE\u901A\u77E5");
		label_12.setFont(new Font("宋体", Font.PLAIN, 18));
		label_12.setBounds(48, 171, 374, 18);
		panel_3.add(label_12);
		
		JLabel label_13 = new JLabel("2018-12-20");
		label_13.setFont(new Font("宋体", Font.PLAIN, 18));
		label_13.setBounds(479, 171, 112, 18);
		panel_3.add(label_13);
		
		JLabel label_14 = new JLabel("\u5173\u4E8E2018\u7EA7\u79CB\u5B63\u65B0\u751F\u7F51\u4E0A\u9009\u8BFE\u7684\u901A\u77E5");
		label_14.setFont(new Font("宋体", Font.PLAIN, 18));
		label_14.setBounds(48, 222, 374, 18);
		panel_3.add(label_14);
		
		JLabel label_15 = new JLabel("2018-9-10");
		label_15.setFont(new Font("宋体", Font.PLAIN, 18));
		label_15.setBounds(479, 222, 86, 18);
		panel_3.add(label_15);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 982, 530);
		//add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JTextArea txtrhttpsmynetjnueducnhttpsmynetjnueducn = new JTextArea();
		txtrhttpsmynetjnueducnhttpsmynetjnueducn.setLineWrap(true);
		txtrhttpsmynetjnueducnhttpsmynetjnueducn.setEditable(false);
		txtrhttpsmynetjnueducnhttpsmynetjnueducn.setText("\u6821\u5185\u5404\u5355\u4F4D\uFF1A\r\n\u4E3A\u4E86\u52A0\u5F3A\u7535\u5B50\u90AE\u7BB1\u5B89\u5168\u7BA1\u7406\uFF0C\u65B9\u4FBF\u5B66\u6821\u5E08\u751F\u7528\u6237\uFF0C\u5B66\u6821\u5C06\u4E8E2019\u5E744\u67081\u65E5\u5BF9\u7535\u5B50\u90AE\u7BB1\u7CFB\u7EDF\u8FDB\u884C\u5347\u7EA7\uFF0C\u5C06\u90AE\u7BB1\u7CFB\u7EDF\u7EB3\u5165\u5B66\u6821\u7EDF\u4E00\u8EAB\u4EFD\u8BA4\u8BC1\u5E73\u53F0\uFF0C\u5B9E\u73B0\u5355\u70B9\u767B\u5F55\u3002\u7CFB\u7EDF\u5347\u7EA7\u540E\uFF0C\u5C06\u6539\u53D8\u539F\u6709\u7684\u767B\u5F55\u65B9\u5F0F\uFF0C\u65B0\u7684\u767B\u5F55\u65B9\u5F0F\u5982\u4E0B\uFF1A\r\n\r\n1\u3001\u7F51\u9875\u767B\u5F55\uFF08https://mynet.jnu.edu.cn/\uFF09\u767B\u5F55\u6821\u56ED\u7F51\u81EA\u52A9\u670D\u52A1\u5E73\u53F0\uFF08https://mynet.jnu.edu.cn/\uFF09,\u5728\u201C\u6211\u7684\u9996\u9875\u201D\u70B9\u51FB\u201C\u90AE\u7BB1\u201D\u680F\u76EE\u663E\u793A\u7684\u90AE\u7BB1\u8D26\u53F7\u8FDB\u5165\u90AE\u7BB1\u3002\r\n\r\n\u5347\u7EA7\u540E\uFF0C\u767B\u5F55\u6821\u56ED\u7F51\u81EA\u52A9\u670D\u52A1\u5E73\u53F0\u65F6\u5C06\u76F4\u63A5\u8DF3\u8F6C\u5230\u7EDF\u4E00\u8EAB\u4EFD\u8BA4\u8BC1\u5E73\u53F0\uFF0C\u53EA\u9700\u8F93\u5165\u7EDF\u4E00\u8EAB\u4EFD\u8BA4\u8BC1\u5E73\u53F0\u7684\u8D26\u53F7\u548C\u5BC6\u7801\u5373\u53EF\u767B\u5F55\u3002\u5982\u5728\u540C\u4E00\u6D4F\u89C8\u5668\u5DF2\u767B\u5F55\u4FE1\u606F\u95E8\u6237\u7B49\u7CFB\u7EDF\uFF0C\u5219\u76F4\u63A5\u767B\u5F55\uFF0C\u65E0\u9700\u8F93\u5165\u8D26\u53F7\u5BC6\u7801\u3002\r\n\r\n2\u3001\u4FE1\u606F\u95E8\u6237\u767B\u5F55\r\n\u767B\u5F55\u4FE1\u606F\u95E8\u6237\uFF08https://i.jnu.edu.cn/\uFF09,\u5728\u5DE6\u5219\u5BFC\u822A\u680F\u70B9\u51FB\u201C\u529E\u516C\u5E94\u7528\u201D\u4E0B\u7684\u201C\u90AE\u7BB1\u201D\u8FDB\u5165\u3002\r\n\r\n3\u3001\u5BA2\u6237\u7AEF\u767B\u5F55\r\n\u5347\u7EA7\u540E\uFF0C\u5BA2\u6237\u7AEF\uFF08foxmail\u3001outlook\uFF09\u767B\u5F55\u8D26\u53F7\u8FD8\u662F\u539F\u6765\u7684\u90AE\u7BB1\u8D26\u53F7\uFF0C\u4E0D\u8FC7\u5BC6\u7801\u5219\u6539\u4E3A\u7EDF\u4E00\u8EAB\u4EFD\u8BA4\u8BC1\u5E73\u53F0\u7684\u5BC6\u7801\uFF0C\u8BF7\u5728\u5BA2\u6237\u7AEF\u8F93\u5165\u65B0\u7684\u5BC6\u7801\u767B\u5F55\u90AE\u7BB1\u3002\r\n\r\n\u6E29\u99A8\u63D0\u793A\uFF1A\u4E3A\u4E86\u7535\u5B50\u90AE\u7BB1\u3001\u7EDF\u4E00\u8EAB\u4EFD\u8BA4\u8BC1\u5E73\u53F0\u7684\u5B89\u5168\uFF0C\u5EFA\u8BAE\u5E08\u751F\u767B\u5F55\u6821\u56ED\u7F51\u81EA\u52A9\u670D\u52A1\u5E73\u53F0\uFF08https://mynet.jnu.edu.cn/\uFF09,\u5C06\u5BC6\u7801\u4FEE\u6539\u4E3A\u590D\u6742\u5BC6\u7801\u3002\u4FEE\u6539\u540E\u7684\u65B0\u5BC6\u7801\u5C06\u4F5C\u4E3A\u5B66\u6821\u6570\u5B57\u6821\u56ED\u7EDF\u4E00\u8EAB\u4EFD\u8BA4\u8BC1\u3001\u4FE1\u606F\u95E8\u6237\u3001\u7F51\u4E0A\u670D\u52A1\u5927\u5385\u548C\u6821\u56ED\u7F51\u3001VPN\u3001\u90AE\u7BB1\u7B49\u4E1A\u52A1\u7684\u901A\u7528\u5BC6\u7801\uFF0C\u8BF7\u6CE8\u610F\u4FEE\u6539\u540E\u91C7\u7528\u65B0\u5BC6\u7801\u767B\u5F55\u4E0A\u8FF0\u4E1A\u52A1\u53CA\u7CFB\u7EDF\u3002\r\n\r\n\u54A8\u8BE2\u8054\u7CFB\u7535\u8BDD\uFF1A85220304  85220305\r\n\r\n\u7F51\u7EDC\u4E0E\u6559\u80B2\u6280\u672F\u4E2D\u5FC3\r\n\r\n2019\u5E743\u670828\u65E5");
		scrollPane.setViewportView(txtrhttpsmynetjnueducnhttpsmynetjnueducn);
		
		/*JPanel panel_6 = new JPanel();
		scrollPane.setColumnHeaderView(panel_6);
		panel_6.setLayout(null);
		
		JLabel label_26 = new JLabel("\u5173\u4E8E\u5347\u7EA7\u7535\u5B50\u90AE\u7BB1\u7CFB\u7EDF\u7684\u901A\u77E5");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("宋体", Font.PLAIN, 18));
		label_26.setBackground(Color.WHITE);
		label_26.setBounds(0, 0, 865, 35);
		panel_6.add(label_26);
		
		JLabel label_27 = new JLabel("\u8FD4\u56DE");
		
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setBounds(0, 0, 892, 18);
		panel_6.add(label_27);*/
		
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
				panel.removeAll();
				panel.add(panel_1);
				panel.add(panel_2);
				panel.updateUI();
			}
		});
		
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				panel.removeAll();
				panel.add(scrollPane);
				panel.updateUI();
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.add(panel_1);
				panel.add(panel_2);
				panel.updateUI();
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.add(panel_1);
				panel.add(panel_4);
				panel.updateUI();
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.add(panel_1);
				panel.add(panel_3);
				panel.updateUI();
			}
		});
		
	}
}
