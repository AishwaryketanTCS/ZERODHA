package base_class;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_withDDF.KiteHomePage;
import POM_withDDF.KiteLogin2Page;
import POM_withDDF.KiteLoginPage1;
import pom_classes.pom1;
import pom_classes.pom2;
import pom_classes.pom3;

public class test_class extends base1{
	pom1 login1;
	pom2 login2;
	pom3 home;
	
	public static void main(String[] args) throws Throwable {
		FileInputStream File = new FileInputStream("C:\\Users\\Ketan\\OneDrive\\Documents\\zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(File).getSheet("ZERODHA");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ketan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//call 1st pom class
		KiteLoginPage1 login1= new KiteLoginPage1(driver);
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		login1.enterUN(username);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		login1.enterPWD(password);
		login1.clickLOGINBTN();
		
		
		//call2nd pom class
		KiteLogin2Page login2= new KiteLogin2Page(driver);
		String pinvalue = sh.getRow(0).getCell(2).getStringCellValue();
		
		login2.clickcnBtn();
		//call 3rd pom class    
		KiteHomePage home= new KiteHomePage(driver);
		String expuserid = sh.getRow(0).getCell(0).getStringCellValue();
		home.verifyuserID(expuserid);
		driver.close();
	}
	}

}
