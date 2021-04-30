package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	// Page Elements
	@FindBy(name = "q")
	WebElement search;

	@FindBy(className = "yuRUbf")
	WebElement link;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage searchWord() {
		
		if (search.isDisplayed()) {
		search.clear();
		search.sendKeys("ducks");
		}
		search.sendKeys(Keys.ENTER);

		return new HomePage();

	}

	public boolean linkIsPresent() {
		boolean result = link.isEnabled();
		return result;
	}

	public void clickLink() {

		if (link.isEnabled()) {
			link.click();
		}

	}

	public HomePage searchOtherWord() {

		if (search.isDisplayed()) {
			search.clear();
			search.sendKeys("eagle");
		}

		search.sendKeys(Keys.ENTER);

		return new HomePage();

	}

	public HomePage searchSpecialChars() {

		if (search.isDisplayed()) {
			search.clear();
			search.sendKeys("#$%&");
		}

		search.sendKeys(Keys.ENTER);

		return new HomePage();

	}
}
