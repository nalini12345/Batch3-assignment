package stepdef;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.HomePage;
import pageobjectmodel.SelectablePage;
import utilities.ArrayUtil;
import utilities.SeleniumUtil;

public class Selectable_StepDef {

	WebDriver driver;
	SeleniumUtil objSel = new SeleniumUtil();
	HomePage objHome;
	SelectablePage objSelect;

	@Given("^I am on home page of application \"([^\"]*)\"$")
	public void i_am_on_home_page_of_application(String arg1) throws Throwable {
		testdata.SeleniumAssignment_TestData.driver = objSel.openApplication("Chrome", arg1);
	}

	@When("^I select Selectable option from left menu under interactions$")
	public void i_select_Selectable_option_from_left_menu_under_interactions() throws Throwable {
		driver = testdata.SeleniumAssignment_TestData.driver;
		objHome = new HomePage(driver);
		objHome.clickOnSelectableLink();
	}

	@When("^Select items \"([^\"]*)\" from options$")
	public void select_items_from_options(String arg1) throws Throwable {
		objSelect = new SelectablePage(driver);
		String[] arr = arg1.split(";");
		List<String> lst = ArrayUtil.arrayToList(arr);
		try {
			objSelect.selectItems(lst);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^I should be able to verify that the multiple select option is allowed$")
	public void i_should_be_able_to_verify_that_the_multiple_select_option_is_allowed() throws Throwable {

	}

	@After("@MultipleSelect")
	public void tear() {
		objSel.closeDriver(driver);
	}
}
