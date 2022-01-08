package selenium_test_jwa.selenium_test_jwa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		String browserName="chrome";
		WebDriver driver = null;
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jesse\\Code\\Extracted\\ChromeDriver\\chromedriver.exe");
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();			
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		
		// locators
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("google pixel");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
