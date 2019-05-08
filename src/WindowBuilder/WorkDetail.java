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
		textArea.setFont(new Font("宋体", Font.PLAIN, 17));
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setText("\t\t\t\t农行广东省分行2019年春季校园招聘公告\r\n\r\n中国农业银行是一家服务城乡、融入国际、功能齐全、实力雄厚的一流现代化商业银行。广东省分行是农行系统内经营规模、经营业绩均名列前茅的一级分行。共有22 个二级分行，在职员工3.1万人，1600多个营业网点。 \r\n中国农业银行广东省分行通过建立先进的岗位管理体系、绩效管理体系、薪酬福利体系以及人才培养体系，为广大毕业生提供广阔的职业发展空间、良好的职业发展平台和有竞争力的职业发展待遇一、招聘需求\r\n（一）综合业务岗。该岗位主要为我行培养、储备专业人才和管理人才。根据未来职业发展情况，将主要从事柜面服务、综合营销、国际业务、财务会计、业务运营、风险控制、法律合规等专业工作或各分支机构管理岗位工作。\r\n（二）信息科技岗。承担应用系统研发、测试、运维，产品创新研发及推动，信息安全、信息科技风险及组织信息系统应急演练，基础设施运维、日常巡检管理及安全防范等工作。\r\n每人最多可投报2个岗位。具体的岗位职责说明和要求请登录中国农业银行招聘网站（http://job.abchina.com）查看。");
		scrollPane_1.setViewportView(textArea);
		textArea.setRows(500);
		
		JButton button = new JButton("返回");
		button.setFont(new Font("宋体", Font.PLAIN, 15));
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