package WindowBuilder;


//package com.sinosoft.speech.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

/**

 * @author lijunming

 * @date 2018/7/22 ����6:00

 */

public class BrowserPanel extends JPanel{
	private JWebBrowser browser;
	public JWebBrowser getBrowser() {
		return browser;
	}
	private void setBrowser(JWebBrowser browser) {
		this.browser=browser;
	}
	public BrowserPanel(String url) {
		//UIUtils.setPreferredLookAndFeel();
		//NativeInterface.open();
		setLayout(new BorderLayout());
		setBounds(0, 0, 982, 524);
		browser=new JWebBrowser();
		browser.navigate(url);
		browser.setBarsVisible(false);
		browser.setButtonBarVisible(false);
		browser.setMenuBarVisible(false);
		browser.setStatusBarVisible(false);
		add(browser,BorderLayout.CENTER);
	}
}

