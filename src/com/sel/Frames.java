package com.sel;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		//Object creation- Browser Launch
		WebDriver driver=new ChromeDriver(); //upcasting
		
		//Pass the URL
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node05z4mvbp3y1j4tde0eocr7o5q7686971.node0");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[1]/iframe"));
		
		driver.switchTo().frame(single);
		
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();
		
		//MULTIPLE FRAME
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		
		driver.switchTo().frame(outer);
		
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
	//	driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[1]/input")).sendKeys("Arthi");
		
		
}
}
