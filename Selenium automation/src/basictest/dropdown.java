package basictest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class dropdown {
	WebDriver driver;
  @Test
  public void Applaunch() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "http://only-testing-blog.blogspot.com/";
		driver.get(url);
	  
	  
  }
  @Test
  public void selectlist() throws InterruptedException {
	 
   WebElement options = driver.findElement(By.xpath("(//select)[1]"));
   
   Select list1 = new Select(options);
   boolean list_multiple = list1.isMultiple();
   System.out.println("islist box allows multiple selection :"+list_multiple);
  list1.selectByIndex(1);
  Thread.sleep(2000);
  list1.selectByVisibleText("BMW");
  Select list2 = new Select(driver.findElement(By.xpath("(//select)")));
  
 //iterating through options 
  List<WebElement> e1 = list2.getOptions();
  
  for(int i=0;i<e1.size();i++) {
	  System.out.println(e1.size());
	  e1.get(i).click();
	  Thread.sleep(2000);
	  
  }
  
 
  }
}
