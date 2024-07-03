package org.testngtask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TaskOfSimpleTest {
@Test
public void test() throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\"
			+ "SeleniumFirstDay\\drivers\\chromedriver.exe");

WebDriver d=new ChromeDriver();
d.get("https://www.youtube.com/");
d.manage().window().maximize();
d.findElement(By.id("input")).sendKeys("ashok",Keys.ENTER);
Thread.sleep(1000);
}
}
