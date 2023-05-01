package com.day4;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex5_2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://j2store.net/free/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Clothing (5)")).click();
		
		List<WebElement> arr=new ArrayList<WebElement>();
		arr=driver.findElements(By.xpath("//h2[@itemprop=\"name\"]"));
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).getText());
		}
		
		
		
		
	}
}
