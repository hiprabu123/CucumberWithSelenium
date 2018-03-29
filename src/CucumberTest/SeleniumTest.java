/**
 * 
 */
package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author pp061306
 *
 */
public class SeleniumTest {

	/**
	 * @param args
	 */
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.id("")).click();
		driver.switchTo().alert().accept();
		
		//Explicit wait
		Thread.sleep(5000);
		driver.quit();
	}

}