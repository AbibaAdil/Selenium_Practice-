package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedTest {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://indeed.com/");
	
	String homeUrl=driver.getCurrentUrl();
	System.out.println("homeUrl is: " + homeUrl);
	String homeTitle=driver.getTitle();
	System.out.println("homeTitle is: "+ homeTitle);
	Thread.sleep(2000);
	
	WebElement whatElem=driver.findElement(By.id("text-input-what"));
	whatElem.clear();
	whatElem.sendKeys("SDET");
	Thread.sleep(2000);
	
	WebElement whereElem=driver.findElement(By.id("text-input-where"));
	/*
	 * whereElem.sendKeys(Keys.CONTROL+"a"); whereElem.sendKeys(Keys.DELETE);
	 */
	whereElem.sendKeys(Keys.BACK_SPACE);
	whereElem.sendKeys("Washington, DC");
	
	WebElement findJobBtn=driver.findElement(By.xpath("//button[text()='Find jobs']"));
	findJobBtn.click();
	driver.close();
	
	//button[text()='Find jobs']
	
	/*
	 * 1.go to indeed.com 2. get the current URL and store it
	 * in a variable called homeURL. 3. get the website title and store it in a
	 * variable homeTitle. 4. find the input field for what and type SDET 5. find
	 * the input field for where, clear the field first and type washington DC 6.
	 * find the Find Jobs button and click on it. 7. get the current URL and store
	 * is a variable searchURL. 8. get the website title and store it in a variable
	 * searchTitle. 9. verify that searchURL does not equal to homeURL and contains
	 * the search criteria. 10. verify that searchTitle does not equal to homeTitle
	 * and has the search criteria. 11. Get Text of the JobsInLocation field, store
	 * it in a variable, then verify if it’s equals to your search criteria.
	 */
	

}
	}
