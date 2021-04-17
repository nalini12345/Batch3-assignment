package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtil;

public class ControlGroupPage {

	WebDriver driver;
	WebDriverWait wait;

	By carTypeButton = By.xpath("//*[@id='car-type-button']");
	By carTypeList = By.xpath("//*[@id='car-type-menu']/li");
	By automaticRadioButton = By.xpath("/html/body/div[1]/fieldset[1]/div/label[2]/span[1]");
	By standardRadioButton = By.xpath("/html/body/div[1]/fieldset[1]/div/label[1]/span[1]");
	By insuranceCheckBox = By.xpath("/html/body/div[1]/fieldset[1]/div/label[3]/span[1]");
	By spinOfCars = By.xpath("//*[@id='horizontal-spinner']");
	By btnBookNow = By.xpath("/html/body/div[1]/fieldset[1]/div/button");

	By carTypeButton2 = By.xpath("//*[@id='ui-id-8-button']");
	By carTypeList2 = By.xpath("//*[@id='ui-id-8-menu']/li");
	By automaticRadioButton2 = By.xpath("/html/body/div[1]/fieldset[2]/div/label[2]/span[1]");
	By standardRadioButton2 = By.xpath("/html/body/div[1]/fieldset[2]/div/label[1]/span[1]");
	By insuranceCheckBox2 = By.xpath("/html/body/div[1]/fieldset[2]/div/label[3]/span[1]");
	By spinOfCars2 = By.xpath("//*[@id='vertical-spinner']");
	By btnBookNow2 = By.xpath("/html/body/div[1]/fieldset[2]/div/button");

	public ControlGroupPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);
		new SeleniumUtil().switchToFrameByClassName(driver, "demo-frame");
	}

	public void selectRadioButton(String strRadioOpt) {
		if (strRadioOpt.equalsIgnoreCase("Automatic"))
			driver.findElement(automaticRadioButton).click();
		else if (strRadioOpt.equalsIgnoreCase("Standard"))
			driver.findElement(standardRadioButton).click();
	}

	public void insuranceCheckBox() {
		if (!driver.findElement(insuranceCheckBox).isSelected())
			driver.findElement(insuranceCheckBox).click();
	}

	public void selectRentalCar(String strVal) {

		driver.findElement(carTypeButton).click();
		List<WebElement> wElements = driver.findElements(carTypeList);
		for (int i = 0; i < wElements.size(); i++) {
			WebElement wElement = wElements.get(i);
			if (wElement.getText().equals(strVal)) {
				wElement.click();
				break;
			}
		}
	}

	public void enterNoOfCars(String strVal) {
		driver.findElement(spinOfCars).sendKeys(strVal);
	}

	public void clickOnBookBtn() {
		driver.findElement(btnBookNow).click();
	}

	public void selectRadioButton2(String strRadioOpt) {
		if (strRadioOpt.equalsIgnoreCase("Automatic"))
			driver.findElement(automaticRadioButton2).click();
		else if (strRadioOpt.equalsIgnoreCase("Standard"))
			driver.findElement(standardRadioButton2).click();
	}

	public void insuranceCheckBox2() {
		if (!driver.findElement(insuranceCheckBox2).isSelected())
			driver.findElement(insuranceCheckBox2).click();
	}

	public void selectRentalCar2(String strVal) {

		driver.findElement(carTypeButton2).click();
		List<WebElement> wElements = driver.findElements(carTypeList2);
		for (int i = 0; i < wElements.size(); i++) {
			WebElement wElement = wElements.get(i);
			if (wElement.getText().equals(strVal)) {
				wElement.click();
				break;
			}
		}
	}

	public void enterNoOfCars2(String strVal) {
		driver.findElement(spinOfCars2).sendKeys(strVal);
	}

	public void clickOnBookBtn2() {
		driver.findElement(btnBookNow2).click();
	}
}
