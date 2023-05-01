package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("Sundarki");
		
		WebElement rmail=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		rmail.sendKeys("sundarki@gmail.com");
		
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		fname.sendKeys("Sundarki");
		
		WebElement mail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		mail.sendKeys("sundarki@gmail.com");
		
		Thread.sleep(2000);
		
		//*[@id="input-from-email"]
		
		driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]/label")).click();
		
		WebElement msg=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		msg.sendKeys("Vanakkam daa maapla chidambaram lerndhu");
		
		driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).clear();
		
		WebElement values=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		values.sendKeys("4");
		
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	}

}
