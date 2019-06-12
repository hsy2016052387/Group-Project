package ClassLibrary;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;
 
/**
 * 默认文字提示功能
 * @author User
 *
 */
public class TextFieldHintListener implements FocusListener{
	
	private String hintText;
	private JTextField textField;
	
	public TextFieldHintListener(JTextField textField2,String hintText) {
		this.textField = textField2;
		this.hintText = hintText;
		textField2.setText(hintText);  //默认直接显示
		textField2.setForeground(Color.GRAY);
	}
 
	@Override
	public void focusGained(FocusEvent e) {
		//获取焦点时，清空提示内容
		String temp = textField.getText();
		if(temp.equals(hintText)) {
			textField.setText("");
			textField.setForeground(Color.BLACK);
		}
	}
 
	@Override
	public void focusLost(FocusEvent e) {
		//失去焦点时，没有输入内容，显示提示内容
		String temp = textField.getText();
		if(temp.equals("")) {
			textField.setForeground(Color.GRAY);
			textField.setText(hintText);
		}
	}
 
}