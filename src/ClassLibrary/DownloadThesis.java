package ClassLibrary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;



import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class DownloadThesis {

	public JFrame frame_1;
	private JTextField textField;
	private JTextField textField_1;
	public static String destFileName;
	public static String destPath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DownloadThesis window = new DownloadThesis();
					window.frame_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void copyFile(File source, File dest)
	        throws IOException {    
	        Files.copy(source.toPath(), dest.toPath());
	}

	/**
	 * Create the application.
	 */
	public DownloadThesis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		 frame_1 = new JFrame();
		frame_1.setTitle("\u6A21\u677F\u4E0B\u8F7D");
		frame_1.setResizable(false);
		frame_1.setSize(450, 300);
		frame_1.setLocationRelativeTo(null);//在屏幕中居中显示
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("\u6A21\u677F\u7C7B\u578B\uFF1A");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u8bfe\u7a0b\u8bba\u6587\u6a21\u677f","\u8bf7\u5047\u6761\u6a21\u677f","\u5b9e\u9a8c\u62a5\u544a\u6a21\u677f"}));
		
		JLabel lblNewLabel = new JLabel("\u6587\u4EF6\u547D\u540D\uFF1A");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setColumns(15);
		textField.setText("\u8bba\u6587.doc");
		destFileName = textField.getText();
		
		JLabel label_1 = new JLabel("\u4FDD\u5B58\u4F4D\u7F6E\uFF1A");
		
		textField_1 = new JTextField();
		textField_1.setColumns(15);
		
		JButton button = new JButton("\u4E0B\u8F7D");
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO
				File source = new File("./documentTemplate/\u8bba\u6587.docx");
				File dest = new File(destPath+destFileName);
				try {
					copyFile(source, dest);
				} catch (IOException e1) {
					// TODO 自动生成�? catch �?
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(frame_1, "\u4e0b\u8f7d\u6210\u529f", "\u63d0\u793a\u4fe1\u606f", JOptionPane.PLAIN_MESSAGE);

			}
		});
		
		JButton btnNewButton = new JButton("S");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO
				JFileChooser fileChooser = new JFileChooser("D:\\");
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal = fileChooser.showOpenDialog(fileChooser);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					String filePath = fileChooser.getSelectedFile().getAbsolutePath();
					textField_1.setText(filePath);
					destPath = textField_1.getText()+"\\";
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame_1.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(118, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1)
							.addGap(18)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addGap(18)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(110))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(181)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(186, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(button)
					.addGap(36))
		);
		
		
		frame_1.getContentPane().setLayout(groupLayout);
	}
}
