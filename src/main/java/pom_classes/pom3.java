package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom3 {
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
	//initializtion
	public  pom3(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//utiliztion
	public void verifyuserID(String expID) {
		String actID =userID.getText();
		if(actID.equals(expID)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
	}

}
