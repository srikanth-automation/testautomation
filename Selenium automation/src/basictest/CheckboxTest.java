package basictest;

import java.util.List; // need to discuss on element identification and scroll bar issue.

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CheckboxTest {
	WebDriver driver;
	@Test
	public void checkbox() throws InterruptedException {
		//WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String url = "http://only-testing-blog.blogspot.com/";
		driver.get(url);
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@='Testing']")).click();
		List<WebElement> list_checkbox = driver.findElements(By.xpath("//input[@name='vehicle']")); // this will
																									// identify the
																									// element
		System.out.println("number of available check boxes:" + list_checkbox.size());
		for (int i = 0; i < list_checkbox.size(); i++) { // This list iterate through the check boxes and perform the
															// select action
			System.out.println(list_checkbox.size());
			list_checkbox.get(i).click();
			// for(WebElement e:vehicles) {
			// WebElement select1 = driver.findElement(By.xpath("//input[@id='check1']"));
			// System.out.println(vehicles);
			// select1.click();
			// js.executeScript("arguments[0].scrollIntoView", list_checkbox); -- not working

		}

		// driver.findElement(By.xpath("//input[@id='check1']")).click();
		// Thread.sleep(2000);
		// WebElement select=
		// driver.findElement(By.xpath("//td[contains(text(),'Dog')/precedingsibling::td/input[@type='checkbox']"));
		// select.click();
	}
	@AfterTest
	public void teardown() {
	driver.close();
		
	}

}
