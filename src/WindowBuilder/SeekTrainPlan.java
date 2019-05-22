package WindowBuilder;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


import org.jsoup.select.Elements;

import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class SeekTrainPlan extends JPanel {
	private JTable table;

	public SeekTrainPlan(Elements t) {
		// TODO 自动生成的构造函数存根
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(0, 0, 992, 524);
		add(panel1);
		
		CMap m = new CMap1();
		DefaultTableModel tm = new DefaultTableModel( 14, 6 );
		//tm.isCellEditable( 16, 10 );
		 tm.setValueAt( "选修", 3, 0);//对一个合并的单元格填一个数据。
		 tm.setValueAt("通识教育", 3, 1);
		 tm.setValueAt("学习模块", 0, 0);
		 tm.setValueAt("总学分", 1, 0);
		 tm.setValueAt("必修", 2, 0);
		 tm.setValueAt("要求", 0, 3);
		 tm.setValueAt("已修", 0, 4);
		 tm.setValueAt("还差", 0, 5);
		 tm.setValueAt("艺术素养", 3, 2);
		 tm.setValueAt("文史哲类", 4, 2);
		 tm.setValueAt("经管法类", 5, 2);
		 tm.setValueAt("数理工类", 6, 2);
		 tm.setValueAt("生命类", 7, 2);
		 tm.setValueAt("其它类", 8, 2);
		 tm.setValueAt("通识小计", 9, 2);
		 tm.setValueAt("基础教育", 10, 1);
		 tm.setValueAt("专业教育", 11, 1);
		 tm.setValueAt("跨专业课程", 12, 1);
		 tm.setValueAt("选修合计", 13, 1);
		 CTable cTable=new CTable(m, tm);
		 cTable.setRowHeight(29);
		 cTable.setBounds(28, 65, 940, 446);
		 cTable.getTableHeader().setVisible(false);
		 JScrollPane pane=new JScrollPane(cTable);
		 
		for(int i=1;i<t.size();i++) {
			Elements tds=t.get(i).select("td");
			tm.setValueAt(tds.get(0).text(), i,3 );
			tm.setValueAt(tds.get(1).text(), i,4 );
			tm.setValueAt(tds.get(2).text(), i,5 );
		}
		 
		 pane.setBounds(28, 65, 940, 446);
		 panel1.add(cTable);
		 
		 JLabel lblNewLabel = new JLabel("培养方案");
		 lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		 lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel.setBounds(428, 26, 92, 18);
		 panel1.add(lblNewLabel);
	}
}
