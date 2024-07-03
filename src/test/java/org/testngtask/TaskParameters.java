package org.testngtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TaskParameters {
	@Parameters({"username","password"})
	@Test
	public void add(String user,String pass)
	{
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.id("email")).sendKeys(user);
		d.findElement(By.id("pass")).sendKeys(pass);
	}

}
