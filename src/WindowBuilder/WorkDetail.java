package WindowBuilder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WorkDetail extends JPanel {

	/**
	 * Create the panel.
	 */
	public WorkDetail() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 982, 524);
		add(panel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(0, 31, 982, 493);
		panel.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setText("\t\t\t\tũ�й㶫ʡ����2019�괺��У԰��Ƹ����\r\n\r\n�й�ũҵ������һ�ҷ�����硢������ʡ�������ȫ��ʵ���ۺ��һ���ִ�����ҵ���С��㶫ʡ������ũ��ϵͳ�ھ�Ӫ��ģ����Ӫҵ��������ǰé��һ�����С�����22 ���������У���ְԱ��3.1���ˣ�1600���Ӫҵ���㡣 \r\n�й�ũҵ���й㶫ʡ����ͨ�������Ƚ��ĸ�λ������ϵ����Ч������ϵ��н�긣����ϵ�Լ��˲�������ϵ��Ϊ����ҵ���ṩ������ְҵ��չ�ռ䡢���õ�ְҵ��չƽ̨���о�������ְҵ��չ����һ����Ƹ����\r\n��һ���ۺ�ҵ��ڡ��ø�λ��ҪΪ��������������רҵ�˲ź͹����˲š�����δ��ְҵ��չ���������Ҫ���¹�������ۺ�Ӫ��������ҵ�񡢲����ơ�ҵ����Ӫ�����տ��ơ����ɺϹ��רҵ���������֧���������λ������\r\n��������Ϣ�Ƽ��ڡ��е�Ӧ��ϵͳ�з������ԡ���ά����Ʒ�����з����ƶ�����Ϣ��ȫ����Ϣ�Ƽ����ռ���֯��ϢϵͳӦ��������������ʩ��ά���ճ�Ѳ�������ȫ�����ȹ�����\r\nÿ������Ͷ��2����λ������ĸ�λְ��˵����Ҫ�����¼�й�ũҵ������Ƹ��վ��http://job.abchina.com���鿴��");
		scrollPane_1.setViewportView(textArea);
		textArea.setRows(500);
		
		JButton button = new JButton("����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainInterface.panel.removeAll();
				MainInterface.panel.add(new WorkInfo());
				MainInterface.panel.updateUI();
			}
		});
		button.setBounds(0, 0, 110, 32);
		panel.add(button);
		
	}
}
