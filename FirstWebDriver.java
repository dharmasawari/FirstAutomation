package com.ip.JuneWebdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.whiteboxqa.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("username")).sendKeys("dharmasawari@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("Lcpext17ma");
		driver.findElement(By.id("login")).click();
	
	
	
	}
	
}
