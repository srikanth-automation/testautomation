package basictest;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

//import junit.framework.Assert;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;
import org.openqa.selenium.support.ui.*;


public class NewTest {
	
	WebDriver driver;
	@Test(priority=1)
public void launch() throws InterruptedException { // this method launches and login to the application in Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	driver = new ChromeDriver();
	//System.setProperty("webdriver.edge.driver","C:\\Users\\User\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	//driver =new EdgeDriver();
	String url = "https://opensource-demo.orangehrmlive.com/";
	driver.get(url); 
	driver.findElement(By.xpath("//input[@id ='txtUsername']")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
	}
	@Test(priority=2)
	public void verifytilte() {	
	String expected ="OrangeHRM";
	String actualTitle ="";
	//WebElement  expected = driver.findElement(By.xpath("//*[title() = 'ORANGEHRM']"));
	 actualTitle = driver.getTitle();
	System.out.println(expected);
	Assert.assertEquals(actualTitle, expected);
	
	//assert.assertEquals(actualTitle, expected);
	//assertEquals(actual, expected, actual);
	//if((actualTitle.contentEquals(expected))){
     //System.out.println("title is matched");
	//}else {
     //System.out.println("title is not matched");
	//}
	}
	//System.out.println("title is:"+ driver.getTitle());
	@Test(priority=3)
	public void logout() throws InterruptedException {

	//driver.findElement(By.xpath("//div[@id='welcome-menu']")).click();
	driver.findElement(By.xpath("//a[@id='welcome']")).click();
	Thread.sleep(2000);
	WebElement logoff = driver.findElement(By.linkText("Logout")); // this works with linktext without xpath need to implement with "List"
	logoff.click();
	//WebElement allproduct = driver.findElement(By.xpath("//ul[@href='Logout']/li"));
	//allproduct.click();
	}
	@AfterTest
	public void teardown() {
	driver.close();
		
	}
	}
