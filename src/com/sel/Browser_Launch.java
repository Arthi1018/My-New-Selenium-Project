package com.sel;

import java.io.File;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_Launch {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		//Browser launch
		WebDriver driver=new ChromeDriver(); //upcasting
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//url launching
		driver.get("https://demoqa.com/alerts");
		
		//maximize the window
		driver.manage().window().maximize();
		
		WebElement alert = driver.findElement(By.id("timerAlertButton"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()", alert);
		
//		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wb.until(ExpectedConditions.alertIsPresent());
		
		FluentWait f=new FluentWait(driver);
		f.withTimeout(Duration.ofSeconds(10));
		f.pollingEvery(Duration.ofMillis(200));
		f.until(ExpectedConditions.alertIsPresent());
		f.ignoring(Exception.class);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
	}
}