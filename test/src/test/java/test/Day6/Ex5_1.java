package test.Day6;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Ex5_1 {
	WebDriver driver;
  @Test(groups="SmokeTest")
  public void Test1() {
	  String actTitle=driver.getTitle();
	  String expTitle="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(actTitle, expTitle);
	  
	  String expUrl="https://www.godaddy.com/en-in";
	  String actUrl=driver.getCurrentUrl();
	  Assert.assertEquals(actUrl, expUrl);
  }
  
  @SuppressWarnings("deprecation")
  @Test(groups="Regression Testcase")	
  public void Test2() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
  }
  
  @Test(groups="Regression Testcase")
  public void Test3() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  String title=driver.getTitle();
	  System.out.println(title);
	  String exTitle="GoDaddy Domain Search - Buy and Register Available Domain Names";
	  Assert.assertEquals(title, exTitle);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.godaddy.com/");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
