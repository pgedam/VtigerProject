package ReadData;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSscrollDoodle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 //jse.executeScript("window.alert('Good Morning')");
		
		for(;;) {
		 try {
			 
			 driver.findElement(By.xpath("//a[text()='Canada Day 2023']")).click(); 
			 break;
			 
		 }catch(NoSuchElementException e) {
			 jse.executeAsyncScript("window.scrollBy(0,900)");
				 
			 
		 }
		}

	}

}
