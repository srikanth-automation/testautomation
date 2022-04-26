package action;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configReadExample.Readconfigdemo;
import io.github.bonigarcia.wdm.WebDriverManager;

//public class Basetest extends Readconfigdemo {
	
public class  Basetest {
WebDriver driver;


//Readconfigdemo rd= new Readconfigdemo();

@Test

public void Applaunch() {
	
//rd.launchappurl();
	
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
//String url ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
//driver.get("launchappurl");
}
@Test
public void login() {

String uname ="Admin";
String pwd ="admin123";
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);


//txtPassword
	
}

}


