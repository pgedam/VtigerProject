package ReadData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ReadData3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final WebDriver driver;
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Data.properties");
		Properties p = new Properties();
		p.load(fis);
		String BROWSER = p.getProperty("browser");
		
		if(BROWSER.equals("Chrome")){
		 driver = new ChromeDriver();	
			
		}else if(BROWSER.equals("Firefox")) {
	     driver = new FirefoxDriver();		
		}else {
		 driver = new EdgeDriver();
			
		}
		
		
		

	}

}

