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
		driver.findElement(By.id("password")).sendKeys("Asa123!");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/aside/section/ul/div/a[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"books\"]/div/div/div/div/table/tbody/tr[1]/td[2]/a")).click();
		//*[@id="books"]/div/div/div/div/table/tbody/tr[1]/td[2]/a
		 driver.close();
	
	}
	
}
