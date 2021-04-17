package stepdef;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.ControlGroupPage;
import pageobjectmodel.HomePage;
import utilities.SeleniumUtil;

public class ControlGroup_StepDef {

	WebDriver driver;
	SeleniumUtil objSel = new SeleniumUtil();
	HomePage objHome;
	ControlGroupPage objControl;

	@When("^I select Controlgroup option from left menu under interactions$")
	public void i_select_Controlgroup_option_from_left_menu_under_interactions() throws Throwable {
		driver = testdata.SeleniumAssignment_TestData.driver;
		objHome = new HomePage(driver);
		objHome.clickOnControlGroup();
	}

	@When("^enter booking details for Horizontal orientation like Vehicle Option \"([^\"]*)\" Type \"([^\"]*)\" number \"([^\"]*)\"$")
	public void enter_booking_details_for_Horizontal_orientation_like_Vehicle_Option_Type_number(String arg1,
			String arg2, String arg3) throws Throwable {
		objControl = new ControlGroupPage(driver);
		try {
			objControl.selectRentalCar(arg1);
			objControl.selectRadioButton(arg2);
			objControl.enterNoOfCars(arg3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^enter booking details for Vertical orintation like Vehicle Option \"([^\"]*)\" Type \"([^\"]*)\" number \"([^\"]*)\"$")
	public void enter_booking_details_for_Vertical_orintation_like_Vehicle_Option_Type_number(String arg1, String arg2,
			String arg3) throws Throwable {
		try {
			objControl.selectRentalCar2(arg1);
			objControl.selectRadioButton2(arg2);
			objControl.enterNoOfCars2(arg3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^opt for Insurance for either case$")
	public void opt_for_Insurance_for_either_case() throws Throwable {
		try {
			objControl.insuranceCheckBox();
			objControl.insuranceCheckBox2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^click on Book Now Button$")
	public void click_on_Book_Now_Button() throws Throwable {
		objControl.clickOnBookBtn2();

	}

	@Then("^Booking should be Successful$")
	public void booking_should_be_Successful() throws Throwable {

	}

	@After("@ControlGroup")
	public void tear() {
		objSel.closeDriver(driver);
	}
}
