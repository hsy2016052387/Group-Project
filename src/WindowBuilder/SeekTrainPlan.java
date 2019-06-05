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
		DefaultTableModel tm=new DefaultTableModel();
		tm.setRowCount(14);
		tm.setColumnCount(6);
		//tm.isCellEditable( 16, 10 );
		 tm.setValueAt( "\u9009\u4fee", 3, 0);//对一个合并的单元格填一个数据。
		 tm.setValueAt("\u901a\u8bc6\u6559\u80b2", 3, 1);
		 tm.setValueAt("\u5b66\u4e60\u6a21\u5757", 0, 0);
		 tm.setValueAt("\u603b\u5b66\u5206", 1, 0);
		 tm.setValueAt("\u5fc5\u4fee", 2, 0);
		 tm.setValueAt("\u8981\u6c42", 0, 3);
		 tm.setValueAt("\u5df2\u4fee", 0, 4);
		 tm.setValueAt("\u8fd8\u5dee", 0, 5);
		 tm.setValueAt("\u827a\u672f\u7d20\u517b", 3, 2);
		 tm.setValueAt("\u6587\u53f2\u54f2\u7c7b", 4, 2);
		 tm.setValueAt("\u7ecf\u7ba1\u6cd5\u7c7b", 5, 2);
		 tm.setValueAt("\u6570\u7406\u5de5\u7c7b", 6, 2);
		 tm.setValueAt("\u751f\u547d\u7c7b", 7, 2);
		 tm.setValueAt("\u5176\u5b83\u7c7b", 8, 2);
		 tm.setValueAt("\u901a\u8bc6\u5c0f\u8ba1", 9, 2);
		 tm.setValueAt("\u57fa\u7840\u6559\u80b2", 10, 1);
		 tm.setValueAt("\u4e13\u4e1a\u6559\u80b2", 11, 1);
		 tm.setValueAt("\u8de8\u4e13\u4e1a\u8bfe\u7a0b", 12, 1);
		 tm.setValueAt("\u9009\u4fee\u5408\u8ba1", 13, 1);
		 CTable cTable=new CTable(m, tm);
		 cTable.getTableHeader().setVisible(false);
		 cTable.setRowHeight(29);
		 JScrollPane pane=new JScrollPane(cTable);
		 
		for(int i=1;i<t.size();i++) {
			Elements tds=t.get(i).select("td");
			tm.setValueAt(tds.get(0).text(), i,3 );
			tm.setValueAt(tds.get(1).text(), i,4 );
			tm.setValueAt(tds.get(2).text(), i,5 );
		}
		 
		 pane.setBounds(28, 65, 940, 446);
		 cTable.setBounds(28, 65, 940, 446);
		 panel1.add(cTable);
		 
		 JLabel lblNewLabel = new JLabel("\u57f9\u517b\u65b9\u6848");
		 lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		 lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel.setBounds(428, 26, 92, 18);
		 panel1.add(lblNewLabel);
	}
}
