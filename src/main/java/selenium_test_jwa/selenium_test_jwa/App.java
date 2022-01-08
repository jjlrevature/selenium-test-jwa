package selenium_test_jwa.selenium_test_jwa;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.chromedriver().setup();
    	ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
    }
}
