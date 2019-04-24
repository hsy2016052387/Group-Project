package WindowBuilder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SeekGrade extends JPanel {
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public SeekGrade() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel SeekGrade_panel = new JPanel();
		SeekGrade_panel.setBackground(Color.WHITE);
		SeekGrade_panel.setBounds(0, 0, 982, 524);
		add(SeekGrade_panel);
		SeekGrade_panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(160, 76, 223, 33);
		SeekGrade_panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u641C\u7D22\u8BE5\u79D1\u6210\u7EE9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(430, 76, 160, 33);
		SeekGrade_panel.add(btnNewButton);
		
		JButton button = new JButton("\u91CD\u7F6E");
		button.setBounds(635, 76, 113, 33);
		SeekGrade_panel.add(button);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u5B66\u5E74", "\u5B66\u671F", "\u8BFE\u7A0B\u540D\u79F0", "\u5B66\u5206", "\u6210\u7EE9", "\u8003\u8BD5\u65E5\u671F", "\u8003\u8BD5\u6027\u8D28", "\u8BFE\u7A0B\u7C7B\u522B", "\u4FEE\u5B66\u7C7B\u522B", "\u53D6\u6D88\u5426"},
				{"C++", null, null, null, null, null, null, null, null, null},
				{"Linux", null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(84);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(160, 206, 665, 90);
		table.setRowHeight(30);
		SeekGrade_panel.add(table);
		
		JLabel lblNewLabel_4 = new JLabel("\u5168\u90E8\u6210\u7EE9");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(430, 135, 99, 39);
		SeekGrade_panel.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setForeground(new Color(0, 102, 255));
		btnNewButton_1.setBackground(Color.WHITE);
		String path = this.getClass().getClassLoader().getResource(".").getPath();
		btnNewButton_1.setIcon(new ImageIcon(path+"../images/download.png"));
		btnNewButton_1.setBounds(692, 135, 50, 39);
		btnNewButton_1.setBorder(null);
		SeekGrade_panel.add(btnNewButton_1);
	}
}
