package interveiwQuestionsForSelenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

@Listeners(utilities.ExtentTestNGITestListener.class)

public class HandleMultipleWindows {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com/");
		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> itrat = allWindows.iterator();
		while (itrat.hasNext()) {
			String child_window = itrat.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				Thread.sleep(4000);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		// switch to the parent window
		driver.switchTo().window(parent);
		driver.close();
	}

}
