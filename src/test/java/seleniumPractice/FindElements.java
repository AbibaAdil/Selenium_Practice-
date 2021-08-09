package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElements {
	// static WebDriver driver;

	@Test
	public void getUrl() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		String urlTitle =driver.getTitle();
		System.out.println(urlTitle);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("links size is:" + links.size());
		for (WebElement link : links) {

			String linkText = link.getText();
			

		}
		driver.close();
		driver.quit();

	}
}
