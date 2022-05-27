package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsPage extends Base{
	public LaptopsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img [@title = 'MacBook']")
	private WebElement macBookItem;
	
	@FindBy (xpath = "//button[@onclick = \"compare.add('43');\"]")
	private WebElement macBookComprIcon;
	
	@FindBy (xpath = "//button[@onclick = \"compare.add('44');\"]")
	private WebElement macBookAirComprIcon;
	
	@FindBy (xpath = "//div//a[@href='http://tek-school.com/retail/index.php?route=product/product&product_id=44']")
	private WebElement SuccessMacBookAir;
	
	@FindBy (xpath = "//a[text() = 'product comparison']")
	private WebElement productComprLink;
	
	@FindBy (xpath = "//h1[text() = 'Product Comparison']")
	private WebElement comprChart;
	@FindBy(xpath = "//a[normalize-space()='MacBook']")
	private WebElement macBookItem1;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartBlueButton;

	@FindBy(xpath = "//div[text()='Success: You have added ']//a[text()='MacBook']")
	private WebElement macBookSuccessMessageAddToCart;

	@FindBy(xpath = "//h2[normalize-space()='$602.00']")
	private WebElement amountText;

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement blackCartButton;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement cartRemoveButton;

	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement blackCartEmptyButton;
	public void clickOnMacBook() {
		macBookItem.click();
	}
	public void clickOnMacBookComprIcon() {
		macBookComprIcon.click();
	}
	public void clickOnMacBookAirComprIcon() {
		macBookAirComprIcon.click();
	}
	public boolean isSuccessMacBookAirDisplayed() {
		if (SuccessMacBookAir.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnProductComprLink() {
		productComprLink.click();
	}
	
	public boolean isComprChartDisplayed() {
		if (comprChart.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	public void clickOnMacBookItem() {
		macBookItem.click();
	}

	public void clickOnAddCartMacBookBlue() {
		addToCartBlueButton.click();
	}

	public boolean isCartSuccessMessageDisplayed() {
		if (macBookSuccessMessageAddToCart.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isItemAddedToBlackCartDisplayed() {
		String actualPurchaseValue = amountText.getText();
		String expectePurchaseValue = "$602.00";
		if (blackCartButton.isDisplayed() && actualPurchaseValue.equals(expectePurchaseValue)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnBlackCart() {
		blackCartButton.click();
	}

	public void clickOnRedRemoveButton() {
		cartRemoveButton.click();
	}

	public boolean isItemRemovedFromBlackCartDisplayed() {
		if (blackCartEmptyButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	
	
	
	
	
	
}
