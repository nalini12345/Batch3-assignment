package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtil;

public class SelectablePage {

	WebDriver driver;
	WebDriverWait wait;

	By selectableElements = By.xpath("//*[@id='selectable']/li");

	public SelectablePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);

	}

	public void selectItems(List<String> list) throws InterruptedException {

		scrollBy(driver);

		new SeleniumUtil().switchToFrameByClassName(driver, "demo-frame");

		Actions act = new Actions(driver);

		List<WebElement> wElements = driver.findElements(selectableElements);
		int n = wElements.size();
		act.keyDown(Keys.CONTROL).build().perform();

		for (int i = 0; i < n; i++) {
			WebElement wElement = wElements.get(i);
			String val = wElement.getText();
			if (list.contains(val.trim())) {
				act.moveToElement(wElement).build().perform();
				wElement.click();
				Thread.sleep(2000);
			}
		}
		act.keyUp(Keys.CONTROL).build().perform();
	}

	public int getOptionsSize() {
		return driver.findElements(selectableElements).size();
	}

	public void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,250);");
	}

}
