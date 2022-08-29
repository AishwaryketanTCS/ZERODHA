package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {
	@FindBy(xpath = " //input[@id='pin']")private WebElement PIN;
	@FindBy(xpath = " //button[@class='button-orange wide']")private WebElement cntbtn;

	public pom2(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void enterPIN (String pinvalue) {
		PIN.sendKeys(pinvalue);
	}
	public void clickcnBtn() {
		cntbtn.click();
	}
	}

