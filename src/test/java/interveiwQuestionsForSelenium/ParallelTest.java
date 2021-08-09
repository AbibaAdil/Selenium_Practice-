package interveiwQuestionsForSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utilities.ExtentTestNGITestListener.class)
public class ParallelTest {
	public WebDriver driver;

	@Test
	public void FirefoxTest() {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");

		// Initializing the firefox driver (Gecko)
		System.out.println("The thread ID for Firefox is " + Thread.currentThread().getId());
		driver = new FirefoxDriver();
		driver.get("https://www.demoqa.com");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		driver.quit();

	}

	@Test
	public void ChromeTest() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		// Initialize the chrome driver
		System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		driver.quit();
	}
}
