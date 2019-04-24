package WindowBuilder;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class template1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public template1() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 982, 524);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 982, 524);
		panel.add(panel_1);
		
		JButton button = new JButton("\u8BBA\u6587\u6A21\u677F");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		button.setBounds(396, 153, 150, 62);
		panel_1.add(button);
		
		JButton button_1 = new JButton("PPT\u6A21\u677F");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		button_1.setBounds(396, 215, 150, 54);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("\u5B9E\u9A8C\u62A5\u544A\u6A21\u677F");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		button_2.setBounds(396, 269, 150, 54);
		panel_1.add(button_2);

	}

}
