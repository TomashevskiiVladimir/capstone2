package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class MacBookPage extends Base{
	
	public MacBookPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//div [text() = 'Success: You have added ']")
	private WebElement successAlert;
	
	@FindBy (xpath = "//span [text() = ' 1 item(s) - $602.00']")
	private WebElement cartTotal;
	
	@FindBy(xpath = "//button//span [@id = 'cart-total']")
	private WebElement cartOption;
	
	@FindBy(xpath = "//button [@title = 'Remove']")
	private WebElement redXButton;
	
	@FindBy (xpath = "//span [text() = ' 0 item(s) - $0.00']")
	private WebElement cartTotal0;
	
	public void clickOnCartButton() {
		addToCartButton.click();
	}
	
	public boolean isSuccessAlertDisplayed() {
		if(successAlert.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean isCartTotalDisplayed() {
		if(cartTotal.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnCartOption() {
		cartOption.click();
	}
	
	public void clickOnRedXButton() {
		redXButton.click();
	}
	
	public boolean isCartTotal0Displayed() {
		if(cartTotal0.isDisplayed())
			return true;
		else
			return false;
	}
	
	
}
