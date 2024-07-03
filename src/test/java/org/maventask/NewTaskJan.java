package org.maventask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTaskJan {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.dezlearn.com/webtable-example/");
	d.manage().window().maximize();
	
	WebElement findElement = d.findElement(By.xpath("//table[@class='tg']"));
	WebElement findElement2 = findElement.findElement(By.tagName("tr"));
	findElement.getSize();
	
}
}
