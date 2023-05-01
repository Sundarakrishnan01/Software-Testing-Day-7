package com.day4;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Ex_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		driver.manage().window().maximize();
		
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("Sundarki");
		
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("Sundarki");
		
		WebElement mail=driver.findElement(By.id("input-email"));
		mail.sendKeys("sundarki@gmail.com");
		
		WebElement pwd=driver.findElement(By.id("input-password"));
		pwd.sendKeys("Sundarki@123");
		
		Thread.sleep(5000);
		driver.findElement(By.id("input-newsletter-yes")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(5000);
		
//		driver.findElement(By.className("btn-primary")).click();
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

}
