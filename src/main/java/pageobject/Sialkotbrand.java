package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sialkotbrand {
	public WebDriver driver;
	By Procuts = By.cssSelector("div[data-tracking='product-card']");

	public Sialkotbrand(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public int getSplinkscount() {

		int ww = driver.findElements(Procuts).size();
		return ww;
	}

}
