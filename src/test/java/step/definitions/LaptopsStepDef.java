package step.definitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.LaptopsPage;
import page.objects.MacBookPage;

public class LaptopsStepDef extends Base {

	HomePage homePage = new HomePage();
	LaptopsPage laptopsPage = new LaptopsPage();
	MacBookPage macBookPage = new MacBookPage();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		homePage.clickOnLaptopsTab();
		logger.info("User clicked on Laptop & NoteBook tab");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		homePage.clickOnShowAllLaptops();
		logger.info("User clicked on Show All Laptop & NoteBook Option");
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopsPage.clickOnMacBookItem();
		logger.info("User clicked on Mac Book item");
		//UtilityClass.takeScreenShot(); 
	}
	@When("User click add to Cart button for Mac Book")
	public void user_click_add_to_cart_button_for_mac_book() {
		laptopsPage.clickOnAddCartMacBookBlue();
		logger.info("User clicked on Blue Add To Cart Button for MacBook");
		//UtilityClass.takeScreenShot(); 
	}
	//one method missing here 

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		Assert.assertTrue(laptopsPage.isCartSuccessMessageDisplayed());
		logger.info("Add to Cart Success Message is shown");
		//UtilityClass.takeScreenShot(); 
		
	}
	@When("^User should see ' 1 items' showed to the cart$")
	public void user_should_see_showed_to_the_cart() {
		Assert.assertTrue(laptopsPage.isItemAddedToBlackCartDisplayed());
		logger.info("'1-Items-602' message showed on the black cart!");
		//UtilityClass.takeScreenShot(); 
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopsPage.clickOnBlackCart();
		logger.info("User clicked on black cart button again");
		//UtilityClass.takeScreenShot(); 
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopsPage.clickOnRedRemoveButton();
		logger.info("User clicked on Remove from Cart button");
		//UtilityClass.takeScreenShot(); 
	}
	@Then("^item should be removed and cart should show ' 0 items'$")
	public void item_should_be_removed_and_cart_should_show() {
		Assert.assertTrue(laptopsPage.isItemRemovedFromBlackCartDisplayed());
		logger.info("Items removed from the black card shown");
		//UtilityClass.takeScreenShot(); 
	}

	// LaptopTest2
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopsPage.clickOnMacBookComprIcon();
		logger.info("User clicked on product comparison icon on ‘MacBook’");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopsPage.clickOnMacBookAirComprIcon();
		logger.info("User clicked on product comparison icon on ‘MacBook Air");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		Assert.assertTrue(laptopsPage.isSuccessMacBookAirDisplayed());
		logger.info("User was able to see a message ‘Success: You have added MacBook Air to your product comparison!’");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopsPage.clickOnProductComprLink();
		logger.info("User clicked on Product comparison link");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(laptopsPage.isComprChartDisplayed());
		logger.info("User was able to see Product Comparison Chart");

	}
}
