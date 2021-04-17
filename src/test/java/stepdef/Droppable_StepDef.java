package stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.DroppablePage;
import pageobjectmodel.HomePage;
import utilities.SeleniumUtil;

public class Droppable_StepDef {

	WebDriver driver;
	SeleniumUtil objSel = new SeleniumUtil();
	DroppablePage objDrop;
	HomePage objHome;

	@When("^I select Droppable option from left menu under interactions$")
	public void i_select_Droppable_option_from_left_menu_under_interactions() throws Throwable {
		driver = testdata.SeleniumAssignment_TestData.driver;
		objHome = new HomePage(driver);
		objHome.clickOnDroppableLink();

	}

	@When("^Drag Drag me to my target component to Drop here component$")
	public void drag_Drag_me_to_my_target_component_to_Drop_here_component() throws Throwable {

		objDrop = new DroppablePage(driver);
		try {
			objDrop.dragAndDropElement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^I should be able to able to drag and drop$")
	public void i_should_be_able_to_able_to_drag_and_drop() throws Throwable {
		Assert.assertEquals(objDrop.isDropped(), true);

	}

	@After("@DragAndDrop")
	public void tear() {
		objSel.closeDriver(driver);
	}

}
