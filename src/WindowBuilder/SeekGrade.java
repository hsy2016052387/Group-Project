package WindowBuilder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import org.apache.bcel.generic.NEW;
import org.eclipse.swt.widgets.Table;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import ClassLibrary.LogOffice;
import ClassLibrary.SaveData;
import ClassLibrary.Score;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SeekGrade extends JPanel {
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
		
		String[] arr1=new String[] {"\u5b66\u5e74","\u5b66\u671f","\u8bfe\u7a0b\u540d\u79f0","\u5b66\u5206","\u6210\u7ee9","\u7ee9\u70b9","\u8003\u8bd5\u65e5\u671f","\u6027\u8d28","\u7c7b\u522b","\u4f11\u5b66\u7c7b\u522b","\u53d6\u6d88\u5426"};
		Object[][] cellData = null;
		//table = new JTable(,arr1);
		//DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
		DefaultTableModel tableModel=new DefaultTableModel(null, arr1);
		tableModel.setRowCount(0);
		tableModel.setColumnCount(11);
		for(Score score:Login.user.GetScores()) {
			String[] arr=new String[11];
			arr[0]=score.getAcademic_year();
		    arr[1]=score.getTerm();
		    arr[2]=score.getCourse();
		    arr[3]=score.getCredit();
		    arr[4]=score.getGrades();
		    arr[5]=score.getGPA();
		    arr[6]=score.getExam_date();
		    arr[7]=score.getExam_properties();
		    arr[8]=score.getCourse_type();
		    arr[9]=score.getStudy_type();
		    arr[10]=score.getStatus();
			tableModel.addRow(arr);
		}
		JTable table =new JTable(tableModel);
		table.invalidate();
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(28, 65, 940, 446);
		table.setRowHeight(30);
		//添加滚动条
        //table.setPreferredScrollableViewportSize(new Dimension(450,63));
        //table.setFillsViewportHeight(true);
        
		JScrollPane jScrollPane=new JScrollPane(table);
		jScrollPane.setVisible(true);
		jScrollPane.setBounds(28, 65, 940, 446);
		SeekGrade_panel.add(jScrollPane);
		
		JLabel lblNewLabel_4 = new JLabel("\u5168\u90E8\u6210\u7EE9");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(431, 13, 99, 39);
		SeekGrade_panel.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//先从网站上更新user成绩再序列化保存成绩
				Login.l.GetScoreTable();
				SaveData saveData=new SaveData("../data/score/"+Login.user.GetAccount()+".txt");
				saveData.save(Login.user.GetScores());
			}
		});
		btnNewButton_1.setForeground(new Color(0, 102, 255));
		btnNewButton_1.setBackground(Color.WHITE);
		String path = this.getClass().getClassLoader().getResource(".").getPath();
		btnNewButton_1.setIcon(new ImageIcon(path+"../images/download.png"));
		btnNewButton_1.setBounds(670, 13, 50, 39);
		btnNewButton_1.setBorder(null);
		SeekGrade_panel.add(btnNewButton_1);
	}
}

