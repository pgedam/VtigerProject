package ReadData;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 //jse.executeScript("window.alert('Good Morning')");
		 jse.executeAsyncScript("window.scrollBy(0,900)");
		 Thread.sleep(2000);
		 jse.executeAsyncScript("window.scrollBy(0,-500)");
		 Thread.sleep(2000);
		 jse.executeAsyncScript("window.scrollTo(600,800)");

	}

}

