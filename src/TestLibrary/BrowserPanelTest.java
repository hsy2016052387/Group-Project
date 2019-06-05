package TestLibrary;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import WindowBuilder.BrowserPanel;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class BrowserPanelTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBrowser() {
		String url = "www.baidu.com";
		BrowserPanel broswerPanel = new BrowserPanel(url);
		JWebBrowser browser = broswerPanel.getBrowser();
		
		int width = broswerPanel.getWidth();
		int height = broswerPanel.getHeight();
		
		assertEquals(width, 982);  // 测试宽度
		assertEquals(height, 524);  // 测试高度
		
		boolean visible = browser.isVisible();
		boolean buttonBarVisible = browser.isButtonBarVisible();
		boolean menuBarVisible = browser.isMenuBarVisible();
		boolean statusBarVisible = browser.isStatusBarVisible();
		
		assertEquals(visible, true);  // 测试可见
		assertEquals(buttonBarVisible, false);  // 测试 ButtonBars 不可见
		assertEquals(menuBarVisible, false);  // 测试 MenuBar 不可见
		assertEquals(statusBarVisible, false);  // 测试 StatusBar 不可见
	}
	
}
