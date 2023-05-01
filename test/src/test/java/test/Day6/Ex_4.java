package test.Day6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Ex_4 {
	WebDriver driver;
  @Test(priority=1)
  public void Test1() throws InterruptedException {
	  WebElement name=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	  name.sendKeys("Admin");
	  WebElement pwd=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	  pwd.sendKeys("admin123");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  System.out.print("Hello ");
	  String act="Dashboard";
	  Thread.sleep(2000);
	  System.out.print("World ");
	  String s=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
//	  String exp=c.getText();
	  System.out.println(s);
	  Assert.assertEquals(act, s);
//	  driver.close();
  }
  
  @Test(dependsOnMethods= {"Test1"})
  public void Test2() throws InterruptedException {


	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	  Thread.sleep(2000);
	  String s1="Login";
	  String s2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
	  Assert.assertEquals(s1, s2);
  }
  
  
  @BeforeClass
  public void beforeMethod() throws InterruptedException {

	  
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }

  @AfterClass
  public void afterMethod() {
	  driver.close();
  }

}
