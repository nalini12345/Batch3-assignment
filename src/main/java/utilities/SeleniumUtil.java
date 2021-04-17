package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumUtil {

	public WebDriver openApplication(String strBrowser, String appUrl) {

		WebDriver driver = null;

		try {
			if (strBrowser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (strBrowser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "src\\main\\resources\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (strBrowser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
				driver = new FirefoxDriver();
			}

			driver.manage().window().maximize();
			driver.get(appUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public void closeDriver(WebDriver driver) {
		driver.close();
	}

	public void quitDriver(WebDriver driver) {
		driver.quit();
	}

	public boolean switchToFrameByClassName(WebDriver driver, String val) {
		boolean bflg = false;
		try {
			List<WebElement> we = driver.findElements(By.tagName("iframe"));
			int ln = we.size();

			for (int i = 0; i < ln; i++) {
				if (we.get(i).getAttribute("class").equals(val)) {
					driver.switchTo().frame(i);
					bflg = true;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bflg;
	}

	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

}
