package test.Day6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Ex_1 {
	WebDriver driver;
  @Test
  public void testTitle() {
	  String exp_title="Guest Registration Form – User Registration";
	  String act_title=driver.getTitle();
	  Assert.assertEquals(exp_title, act_title);
  }
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  
	  driver=new ChromeDriver();
	  driver.navigate().to("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
