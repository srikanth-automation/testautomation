package orangeapplication;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configReadExample.Readconfigdemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hrmlogin {
	
	WebDriver driver;
	
@BeforeTest

public void Applaunch() throws IOException {
	
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
Readconfigdemo rd = new Readconfigdemo();

rd.launchappurl(); //method to launch the app
rd.username(); //method that enters user name to the user name field
rd.password(); //method that enters password to the password field

driver.get(rd.launchappurl());
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(rd.username());
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(rd.password());
driver.findElement(By.xpath("//input[@id='btnLogin')]")).click();
}




	


}
