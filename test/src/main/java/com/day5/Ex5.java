package com.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins*=");
		
//		driver.manage().window().maximize();
		
		String arr[]={"apple","selenium","Cucumber"};
		String wid[]=new String[3];
		String title[]=new String[3];
		
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.google.com/?q=" + arr[0]);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).submit();
			wid[0]=driver.getWindowHandle();
			title[0]=driver.getTitle();
			
			Thread.sleep(1000);
			
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver2=new FirefoxDriver();
			driver2.navigate().to("https://www.google.com/?q=" + arr[1]);
			driver2.manage().window().maximize();
			driver2.findElement(By.xpath("//*[@id=\"APjFqb\"]")).submit();
			wid[1]=driver2.getWindowHandle();
			title[1]=driver2.getTitle();
			
			Thread.sleep(1000);

			
			WebDriverManager.edgedriver().setup();
			WebDriver driver3=new EdgeDriver();
			driver3.navigate().to("https://www.google.com/?q=" + arr[2]);
			driver3.manage().window().maximize();
			driver3.findElement(By.xpath("//*[@id=\"APjFqb\"]")).submit();
			wid[2]=driver3.getWindowHandle();
			title[2]=driver3.getTitle();
			
			Thread.sleep(1000);
			
			

			
		
		for(int i=0;i<3;i++) {
			System.out.println(wid[i]);
		}
		for(int i=0;i<3;i++) {
			System.out.println(title[i]);
		}
		

	}

}
