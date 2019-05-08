package WindowBuilder;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WorkInfo extends JPanel {

	/**
	 * Create the panel.
	 */
	public WorkInfo() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 524);
		add(panel);
		
		JLabel label = new JLabel("��ѯ��ҵ��Ϣ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, 24));
		label.setBounds(364, 74, 213, 37);
		panel.add(label);
		
		JLabel label_1 = new JLabel("ũ�й㶫ʡ����2019����У԰��Ƹ����");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				MainInterface.panel.removeAll();
				MainInterface.panel.add(new WorkDetail());
				MainInterface.panel.updateUI();
			}
		});
		label_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_1.setBounds(133, 141, 398, 37);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("2019-03-18");
		label_2.setForeground(new Color(100, 149, 237));
		label_2.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_2.setBounds(613, 141, 110, 37);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("ʱ���й�2019����У԰��Ƹ����");
		label_3.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_3.setBounds(133, 191, 398, 37);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("2019-03-16");
		label_4.setForeground(new Color(100, 149, 237));
		label_4.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_4.setBounds(613, 191, 110, 37);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("�㷢��2019����У԰������һyoung�ľ���");
		label_5.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_5.setBounds(133, 241, 398, 37);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("2019-03-06");
		label_6.setForeground(new Color(100, 149, 237));
		label_6.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_6.setBounds(613, 241, 110, 37);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("�пϼ�����Ƹ����");
		label_7.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_7.setBounds(133, 291, 398, 37);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("2018������ȫ���ѧ��˫ѡ��Ƹ��");
		label_8.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_8.setBounds(133, 341, 398, 37);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("2019-02-28");
		label_9.setForeground(new Color(100, 149, 237));
		label_9.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_9.setBounds(613, 291, 110, 37);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("2018-12-13");
		label_10.setForeground(new Color(100, 149, 237));
		label_10.setFont(new Font("Dialog", Font.PLAIN, 18));
		label_10.setBounds(613, 341, 110, 37);
		panel.add(label_10);

	}
}
