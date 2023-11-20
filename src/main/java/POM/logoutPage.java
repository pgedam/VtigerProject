package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPage {

	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	//Create a constructor
	public  LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Create a Method
	public LoginPage Logout() {
		logoutbtn.click();
		return new LoginPage();
	}
	public WebElement getLogoutbtn()
	{
		return  logoutbtn;
	}
		

	}

}
