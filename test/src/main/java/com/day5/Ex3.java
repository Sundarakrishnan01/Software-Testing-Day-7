package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement id1=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		id1.sendKeys("401");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
		
		Thread.sleep(5000);
		
		WebElement id2=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		id2.sendKeys("402");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.switchTo().alert().accept();
		
		String s=driver.switchTo().alert().getText();
		Thread.sleep(8000);
		
		System.out.println(s);
		driver.switchTo().alert().accept();
		
		
		
	}

}
