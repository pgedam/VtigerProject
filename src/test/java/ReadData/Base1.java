package ReadData;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM.LoginPage;
import POM.logoutPage;

public class Base1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");	
		
		LoginPage lp = new LoginPage(driver);
		lp.Login("admin", "manager");
		
		LogoutPage lo = new LogoutPage(driver);
		lo.Logout();
		
		
//		PageFactory.initElements(driver, lp);
//		lp.getUsernametf().sendKeys("admin");
//		lp.getPasswordtf().sendKeys("manager");
//		lp.getCheckbox().click();
//		lp.getLoginbtn().click();
//		lp.getLogoutbtn().click();
//		
		

	}

}
