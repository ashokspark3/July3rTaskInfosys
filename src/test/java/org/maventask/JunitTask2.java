package org.maventask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JunitTask2 {
	static WebDriver d;
	@BeforeClass
	public static void m1() {
		 d=new ChromeDriver();
		d.get("https://adactinhotelapp.com/index.php");
		d.manage().window().maximize();
	}
	@Before	
	public void m2() throws IOException {
TakesScreenshot  sc=(TakesScreenshot) d;
File sf = sc.getScreenshotAs(OutputType.FILE);
File df=new File("C:\\Users\\Asus\\Documents\\selenium Task\\Screen2.png");
FileUtils.copyFile(sf, df);
	}
	@Test
	public void m3() throws InterruptedException {
	WebElement user = d.findElement(By.id("username"));
	user.sendKeys("ashokspark");
	d.findElement(By.id("password")).sendKeys("96261304");
	d.findElement(By.id("login")).click();
	
	WebElement location = d.findElement(By.id("location"));
	Select select=new Select(location);
	select.selectByIndex(3);
	WebElement hotels = d.findElement(By.id("hotels"));
	Select select1=new Select(hotels);
	select1.selectByIndex(2);
	WebElement rme = d.findElement(By.id("room_type"));
	Select select2=new Select(rme);
	select2.selectByIndex(2);
	WebElement nofrme = d.findElement(By.id("room_nos"));
	Select select3=new Select(nofrme);
	select3.selectByIndex(2);
	WebElement datein = d.findElement(By.id("datepick_in"));
	datein.sendKeys("5/10/2023");
	d.findElement(By.id("datepick_out")).sendKeys("10/10/23");
	WebElement adultrme = d.findElement(By.id("adult_room"));
	Select select4=new Select(adultrme);
	select4.selectByIndex(2);
	WebElement childrme = d.findElement(By.id("child_room"));
	Select select5=new Select(childrme);
	select5.selectByIndex(1);
	d.findElement(By.id("Submit")).click();
	d.findElement(By.id("radiobutton_0")).click();
	d.findElement(By.id("continue")).click();
	d.findElement(By.id("first_name")).sendKeys("ashok");
	d.findElement(By.id("last_name")).sendKeys("av");
	d.findElement(By.id("address")).sendKeys("no 100,cuddalore,tn");
	d.findElement(By.id("cc_num")).sendKeys("1234561234561231");
	WebElement type = d.findElement(By.id("cc_type"));
	Select select6=new Select(type);
	select6.selectByIndex(2);
	WebElement expdate = d.findElement(By.id("cc_exp_month"));
	Select select7=new Select(expdate);
	select7.selectByIndex(3);
	WebElement expdate2 = d.findElement(By.id("cc_exp_year"));
	Select select8=new Select(expdate2);
	select8.selectByIndex(3);
	
	d.findElement(By.id("cc_cvv")).sendKeys("123");
	d.findElement(By.id("book_now")).click();
	Thread.sleep(10000);
	WebElement order = d.findElement(By.id("order_no"));
	String attribute = order.getAttribute("value");
    System.out.println(attribute);
	}
	
	
	@After
	public void m4() throws IOException {
		TakesScreenshot  sc=(TakesScreenshot) d;
		File sf = sc.getScreenshotAs(OutputType.FILE);
		File df=new File("C:\\Users\\Asus\\Documents\\selenium Task\\Screen3.png");
		FileUtils.copyFile(sf, df);
	}
	@AfterClass
	public static void m5() {
		//d.quit();
	

	}}


