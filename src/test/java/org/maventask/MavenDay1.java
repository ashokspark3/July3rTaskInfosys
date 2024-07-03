package org.maventask;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenDay1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	WebElement findElement = d.findElement(By.id("twotabsearchtextbox"));
	findElement.sendKeys("iphone14",Keys.ENTER);
	WebElement findElement2 = d.findElement(By.xpath("//span[contains(text(),'iPhone ')]"));
	findElement2.click();
	String pwindow1 = d.getWindowHandle();
	System.out.println(pwindow1);
	
	Set<String> pwindow = d.getWindowHandles();
	System.out.println(pwindow);
	for (String eachwindow : pwindow) {
		if (!pwindow1.equals(eachwindow)) {
			
			d.switchTo().window(eachwindow);
		}}
		Thread.sleep(1000);
		WebElement findElement3 = d.findElement(By.xpath("//span[contains(text(),'Add')]"));
		findElement3.click();
	}

//File f=new File("C:\\Users\\Asus\\eclipse-workspace\\MavenTask1\\src\\test\\resources\\ExcelFile\\Excel file11.xlsx")
}

