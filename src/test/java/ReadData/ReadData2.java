package ReadData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//To read data from external resource
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Data.properties");
		
		//To read data from property file
		Properties p = new Properties();
		
		//To read the location of property file
		p.load(fis);
		
		//To read key from property file
		String URLS = p.getProperty("urlskillrary");
		
		driver.get(URLS);
		
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		String EMAIL = p.getProperty("email");
		String PASSWORD = p.getProperty("passkillrary");
		
		
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		
	}

}

	
