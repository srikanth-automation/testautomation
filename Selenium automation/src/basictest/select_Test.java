package basictest;

import org.testng.annotations.Test;
import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class select_Test {
	WebDriver driver;
  @Test
  public void applaunch() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		driver.get(url);
  }
  
  @Test
  public void search_items() throws InterruptedException {
	  //id="nav-search-dropdown-card"
	  
	driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss'][//span[@class='a-button-inner']and[//input[@class='a-button-input']")).click();
	Thread.sleep(2000);
	//"//*[@id='  
	//lst-ib'][@class='  
	//gsfi lst-d-f']"));  
	
	
	  
	 //searchDropdownBox
  }
}
