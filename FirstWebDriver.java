package com.ip.JuneWebdriver;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstWebDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.whiteboxqa.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("username")).sendKeys("dharmasawari@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("Asa123!");
		driver.findElement(By.id("login")).click();
		
	Actions actions = new Actions(driver);
	
		WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/a"));
		actions.moveToElement(menuOption).perform();
		//WebElement subMenuOption =
				driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/ul/li[2]/a")).click(); 
		//actions.moveToElement(subMenuOption).click();
		//driver.findElement(By.className("dropdown-toggle")).click();
		//driver.findElement(By.className("dropdown-toggle")).click();
		//driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/aside/section/ul/div/a[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"books\"]/div/div/div/div/table/tbody/tr[1]/td[2]/a")).click();
		//*[@id="books"]/div/div/div/div/table/tbody/tr[1]/td[2]/a
		 //driver.close();
		//String Tab1 = driver.getWindowHandle(); 
		ArrayList<String> availableWindows = new ArrayList<String>(driver.getWindowHandles()); 
		if (!availableWindows.isEmpty()) { 
		driver.switchTo().window(availableWindows.get(1)); 
		}
		
		 actions.pause(5000);
		 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/div[2]/div[2]/div[3]")).click(); 
		//actions.moveByOffset(10000, 0).click();
		System.out.println("Done");
		
	}
	
}
