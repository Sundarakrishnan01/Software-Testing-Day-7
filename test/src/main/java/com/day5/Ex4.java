package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins*=");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a")).click();
		WebElement source=driver.findElement(By.xpath("//*[@id=\"source\"]"));
		source.sendKeys("Coimbatore");
		
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
		dest.sendKeys("Chidambaram");
		
		
		
		
		
		
	}

}
